package com.codecool.car_race;

import java.util.ArrayList;
import java.util.Random;

public class Race {


    private int yellowFlagHours = 0;
    private ArrayList<Vehicle> allRacers=new ArrayList<>();

    private boolean isItRaining() {
        Random rand=new Random();
        int rainingMaybe=rand.nextInt(99);
        if (rainingMaybe < 30) {
            return true;
        } else return false;
    }

    private boolean didTheTruckBroke() {
        Random rand=new Random();
        int maybeBrokenTruck=rand.nextInt(99);
        if (maybeBrokenTruck < 5) {
            return true;
        } else return false;
    }

    public void registerRacer(Vehicle racer) {
        allRacers.add(racer);
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */

    public void simulateRace() {

        Random decreaseMotorcycleSpeed=new Random();

        int hours = 0;

        while (hours < 50) {
            boolean lapRain=isItRaining();
            System.out.println(yellowFlagHours);
            if (yellowFlagHours > 0) {
                yellowFlagHours--;
            }
            for (Vehicle racer : allRacers) {
                if (racer.vehicleType == "Motor") {
                    if (lapRain) {
                        racer.prepareForLap(racer.normalSpeed - decreaseMotorcycleSpeed.nextInt(50 - 5) + 5);
                    } else racer.prepareForLap(racer.normalSpeed);
                } else if (racer.vehicleType == "Car") {
                    if (yellowFlagHours == 0) {
                        racer.prepareForLap(racer.normalSpeed);
                    } else if (yellowFlagHours > 0) {
                        racer.prepareForLap(racer.getYellowFlagSpeed());
                    }
                } else if (racer.vehicleType == "Truck") {
                    if (racer.getHoursBroken() == 0) {

                        boolean brokenTruck=didTheTruckBroke();
                        if (brokenTruck) {
                            yellowFlagHours=2;
                            racer.prepareForLap(0);
                            racer.setHoursBroken(2);
                            racer.decreaseHoursBroken();
                        } else {
                            racer.prepareForLap(racer.normalSpeed);
                        }
                    } else {
                        racer.prepareForLap(0);
                        racer.decreaseHoursBroken();
                    }
                }
                racer.moveForAnHour();
            }
            hours+=1;
        }

    }


    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        for (Vehicle racer : allRacers) {
            System.out.println(racer.getVehicleType() + " " + racer.getName() + " travelled: " + racer.getDistanceTravel() + "km");
        }

    }

}
