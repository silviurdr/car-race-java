package com.codecool.car_race;

public abstract class Vehicle {

    protected String name;

    protected String vehicleType;

    protected int normalSpeed;
    private int actualSpeed;
    private int distanceTravel = 0;

    private int yellowFlagSpeed = 75;

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

    public int getNormalSpeed() {
        return normalSpeed;
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
