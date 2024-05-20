package com.example.RunningRace.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ResultKey implements Serializable {

    @Column(name="race_id")
    int raceId;

    @Column(name="runner_id")
    int runnerId;

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultKey resultKey = (ResultKey) o;
        return raceId == resultKey.raceId && runnerId == resultKey.runnerId;
    }

    public int hashCode() {
        return Objects.hash(raceId, runnerId);
    }

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
}
