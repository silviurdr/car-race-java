package com.codecool.car_race.vehicles;

import com.codecool.car_race.Vehicle;

import java.util.Random;

public class Truck extends Vehicle {


    public Truck() {
        setName();
        setNormalSpeed();
    }

    @Override
    public void setNormalSpeed() {
        this.normalSpeed = 100;
    }

    @Override
    public void setName() {
        Random rand = new Random();
        this.name = String.valueOf(rand.nextInt(1000));
    }

    @Override
    public void prepareForLap() {

    }


    public String getTruckname() {
        return this.name;
    }
}
