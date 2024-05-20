package com.example.RunningRace.model;

public class Race {

    private int id;
    private String name;
    private int distanceInKM;

    public Race(int id, String name, int distanceInKM) {
        this.id = id;
        this.name = name;
        this.distanceInKM = distanceInKM;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDistanceInKM() {
        return distanceInKM;
    }
}
