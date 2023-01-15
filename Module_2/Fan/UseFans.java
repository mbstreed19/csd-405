
// Michael Streed
// 01-15-2023
// Module 2 assignment
//
// The Purpose of this assignment is to create arrays of Fan objects and iterate through them
// To print their info without using the toString() method.

import java.util.Scanner;

public class UseFans {
    public static void main(String[] args) {
        // this will loop through and initialize an array of fan objects with default
        // values.
        Scanner input = new Scanner(System.in);
        System.out.println("How many fans would you like in this array?");
        int fanCount = 1 + input.nextInt();
        Fan[] collectFans = new Fan[fanCount];
        for (int i = 0; i < collectFans.length; i++) {
            collectFans[i] = new Fan();
        }
        input.close();
    }
}

// my class or template of a fan object
class Fan {
    // these are the variables that make up a fan
    final int stopped = 0;
    final int slow = 1;
    final int medium = 2;
    final int fast = 3;
    private int speed = 0;
    private boolean fanOn = false;
    private double radius = 6;
    public String color = "white";

    // This is a toString() method for printing out fan details
    public String toString() {
        String speedString = "";
        if (this.speed == 0) {
            speedString = "Stopped";
        }
        if (this.speed == 1) {
            speedString = "Slow";
        }
        if (this.speed == 2) {
            speedString = "Medium";
        }
        if (this.speed == 3) {
            speedString = "Fast";
        }
        return "Fan speed: " + speedString + "\nFan on: " + this.fanOn + "\nFan Radius: " + this.radius
                + "\nFan color: " + this.color;
    }

    // here all all my applicable getter methods
    public String getSpeed() {
        String speedString = "";
        if (this.speed == 0) {
            speedString = "Stopped";
        }
        if (this.speed == 1) {
            speedString = "Slow";
        }
        if (this.speed == 2) {
            speedString = "Medium";
        }
        if (this.speed == 3) {
            speedString = "Fast";
        }

        return speedString;
    }

    public boolean isFanOn() {
        return fanOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // these are all my applicable setter methods
    public void setSpeed(int newSpeed) {
        if (newSpeed >= 0 & newSpeed < 5) {
            this.speed = newSpeed;
        }
    }

    public void fanOn() {
        if (this.fanOn == false) {
            this.fanOn = true;
            this.speed = 1;// when fan turns on it starts on slow
        }
    }

    public void fanOff() {
        if (this.fanOn == true) {
            this.speed = 0;// I'm going to also set speed to stopped when fan turns off
            this.fanOn = false;
        }
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    // this section is for my constructors first no args and default. second takes
    // args.
    Fan() {

    }

    // it didnt make sense to set on/off and speed here. better to use getters
    Fan(double newRadius, String newColor) {
        this.setRadius(newRadius);
        this.setColor(newColor);
    }
}
