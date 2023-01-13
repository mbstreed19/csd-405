// Michael Streed
// 01-13-2023
// Module 1 assignment
//
// The Purpose of this assignment is to create an object called fan and utilize this class to make basic objects.
// This is the begining of learning about object oriented programming.
public class FanTest {
    public static void main(String[] args) {
        Fan fanTest = new Fan();
        // System.out.println(fanTest.getSpeed());
        // System.out.println(fanTest.isFanOn());
        // System.out.println(fanTest.getRadius());
        // System.out.println(fanTest.getColor());
        System.out.println(fanTest.toString());

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
    private boolean fanOn;
    private double radius = 6;
    public String color = "white";

    // This is a toString() method for printing out fan details
    public String toString() {
        String speedString;
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
        return "Fan speed: " + this.speed + "\nFan on: " + this.fanOn + "\nFan Radius: " + this.radius + "\nFan color: "
                + this.color;
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

    Fan(int newSpeed, boolean fanOn, double newRadius, String newColor) {
        this.setSpeed(newSpeed);
        if (fanOn = true) {
            this.fanOn();
        } else {
            this.fanOff();
        }
        this.setRadius(newRadius);
        this.setColor(newColor);
    }
}
