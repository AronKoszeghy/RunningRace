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

//	@GetMapping("/getRunners")
//	public Collection<Runner> getRunners() {
//		return runners.values();
//	}

//	@PostMapping("/addRunner")
//	public void addRunner(@RequestBody Runner runner) {
//		runners.put(runner.getId(), runner);
//	}

//	@GetMapping("/getRaceRunners/{raceId}")
//	public List<Result> getRaceRunners(@PathVariable("raceId") int raceId) {
//		List<Result> raceResults = new ArrayList<>();
//		for (Result result : results) {
//			if (result.getRace().getId() == raceId) {
//				raceResults.add(result);
//			}
//		}
//		raceResults.sort(Comparator.comparingInt(Result::getTimeInMin));
//		return raceResults;
//	}
//
//	@PostMapping("/updateRace")
//	public void updateRace(@RequestBody Race race) {
//		races.put(race.getId(), race);
//	}
//
//	@PostMapping("/addResult")
//	public void addResult(@RequestBody Result result) {
//		results.add(result);
//	}
//
//	@GetMapping("/getAverageTime/{raceId}")
//	public double getAverageTime(@PathVariable("raceId") int raceId) {
//		List<Result> raceResults = getRaceRunners(raceId);
//		int totalTime = 0;
//		for (Result result : raceResults) {
//			totalTime += result.getTimeInMin();
//		}
//		return (double) totalTime / raceResults.size();
//	}

}
