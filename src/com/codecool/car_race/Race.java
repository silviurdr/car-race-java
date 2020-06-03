package com.codecool.car_race;

import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Motorcycle;
import com.codecool.car_race.vehicles.Truck;

import java.util.ArrayList;
import java.util.Random;

public class Race {

    private ArrayList<Vehicle> allRacers = new ArrayList<>();


    private boolean isItRaining() {
        Random rand = new Random();
        int rainingMaybe = rand.nextInt(99);
        if (rainingMaybe < 30) {
            return true;
        } else return false;
    }

    private boolean didTheTruckBroke() {
        Random rand = new Random();
        int maybeBrokenTruck = rand.nextInt(99);
        if (maybeBrokenTruck < 5) {
            return true;
        } else return false;
    }

    int yellowFlagHours = 0;

    public void registerRacer(Vehicle racer) {
        allRacers.add(racer);
    }

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */

    public void simulateRace() {

        Random decreaseMotorcycleSpeed = new Random();

        int hours = 0;

        while (hours < 50) {
            boolean lapRain = isItRaining();
            for (Vehicle racer: allRacers) {
                if (yellowFlagHours > 0) {
                    yellowFlagHours--;
                }
                if (racer.vehicleType == "Motor") {
                    if (lapRain) {
                        racer.prepareForLap(racer.normalSpeed - decreaseMotorcycleSpeed.nextInt(50 - 5) + 5);
                    } else racer.prepareForLap(racer.normalSpeed);
                } else if (racer.vehicleType == "Car") {
                    if (yellowFlagHours == 0) {
                        racer.prepareForLap(racer.normalSpeed);
                    } else if (yellowFlagHours > 0) {
                        System.out.println("ceva e stricat");
                        racer.prepareForLap(racer.getYellowFlagSpeed());
                    }
                } else if (racer.vehicleType == "Truck") {
                    boolean brokenTruck = didTheTruckBroke();
                    if (brokenTruck) yellowFlagHours = 2;
                    racer.prepareForLap(racer.normalSpeed);
                }
                racer.moveForAnHour();
            }
            hours += 1;
        }

    }


    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
        for (Vehicle racer: allRacers) {
            System.out.println(racer.getVehicleType() + " " + racer.getName() + " travelled: " + racer.getDistanceTravel() + "km");
        }

    }

}
