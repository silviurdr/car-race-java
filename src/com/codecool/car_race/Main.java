package com.codecool.car_race;


import com.codecool.car_race.vehicles.Car;
import com.codecool.car_race.vehicles.Truck;

public class Main {

    /**
     * Creates all the vehicles that will be part of this race.
     */
    private static void createVehicles(Race race) {

        Truck truck1 = new Truck();
        race.registerRacer(truck1);
        Car car1 = new Car();
        race.registerRacer(car1);

    }

    /**
     * Entry point of our program. Creates one race instance and
     * uses that.
     * <p>
     *
     * @param args commandline arguments passed to the program.
     *             It is unused.
     */
    public static void main(String[] args) {
        Race race = new Race();
        createVehicles(race);


        race.simulateRace();
        race.printRaceResults();

    }
}
