package com.codecool.car_race;

import com.codecool.car_race.vehicles.VehicleInterface;

public abstract class Vehicle implements VehicleInterface {

    protected String name;
    protected int normalSpeed;
    private int actualSpeed;
    private int distanceTravel=0;

    public String getName() {
        return name;
    }

    public int getActualSpeed() {
        return actualSpeed;
    }

    public void setActualSpeed(int actualSpeed) {
        this.actualSpeed=actualSpeed;
    }

    public void moveForAnHour() {
        distanceTravel+=actualSpeed;
    }

    public int getDistanceTravel() {
        return distanceTravel;
    }

    public void setDistanceTravel(int lapDistance) {
        this.distanceTravel+=lapDistance;
    }
}
