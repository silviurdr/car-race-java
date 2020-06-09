package com.codecool.car_race.vehicles;

import com.codecool.car_race.Vehicle;

import java.util.Random;

import com.codecool.car_race.Race;

public class Truck extends Vehicle {

    private int hoursBroken=0;

    public Truck() {
        super();
        setName();
        this.normalSpeed=100;
    }


    public void setBrokenSpeed() {
        this.setActualSpeed(0);
    }

    @Override
    public void setName() {
        Random rand=new Random();
        this.name=String.valueOf(rand.nextInt(1000));
    }

    public boolean didTheTruckBroke() {
        Random rand=new Random();
        int maybeBrokenTruck=rand.nextInt(99);
        if (maybeBrokenTruck < 5) {
            return true;
        } else return false;
    }

    @Override
    public void prepareForLap() {
        if (this.didTheTruckBroke()) {
            Race.setIsYellowFlag(true);
            this.hoursBroken=2;
        } else {
            Race.setIsYellowFlag(false);
        }
        if (this.hoursBroken > 0) {
            setBrokenSpeed();
            this.hoursBroken--;
        } else {
            this.setActualSpeed(normalSpeed);
            setDistanceTravel(this.getActualSpeed());
        }
    }

    @Override
    public void moveForAnHour() {
        prepareForLap();
    }
}
