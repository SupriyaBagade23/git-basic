package org.example.service;

import org.example.repository.Coach;
import org.example.repository.FortuneRepository;

public class CricketCoach implements Coach {
    private FortuneRepository fortuneRepository;

    public CricketCoach(FortuneRepository fortuneRepository) {
        this.fortuneRepository = fortuneRepository;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 2 hours on bowling practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneRepository.getFortune();
    }
}
