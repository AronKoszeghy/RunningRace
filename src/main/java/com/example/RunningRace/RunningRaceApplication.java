package com.example.RunningRace;

import com.example.RunningRace.model.Race;
import com.example.RunningRace.model.Result;
import com.example.RunningRace.model.Runner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class RunningRaceApplication {

	private Map<Integer, Runner> runners = new HashMap<>();
	private Map<Integer, Race> races = new HashMap<>();
	private List<Result> results = new ArrayList<>();

	public static void main(String[] args) {
		SpringApplication.run(RunningRaceApplication.class, args);
	}

}
