/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vandu.model;

/**
 *
 * @author Văn Dự
 */
public class Grade {
    private int id;
    private String idStudent;
    private String fullname;
    private double english;
    private double java;
    private double sql;
    private double avg;

 

    public Grade() {
    }

    public Grade(int id, String idStudent, String fullname, double english, double java, double sql, double avg) {
        this.id = id;
        this.idStudent = idStudent;
        this.fullname = fullname;
        this.english = english;
        this.java = java;
        this.sql = sql;
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public double getSql() {
        return sql;
    }

    public void setSql(double sql) {
        this.sql = sql;
    }

    @Override
    public String toString() {
        return "Grade{" + "id=" + id + ", idStudent=" + idStudent + ", fullname=" + fullname + ", english=" + english + ", java=" + java + ", sql=" + sql + ", avg=" + avg + '}';
    }

    
    
}
