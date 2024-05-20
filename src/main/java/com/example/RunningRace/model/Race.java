package com.example.RunningRace.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int distanceInKM;

    @OneToMany(mappedBy = "race")
    Set<Result> results;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDistanceInKM() {
        return distanceInKM;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistanceInKM(int distanceInKM) {
        this.distanceInKM = distanceInKM;
    }
}
