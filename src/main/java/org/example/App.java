package org.example;

import org.example.repository.Coach;
import org.example.service.BaseballCoach;
import org.example.service.TrackCoach;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Coach baseballCoach = new BaseballCoach();
        System.out.println(baseballCoach.getDailyWorkout());
        Coach trackCoach = new TrackCoach();
        System.out.println(trackCoach.getDailyWorkout());
        System.out.println("New changes");
    }
}
