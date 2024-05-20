package com.example.RunningRace.repository;

import com.example.RunningRace.model.Result;
import com.example.RunningRace.model.ResultKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result, ResultKey> {



}
