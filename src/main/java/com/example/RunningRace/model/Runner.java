package com.example.RunningRace.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Runner {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int age;
    private String sex;

    @OneToMany(mappedBy = "runner")
    Set<Result> results;

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
