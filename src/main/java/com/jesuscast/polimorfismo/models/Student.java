package com.jesuscast.polimorfismo.models;

public class Student {
   private String name;
   private String id;
   private String apellido;
   private boolean status;

    public Student(String name, String id, String apellido) {
        this.name = name;
        this.id = id;
        this.apellido = apellido;
        this.status = true;
    }
    public Student(){

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
