package com.example.aula7.sqlite.Models;

/**
 * Created by aula7 on 19/10/17.
 */

public class RegisterModel {
    private int id;
    private String name;
    private String phone;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

