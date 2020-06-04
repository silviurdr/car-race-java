package com.codecool.car_race;

public abstract class Vehicle {

    protected String name;

    protected String vehicleType;

    private int hoursBroken = 0;

    protected int normalSpeed;
    private int actualSpeed;
    private int distanceTravel = 0;

    private int yellowFlagSpeed = 75;

    public void setHoursBroken(int brokenHours) {
        hoursBroken = 2;
    }

    public void decreaseHoursBroken() {
        hoursBroken--;
    }

    public int getHoursBroken() {
        return hoursBroken;
    }

    public int getYellowFlagSpeed() {
        return yellowFlagSpeed;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType=vehicleType;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getName() {
        return name;
    }

    public abstract void setNormalSpeed();
    public abstract void setName();
    public void prepareForLap(int speed) {
        this.actualSpeed = speed;
    }

    public void moveForAnHour() {
        distanceTravel += actualSpeed;
    }

    public int getDistanceTravel() {
        return distanceTravel;
    }


}
