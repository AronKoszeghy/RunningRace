package com.example.RunningRace.model;

public class Result {

    private Race race;
    private Runner runner;
    private int time;

    public Result(Race race, Runner runner, int time) {
        this.race = race;
        this.runner = runner;
        this.time = time;
    }

    public Race getRace() {
        return race;
    }

    public Runner getRunner() {
        return runner;
    }

    public int getTime() {
        return time;
    }
}
