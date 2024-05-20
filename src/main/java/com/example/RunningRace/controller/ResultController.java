package com.example.RunningRace.controller;

import com.example.RunningRace.model.Result;
import com.example.RunningRace.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {

    @Autowired
    ResultRepository resultRepository;

    @GetMapping("/getResults")
    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    @PostMapping("/addResult")
    public Result addResult(@RequestBody Result result) {
        resultRepository.save(result);
        return result;
    }

}
