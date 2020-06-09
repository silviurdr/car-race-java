package com.codecool.car_race;

public abstract class Vehicle {

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

    public abstract void setName();

    public abstract void prepareForLap();

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
