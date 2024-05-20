package com.example.RunningRace.repository;

import com.example.RunningRace.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RaceRepository extends JpaRepository<Race, Integer> {
}
