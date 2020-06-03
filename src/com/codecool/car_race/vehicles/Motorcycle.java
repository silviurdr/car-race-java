package com.codecool.car_race.vehicles;

import com.codecool.car_race.Vehicle;

public class Motorcycle extends Vehicle {


    public Motorcycle(int num) {

        this.setMotorcycleName(num);
        this.setNormalSpeed();
    }

    @Override
    public void setNormalSpeed() {
        this.normalSpeed = 100;
    }

    public void setMotorcycleName(int motorNumber) {
        this.name = "Motorcycle " + motorNumber;
    }

    @Override
    public void setName() {
    }

}
