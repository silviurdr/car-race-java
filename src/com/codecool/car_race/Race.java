package com.codecool.car_race;

import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Truck;

public class Race {

    private int racingHours = 50;

    /**
     * Simulates the passing of time by advancing the weather and
     * moving the vehicles for the duration of a whole race.
     */

    public void simulateRace() {
    }

    public void registerRacer(Car carut) {

        Car firstCar = new Car();
        Car.giveCarName();
        System.out.println("Car name: " + firstCar.giveCarName());
        System.out.println("Car normal speed: " + firstCar.normalSpeed);
    }

    public void registerRacer(Truck tracut) {

        Truck truck1 = new Truck();
        System.out.println("Truck name: " + tracut.getTruckname());
        System.out.println("Truck normal speed: " + tracut.normalSpeed);
    }


    /**
     * Prints the state of all vehicles. Called at the end of the
     * race.
     */
    public void printRaceResults() {
    }

}
