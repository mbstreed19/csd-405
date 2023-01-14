
// Michael Streed
// 01-13-2023
// Module 1 assignment
//
// The Purpose of this assignment is to create an object called fan and utilize this class to make basic objects.
// This is the begining of learning about object oriented programming.
import java.util.Scanner;

public class FanTest {
    public static void main(String[] args) {
        // a couple of variables to make custom fan
        double customRadius;
        String customColor;
        Fan defaultFan = new Fan();// makes default fan with default values
        // These statements print out default fan
        System.out.println("Here is the default fan object:");
        System.out.println(defaultFan.toString());
        System.out.println("----------------------------");
        // makes custom fan asks for input
        System.out.println("Let's build a custom fan. Enter the radius and color you would like your fan to be.");
        Scanner input = new Scanner(System.in);
        customRadius = input.nextDouble();
        customColor = input.nextLine();
        Fan customFan = new Fan(customRadius, customColor);// uses constructor with args
        // prints out the custom fan details
        System.out.println("Here is your custom fan object:");
        System.out.println(customFan.toString());
        System.out.println("----------------------------");
        // showcase some functions
        System.out.println("lets turn on our custom fan. using our setter function, customFan.fanOn()");
        customFan.fanOn();
        System.out.println(customFan.toString());
        System.out.println("----------------------------");
        System.out.println(
                "Notice how when we turn on our fan, the speed starts on the lowest setting. we can change that with another setter function, customFan.setSpeed(). lets set it to the fast setting.");
        customFan.setSpeed(3);
        System.out.println(customFan.toString());
        System.out.println("----------------------------");
        System.out.println("Let's turn the fan off now. and check if it is off with our getter customFan.isFanOn()");
        customFan.fanOff();
        System.out.println("The custom fan is on = " + customFan.isFanOn());
        System.out.println(
                "let's take a look at the whole fan again notice how the speed is stopped automatically since we turned the fan off.");
        System.out.println(customFan.toString());

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
    public int getSpeed() {
        return speed;
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
