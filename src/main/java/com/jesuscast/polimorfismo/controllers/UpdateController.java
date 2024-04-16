package com.jesuscast.polimorfismo.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jesuscast.polimorfismo.App;
import com.jesuscast.polimorfismo.models.Student;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class UpdateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitBtn;
    @FXML
    private Button mariaDBBtn;
    @FXML
    private Button phpMyAdminBtn;

    @FXML
    private Button upSQLBtn;
    @FXML
    private TextField idSearchInput;

    @FXML
    private TextField lastNameInput;

    @FXML
    private TextField nameInput;

    @FXML
    private Button updateStudent;

    @FXML
    void onClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void onClickUpdateStudent(MouseEvent event) {
        System.out.println("Hola");
        ArrayList<Student> students;
        students= App.getUniversidad().getMariaDB().getStudents();
        String id = idSearchInput.getText();
        String lastName = lastNameInput.getText();
        String name = nameInput.getText();
        boolean flag = false;
        System.out.println(students.get(0));
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                flag = true;
                Student student=new Student(name,id,lastName);
                App.getUniversidad().sendUpdateStudent(student,i);
            }
            else {
                System.out.println(students.get(i));
            }

        }
        if (flag==false) {
            System.out.println("No se encontro el id del student");
        }
    }

    @FXML
    void onClickViewMariaDB(MouseEvent event) {
        App.newStage("mariadb-view","Ver registro");
    }

    @FXML
    void onClickViewPhpMyAdmin(MouseEvent event) {
        App.newStage("phpMyAdmin-view","Ver registro");
    }

    @FXML
    void onClickViewUPSQL(MouseEvent event) {
        App.newStage("upsql-view","Ver registro en UPSQL");
    }

    @FXML
    void initialize() {

    }

}
