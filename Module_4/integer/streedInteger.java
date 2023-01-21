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

    // These are my non static methods
    // Checks if the value of this.mikey() is even
    public boolean isEven() {
        if (this.mikey % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if the value of this.mikey() is odd
    public boolean isOdd() {
        if (this.mikey % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // checks if the value of this.mikey() is prime.
    public boolean isPrime() {
        for (int i = 2; i <= (this.mikey / 2); i++) {
            if (this.mikey % i == 0) {
                return false;
            }
        }
        return true;

    }

    // These are my static methods with (int) signatures
    // Checks if the int passed to the method is even
    static public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if the value of the int passes to the method is odd
    static public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // checks if the value of the int passed to parameter is prime.
    static public boolean isPrime(int number) {
        for (int i = 2; i <= (number / 2); i++) {
            if (this.mikey % i == 0) {
                return false;
            }
        }
        return true;

    }

    int test = Integer.valueOf(mikey);

    // These are my static methods with <firstName>Integer signatures
    // Checks if the integer passed to the method is even
    static public boolean isEven(int test) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if the value of the int passes to the method is odd
    public boolean isOdd(int number) {
        if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // checks if the value of the int passed to parameter is prime.
    public boolean isPrime(int number) {
        for (int i = 2; i <= (number / 2); i++) {
            if (this.mikey % i == 0) {
                return false;
            }
        }
        return true;

    }

}
