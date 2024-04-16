package com.jesuscast.polimorfismo.models;

import com.jesuscast.polimorfismo.App;
import javafx.scene.control.Alert;

import java.util.ArrayList;

public class PHPMyAdmin implements IBaseDatos{
    private ArrayList<Student> studentsPHP = new ArrayList<>();
    @Override
    public boolean addStudent(Student student){
        System.out.println("PHPMyAdmin");
        boolean status;
        status = studentsPHP.add(student);
        return status;

    }

    @Override
    public boolean updateStudent(Student student,int posicion) {
        studentsPHP.set(posicion,student);
        return true;
    }

    @Override
    public ArrayList<Student> getStudents() {
        return studentsPHP;
    }
}
