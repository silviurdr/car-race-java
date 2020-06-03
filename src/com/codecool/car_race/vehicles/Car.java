package com.codecool.car_race.vehicles;

import com.codecool.car_race.Vehicle;
import java.util.Random;

public class Car extends Vehicle {

    public Car() {
        this.setName();
        this.setNormalSpeed();
    }

    @Override
    public void setNormalSpeed() {
        Random rand = new Random();
        int lowSpeed = 80;
        int highSpeed = 110;
        this.normalSpeed =  rand.nextInt(highSpeed - lowSpeed) + lowSpeed;
    }

    @Override
    public void setName() {
        giveCarName();
    }

    @Override
    public void prepareForLap() {
    }

    public static String giveCarName() {

        String[] firstNames ={"Rusty", "Dusty", "Prusty"};
        String[] lastNames = {"Chubby", "Flobby", "Mobby"};
        Random rand = new Random();
        String firstName = firstNames[rand.nextInt(firstNames.length)];
        String lastName = lastNames[rand.nextInt(firstNames.length)];
        return firstName + " " + lastName;
    }


}
