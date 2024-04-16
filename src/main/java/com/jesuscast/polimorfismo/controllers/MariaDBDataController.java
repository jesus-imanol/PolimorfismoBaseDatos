package com.jesuscast.polimorfismo.controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.jesuscast.polimorfismo.App;
import com.jesuscast.polimorfismo.models.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MariaDBDataController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button exitBtn;

    @FXML
    private TableColumn idColumn;

    @FXML
    private TableColumn lasNameColumn;

    @FXML
    private TableColumn nameColumn;

    @FXML
    private TableView<Student> studentsTable;
    private ObservableList<Student> studentsObservableList;

    @FXML
    void onMouseClickExit(MouseEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void initialize() {
        studentsObservableList = FXCollections.observableArrayList();
        ArrayList<Student> students;
        students= App.getUniversidad().getMariaDB().getStudents();
        this.nameColumn.setCellValueFactory(new PropertyValueFactory("name"));
        this.idColumn.setCellValueFactory(new PropertyValueFactory("id"));
        this.lasNameColumn.setCellValueFactory(new PropertyValueFactory("apellido"));
        for(short i=0; i<students.size(); i++){
            if(students.get(i).isStatus()){
                studentsObservableList.add(students.get(i));
            }
        }
        studentsTable.setItems(studentsObservableList);

    }

}

