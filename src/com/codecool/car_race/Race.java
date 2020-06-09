package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Random;

public class Race {


    private static boolean isYellowFlag;
    private ArrayList<Vehicle> allRacers=new ArrayList<>();

    public static boolean isItRaining() {
        Random rand=new Random();
        int rainingMaybe=rand.nextInt(99);
        if (rainingMaybe < 30) {
            return true;
        } else return false;
    }

    public static boolean getIsYellowFlag() {
        return isYellowFlag;
    }

    public static void setIsYellowFlag(boolean yellowFlagActive) {
        isYellowFlag=yellowFlagActive;
    }

    public void registerRacer(Vehicle racer) {
        allRacers.add(racer);
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */

    public void simulateRace() {


        int hours=0;

        while (hours < 50) {
            for (Vehicle racer : allRacers) {
                racer.prepareForLap();
            }
            hours++;
        }
    }


    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        for (Vehicle racer : allRacers) {
            System.out.println(" " + racer.getName() + " travelled: " + racer.getDistanceTravel() + "km");
        }

    }

}
