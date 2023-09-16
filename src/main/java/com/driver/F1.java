package com.driver;

public class F1 extends Car {

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned

        super(name, 4, 2, 6, isManual, "Sports", 2);
    }

    public void accelerate(int rate){
        int newSpeed = rate+ getCurrentSpeed(); //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        // Ensure that newSpeed cannot be negative
        if (newSpeed < 0) {
            newSpeed = 0;
        }

        // Use if-else if-else statements to set the gear based on speed
        if (newSpeed <= 50) {
            changeGear(1); // Set gear 1 for speeds from 0 to 50
        } else if (newSpeed <= 100) {
            changeGear(2); // Set gear 2 for speeds from 51 to 100
        } else if (newSpeed <= 150) {
            changeGear(3); // Set gear 3 for speeds from 101 to 150
        } else if (newSpeed <= 200) {
            changeGear(4); // Set gear 4 for speeds from 151 to 200
        } else if (newSpeed <= 250) {
            changeGear(5); // Set gear 5 for speeds from 201 to 250
        } else {
            changeGear(6); // Set gear 6 for speeds greater than 250
        }

        changeSpeed(newSpeed, getCurrentDirection()); // Change speed
    }
}
