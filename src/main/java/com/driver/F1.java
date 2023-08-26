package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Race Car", 1);
    }


    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        int newGear;
        if (newSpeed >= 0 && newSpeed <= 50) {
            newGear = 1;
        } else if (newSpeed <= 100) {
            newGear = 2;
        } else if (newSpeed <= 150) {
            newGear = 3;
        } else if (newSpeed <= 200) {
            newGear = 4;
        } else if (newSpeed <= 250) {
            newGear = 5;
        } else {
            newGear = 6;
        }

        if (newSpeed == 0) {
            stop();
            newGear = 1;
        }

        changeGear(newGear);
        changeSpeed(newSpeed, 0); // Assume direction is 0 for simplicity
    }
}