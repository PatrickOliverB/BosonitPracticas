package com.example.block6pathvariableheaders;

import org.springframework.stereotype.Component;

import javax.annotation.processing.Generated;

@Component
public class User {

    private int id;
    private String name;

    public User(){

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
