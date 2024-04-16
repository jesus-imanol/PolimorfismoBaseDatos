package com.jesuscast.polimorfismo.models;
import com.jesuscast.polimorfismo.App;

import java.util.ArrayList;

public class MariaDB implements IBaseDatos {
    private ArrayList<Student> studentsMaria= new ArrayList<>();
    @Override
    public boolean addStudent(Student student){
        System.out.println("MariaDB");
        boolean status;
        status=studentsMaria.add(student);
        return status;
    }

    @Override
    public boolean updateStudent(Student student,int posicion) {
        studentsMaria.set(posicion,student);
        return true;
    }

    @Override
    public ArrayList<Student> getStudents() {
        return studentsMaria;
    }
}
