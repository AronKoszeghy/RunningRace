package com.example.RunningRace.controller;

import com.example.RunningRace.model.Race;
import com.example.RunningRace.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/races")
public class RaceController {

    @Autowired
    RaceRepository raceRepository;

    @PostMapping("/addRace")
    public Race addRace(@RequestBody Race race) {
        raceRepository.save(race);
        return race;
    }

    @PostMapping("/updateRace")
    public Race updateRace(@RequestBody Race raceReceived) {
        Race race = raceRepository.findById(raceReceived.getId())
                .orElseThrow(() -> new RuntimeException("Race not found with ID: " + raceReceived.getId()));
        race.setName(raceReceived.getName());
        race.setDistanceInKM(raceReceived.getDistanceInKM());
        return raceRepository.save(race);
    }

//    @PutMapping("/updateBasketName/{basketId}")
//    public BasketEntity updateBasketName(@PathVariable Long basketId, @RequestBody String name) {
//        BasketEntity basket = basketRepository.findById(basketId)
//                .orElseThrow(() -> new RuntimeException("Basket not found with ID: " + basketId));
//        basket.setBasketName(name);
//        return basketRepository.save(basket);
//    }


}
