package com.codecool.car_race.vehicles;

import com.codecool.car_race.Race;
import com.codecool.car_race.Vehicle;
import com.codecool.car_race.Randomizer;

import java.util.Random;

public class Motorcycle extends Vehicle {

    private int motorNumber=0;

    public Motorcycle(int num) {

        normalSpeed=100;
        this.setMotorcycleName(num);
    }

    private int setRainingMotorcycleSpeed() {
        int motorRainyHighSpeed=50;
        int motorRainyLowSpeed=5;
        int motorRainySpeed = Randomizer.getRandomValue(motorRainyHighSpeed, motorRainyLowSpeed);
        return motorRainySpeed;
    }


    public void setMotorcycleName(int motorNumber) {
        this.name="Motorcycle " + motorNumber;
    }

    @Override
    public void setName() {
        this.name="Motorcycle " + motorNumber;
    }

    @Override
    public void prepareForLap() {
        if (Race.isItRaining()) {
            this.setActualSpeed(setRainingMotorcycleSpeed());
        } else {
            this.setActualSpeed(normalSpeed);
        }
        this.setDistanceTravel(this.getActualSpeed());
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
    }

}
