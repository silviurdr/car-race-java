package com.codecool.car_race;

import java.util.Random;

public class Randomizer {


    public static int getRandomValue(int high, int low) {
        Random rand = new Random();
        int randomValue = rand.nextInt(high - low) + low;
        return randomValue;
    }

}
