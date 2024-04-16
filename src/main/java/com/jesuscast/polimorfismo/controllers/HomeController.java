package com.jesuscast.polimorfismo.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jesuscast.polimorfismo.App;
import com.jesuscast.polimorfismo.models.*;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class HomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button PHPMyAdminBtn1;

    @FXML
    private Button UPSQLBtn;
    @FXML
    private Button updateRegister;
    @FXML
    private TextField idInput;

    @FXML
    private TextField lastNameInput;

    @FXML
    private Button mongoDBBtn;

    @FXML
    private TextField nameInput;

    @FXML
    private Button registerBtn;

   private Universidad universidad;



    @FXML
    void onClickMongoDB(MouseEvent event) {
        App.newStage("mariadb-view","Ver registro");
    }

    @FXML
    void onClickPHPMyAdmin(MouseEvent event) {
        App.newStage("phpMyAdmin-view","Ver registro");
    }
    @FXML
    void onClickUpdateRegister(MouseEvent event) {
        App.newStage("update-register-view","Actualizar registro");
    }


    @FXML
    void onClickRegisterBtn(MouseEvent event) {
        if(idInput.getText().trim().isEmpty() ||
        nameInput.getText().trim().isEmpty() || lastNameInput.getText().trim().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("Por favor completa los campos");
            alert.showAndWait();
        }
        else {
            ArrayList<Student> students =App.getUniversidad().getMariaDB().getStudents();
            boolean flag = false;
            for (int i = 0; i < students.size() && !flag; i++) {
                if(students.get(i).getId().equals(idInput.getText().trim())){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Esta matricula ya existe");
                    alert.showAndWait();
                    flag = true;
                }
            }
            if(flag==false){
                    Student estudiante=new Student(nameInput.getText(),idInput.getText(),lastNameInput.getText());
                    App.getUniversidad().sendStudent(estudiante);

            }

        }
    }

    @FXML
    void onClickUPSQL(MouseEvent event) {
        App.newStage("upsql-view","Ver registro en UPSQL");

    }

    @FXML
    void initialize() {
        universidad=new Universidad();
    }

}
