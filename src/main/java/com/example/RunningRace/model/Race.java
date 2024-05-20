package com.example.RunningRace.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int distanceInKM;


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
