package com.codecool.car_race;

public abstract class Vehicle {

    protected String name;

    protected int normalSpeed;
    private int actualSpeed;
    private int distanceTravel = 0;

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public abstract void setNormalSpeed();
    public abstract void setName();
    public abstract void prepareForLap();


    public String getName() {
        return name;
    }

    public void moveForAnHour() {
        distanceTravel += actualSpeed;
    };

}
