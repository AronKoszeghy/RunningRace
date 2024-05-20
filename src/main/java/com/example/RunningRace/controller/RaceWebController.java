package com.example.RunningRace.controller;

import com.example.RunningRace.model.Race;
import com.example.RunningRace.model.Result;
import com.example.RunningRace.repository.RaceRepository;
import com.example.RunningRace.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Comparator;
import java.util.stream.Collectors;

@Controller
public class RaceWebController {

    @Autowired
    RaceRepository raceRepository;

    @Autowired
    ResultRepository resultRepository;

    @GetMapping("/")
    public String returnToRaces() {
        return "redirect:/races";
    }

    @GetMapping("/races")
    public String listRaces(Model model) {
        model.addAttribute("races", raceRepository.findAll());
        return "races";
    }

    @GetMapping("/race/{id}")
    public String viewRaceDetails(@PathVariable int id, Model model) {
        Race race = raceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Race not found with ID: " + id));

        model.addAttribute("results", resultRepository.findAll()
                .stream()
                .filter(result -> result.getRaceId() == id)
                .sorted(Comparator.comparingInt(Result::getTimeInMin))
                .collect(Collectors.toList()));
        return "raceDetails";
    }

}
