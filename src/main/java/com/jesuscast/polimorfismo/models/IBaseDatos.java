package com.jesuscast.polimorfismo.models;

import java.util.ArrayList;

public interface IBaseDatos {
    boolean addStudent(Student student);
    boolean updateStudent(Student student,int posicion);
    ArrayList<Student> getStudents();
}
