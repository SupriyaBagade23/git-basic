package org.example.service;

import org.example.repository.Coach;
import org.example.repository.FortuneRepository;

public class BaseballCoach implements Coach {
    private FortuneRepository fortuneRepository;

    public BaseballCoach() {
    }

    public BaseballCoach(FortuneRepository fortuneRepository) {
        this.fortuneRepository = fortuneRepository;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneRepository.getFortune() + " Keep going!";
    }
}
