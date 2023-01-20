// Michael Streed
// 01-20-2023
// Module 4 assignment

// this public class will be where I will create my objects and run my test code.
public class streedInteger {
    public static void main(String[] args) {

    }
}

// this is where I will make my <Firstname>Integer class
class MikeyInteger {
    private int mikey;// Integer data field with my first name.

    // This is my constructor that makes a MikeyInteger Object that takes a number
    // as an object for mikey data field
    MikeyInteger(int number) {
        mikey = number;
    }

    // I need a getter and setter method to set my data field. This helps with
    // encapsulation.
    public int getMikey() {
        return mikey;
    }

    public void setMikey(int newMikey) {
        this.mikey = newMikey;
    }

    public boolean isEven() {
        if (this.mikey % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isOdd() {
        if (this.mikey % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isPrime(){
        if (){
            return true;
        }
        else {
            return false;
        }
    }

}
