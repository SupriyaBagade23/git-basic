package org.example.service;

import org.example.repository.FortuneRepository;

public class HappyFortuneService implements FortuneRepository {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
