
// Michael Streed
// 01-15-2023
// Module 2 assignment
//
// The Purpose of this assignment is to create arrays of Fan objects and iterate through them
// To print their info without using the toString() method.

import java.util.Scanner;

public class UseFans {
    public static void main(String[] args) {
        // this scanner is to pick array size.
        Scanner input = new Scanner(System.in);
        System.out.println("How many fans would you like in this array?");
        int fanCount = input.nextInt();

        // this will loop through and initialize an array of fan objects with default
        // values.
        Fan[] collectFans = new Fan[fanCount];
        for (int i = 0; i < collectFans.length; i++) {
            collectFans[i] = new Fan();
        }

        // input.close();// closes scanner
        // System.out.println("I will now list all the fans we have made..");
        showFans(collectFans);

        // This allows user to pick a fan number to look at on its own and make edits
        System.out.println("What fan would you like to edit?");
        int fanChoice = input.nextInt();
        Fan pickFan = collectFans[fanChoice];
        showFan(pickFan, fanChoice);
        editFan(pickFan);

        showFans(collectFans);
        input.close();
        System.out.println("Thanks for using this fan editor ");

    }

    public static void showFans(Fan[] collectFans) {
        System.out.println("I will now print out all fans in this array");
        for (int i = 0; i < collectFans.length; i++) {
            System.out.println("-------------------");
            System.out.println("Fan Number: " + (1 + i));
            System.out.println("Power" + (collectFans[i].isFanOn() ? "On" : "Off"));
            System.out.println("Fan Speed: " + collectFans[i].getSpeed());
            System.out.println("Fan Radius: " + collectFans[i].getRadius());
            System.out.println("Fan color: " + collectFans[i].getColor());
            System.out.println("-------------------");
        }

    }

    public static void showFan(Fan fan, int fanChoice) {
        System.out.println("-------------------");
        System.out.println("Fan Number: " + fanChoice);
        System.out.println("Power" + (fan.isFanOn() ? "On" : "Off"));
        System.out.println("Fan Speed: " + fan.getSpeed());
        System.out.println("Fan Radius: " + fan.getRadius());
        System.out.println("Fan color: " + fan.getColor());
        System.out.println("-------------------");
    }

    public static void editFan(Fan fan) {
        Scanner edit = new Scanner(System.in);
        Boolean stillEdit = true;
        while (stillEdit == true) {
            System.out.println("would you like to edit this fans color, radius, power, or speed? enter q to quit.");
            String choice = edit.nextLine();
            if (choice.equals("q")) {
                stillEdit = false;
            } else if (choice.equals("color")) {
                System.out.println("What Color would you like this fan to be?");
                String newColor = edit.nextLine();
                fan.setColor(newColor);
            } else if (choice.equals("radius")) {
                System.out.println("What radius would you like this fan to be?");
                double newRadius = edit.nextDouble();
                fan.setRadius(newRadius);
            } else if (choice.equals("power")) {
                if (fan.isFanOn() == true) {
                    fan.fanOff();
                } else {
                    fan.fanOn();
                }

            } else if (choice.equals("speed")) {
                System.out.println("What speed would you like this fan to be? Slow, Medium, or Fast?");
                String newSpeed = edit.nextLine();
                int newSpeedInt = 0;
                if (newSpeed == "slow")
                    newSpeedInt = 1;
                if (newSpeed == "medium")
                    newSpeedInt = 2;
                if (newSpeed == "fast")
                    newSpeedInt = 3;
                fan.setSpeed(newSpeedInt);
            }

            else {
                System.out.println("please pick 'q', 'color', 'radius', 'power', or 'speed'.");
            }

        }

        edit.close();
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
