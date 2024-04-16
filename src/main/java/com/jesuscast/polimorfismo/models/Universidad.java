package com.jesuscast.polimorfismo.models;

import com.jesuscast.polimorfismo.App;

import java.util.ArrayList;

public class Universidad {
    private IBaseDatos phpMyAdmin=new PHPMyAdmin();
    private IBaseDatos mariaDB=new MariaDB();
    private IBaseDatos upSQL=new UPSQL();

    public boolean sendStudent(Student student){
        if(phpMyAdmin.addStudent(student)&&upSQL.addStudent(student)&&mariaDB.addStudent(student)){
            System.out.printf("Registro guardado exitosamente\n");
            return true;
        }
        else {
            return false;
        }
    }

    public IBaseDatos getMariaDB() {
        return mariaDB;
    }

    public IBaseDatos getPhpMyAdmin() {
        return phpMyAdmin;
    }
    public IBaseDatos getUPSQL() {
        return upSQL;
    }

    public boolean sendUpdateStudent(Student student,int posicion){
        if (mariaDB.updateStudent(student,posicion)&&phpMyAdmin.updateStudent(student,posicion)&&
                upSQL.updateStudent(student,posicion)){
            return true;
        }
        else {
            return false;
        }

    }


}
