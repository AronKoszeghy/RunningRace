package com.example.RunningRace;

import com.example.RunningRace.model.Race;
import com.example.RunningRace.model.Result;
import com.example.RunningRace.model.Runner;
import com.example.RunningRace.repository.RaceRepository;
import com.example.RunningRace.repository.ResultRepository;
import com.example.RunningRace.repository.RunnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private RaceRepository raceRepository;

    @Autowired
    private ResultRepository resultRepository;

    @Autowired
    private RunnerRepository runnerRepository;

    @Override
    public void run(String... args) throws Exception {
        Runner runner1 = new Runner();
        runner1.setName("Mari");
        runner1.setAge(70);
        runner1.setSex("f");

        Runner runner2 = new Runner();
        runner2.setName("Feri");
        runner2.setAge(65);
        runner2.setSex("m");

        Runner runner3 = new Runner();
        runner3.setName("Hilda");
        runner3.setAge(60);
        runner3.setSex("f");

        Runner runner4 = new Runner();
        runner4.setName("Imre");
        runner4.setAge(55);
        runner4.setSex("m");

        Race race1 = new Race();
        race1.setName("Maraton");
        race1.setDistanceInKM(42);

        Race race2 = new Race();
        race2.setName("Felmaraton");
        race2.setDistanceInKM(21);

        Result result1 = new Result();
        result1.setRaceId(1);
        result1.setRunnerId(1);
        result1.setTimeInMin(30);

        Result result2 = new Result();
        result2.setRaceId(1);
        result2.setRunnerId(2);
        result2.setTimeInMin(35);

        Result result3 = new Result();
        result3.setRaceId(1);
        result3.setRunnerId(3);
        result3.setTimeInMin(26);

        Result result4 = new Result();
        result4.setRaceId(2);
        result4.setRunnerId(1);
        result4.setTimeInMin(43);

        Result result5 = new Result();
        result5.setRaceId(2);
        result5.setRunnerId(2);
        result5.setTimeInMin(30);

        Result result6 = new Result();
        result6.setRaceId(2);
        result6.setRunnerId(3);
        result6.setTimeInMin(32);
    }
}

