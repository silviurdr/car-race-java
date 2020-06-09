package com.codecool.car_race.vehicles;

import com.codecool.car_race.Vehicle;

import java.util.Random;


import com.codecool.car_race.Race;
import com.codecool.car_race.Randomizer;

public class Car extends Vehicle {


    public Car() {
        this.setName();
        this.normalSpeed=setCarSpeed();
    }


    public int setCarSpeed() {
        int lowCarSpeed=80;
        int highCarSpeed=110;
        int carSpeed=Randomizer.getRandomValue(highCarSpeed, lowCarSpeed);
        return carSpeed;
    }

    @Override
    public void setName() {
        String[] firstNames={"Wolf", "Blizzard", "Cobra", "Guardian", "Treasure", "Sprite"};
        String[] lastNames={"Avalanche", "Desire", "Reach", "Aura", "Vision", "Fragment"};
        Random rand=new Random();
        String firstName=firstNames[rand.nextInt(firstNames.length)];
        String lastName=lastNames[rand.nextInt(firstNames.length)];
        this.name=firstName + " " + lastName;
    }

    @Override
    public void prepareForLap() {
        if (Race.getIsYellowFlag()) {
            this.setActualSpeed(getYellowFlagSpeed());
        } else this.setActualSpeed(normalSpeed);
        setDistanceTravel(this.getActualSpeed());
    }

    @Override
    public void moveForAnHour() {
        this.prepareForLap();
    }


}
