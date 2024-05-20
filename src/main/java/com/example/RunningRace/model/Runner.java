package com.example.RunningRace.model;

import jakarta.persistence.Entity;

@Entity
public class Runner {

    private int id;
    private String name;
    private int age;
    private String sex;

    public Runner(int id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
