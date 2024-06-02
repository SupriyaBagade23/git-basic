package org.example.service;

import org.example.repository.Coach;
import org.example.repository.FortuneRepository;

public class TrackCoach implements Coach {
    private FortuneRepository fortuneRepository;

    public TrackCoach() {
    }

    public TrackCoach(FortuneRepository fortuneRepository) {
        this.fortuneRepository = fortuneRepository;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just do it: " + fortuneRepository.getFortune();
    }
}
