package com.jesuscast.polimorfismo.models;

import com.jesuscast.polimorfismo.App;

import java.util.ArrayList;

public class UPSQL implements IBaseDatos {
    private ArrayList<Student> studentsUP= new ArrayList<>();
    @Override
    public boolean addStudent(Student student){
        System.out.println("UPSQL");
        boolean status;
        status=studentsUP.add(student);
        return status;
    }

    @Override
    public boolean updateStudent(Student student,int posicion) {
        studentsUP.set(posicion,student);
        return true;
    }

    @Override
    public ArrayList<Student> getStudents() {
        return studentsUP;
    }
}
