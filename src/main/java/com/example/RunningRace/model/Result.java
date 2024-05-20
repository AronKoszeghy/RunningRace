package com.example.RunningRace.model;

import jakarta.persistence.*;

@Entity
@IdClass(ResultKey.class)

public class Result {

    @Id
    private int raceId;

    @Id
    private int runnerId;

    @ManyToOne
    @MapsId("raceId")
    @JoinColumn(name = "race_id")
    Race race;

    @ManyToOne
    @MapsId("runnerId")
    @JoinColumn(name = "runner_id")
    Runner runner;

    private int timeInMin;

    public int getRaceId() {
        return raceId;
    }

    public void setRaceId(int raceId) {
        this.raceId = raceId;
    }

    public int getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(int runnerId) {
        this.runnerId = runnerId;
    }

    public int getTimeInMin() {
        return timeInMin;
    }

    public void setTimeInMin(int timeInMin) {
        this.timeInMin = timeInMin;
    }
}
