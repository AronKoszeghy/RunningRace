package com.example.RunningRace.controller;

import com.example.RunningRace.model.Runner;
import com.example.RunningRace.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/runners")
public class RunnerController {

    @Autowired
    RunnerRepository runnerRepository;

    @GetMapping("/getRunners")
    public List<Runner> getAllRunners() {
        return runnerRepository.findAll();
    }

    @PostMapping("/addRunner")
    public Runner addRunner(@RequestBody Runner runner) {
        runnerRepository.save(runner);
        return runner;
    }

}
