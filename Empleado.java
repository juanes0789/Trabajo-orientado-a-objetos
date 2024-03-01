/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotelfollowers;

/**
 *
 * @author estudiantelis
 */
public class Empleado {
    private String name;
    private int id;
    private int phoneNo;
    private String location;
    private String role;
    private String schedule;

    public Empleado() {
    }

    public Empleado(String name, int id, int phoneNo, String location, String role, String schedule) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
        this.location = location;
        this.role = role;
        this.schedule = schedule;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Empleado{" + "name=" + name + ", id=" + id + ", phoneNo=" + phoneNo + ", location=" + location + ", role=" + role + ", schedule=" + schedule + '}';
    }
    



    
    
    
    
}
