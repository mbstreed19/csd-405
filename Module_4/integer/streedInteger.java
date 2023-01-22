// Michael Streed
// 01-20-2023
// Module 4 assignment

// this public class will be where I will create my objects and run my test code.
public class streedInteger {
    public static void main(String[] args) {
        System.out.println("Creating Three instances using names anna(4), larry(6) and sue(4)");
        // creates three instances
        Integer annaInteger = new Integer(4);
        Integer larryInteger = new Integer(6);
        Integer sueInteger = new Integer(4);

        // testing the instance versions of methods
        System.out.println("Testing the instance version of methods");
        System.out.println("Is Anna's number even?: " + annaInteger.isEven()); // true
        System.out.println("Is Larry's number odd?: " + larryInteger.isOdd()); // false
        System.out.println("Is Sue's number prime?: " + sueInteger.isPrime()); // false
        System.out.println("-------------------------------------");
        // testing the static methods being passed Integer instances
        System.out.println("Testing static methods being passed instances of Integer class...");
        System.out.println("Integer.isEven(annaInteger) = " + Integer.isEven(annaInteger)); // true
        System.out.println("Integer.isOdd(larryInteger) = " + Integer.isOdd(larryInteger)); // true
        System.out.println("Integer.isPrime(sueInteger) = " + Integer.isPrime(sueInteger)); // false
        System.out.println("-------------------------------------");
        // Testing the static methods with random integers passed to them
        System.out.println("Testing static functions with random integers passed to them");
        // int randomNum = (int) (Math.random() * 30) + 1;
        int[] randomNums = new int[3];
        for (int i = 0; i < randomNums.length; i++) {
            randomNums[i] = (int) (Math.random() * 30) + 1;
            System.out.println("is " + randomNums[i] + " even?: " + Integer.isEven(randomNums[i]));
            System.out.println("is " + randomNums[i] + " Odd?: " + Integer.isOdd(randomNums[i]));
            System.out.println("is " + randomNums[i] + " prime?: " + Integer.isPrime(randomNums[i]));

        }
        System.out.println("------------------------------------");

    }
}

// this is where I will make my <Firstname>Integer class
class Integer {
    private int firstName;// Integer data field titled first name.

    // This is my constructor that makes a FirstNameInteger Object that takes a
    // number
    // as an object for firstName data field
    Integer(int number) {
        this.firstName = number;
    }

    // I need a getter and setter method to set my data field. This helps with
    // encapsulation.
    public int getFirstName() {
        return firstName;
    }

    public void setFirstName(int newFirstName) {
        this.firstName = newFirstName;
    }

    // These are my non static methods
    // Checks if the value of this.firstName() is even
    public boolean isEven() {
        if (this.firstName % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if the value of this.firstName() is odd
    public boolean isOdd() {
        if (this.firstName % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // checks if the value of this.firstName() is prime.
    public boolean isPrime() {
        for (int i = 2; i <= (this.firstName / 2); i++) {
            if (this.firstName <= 1) {
                return false;
            }
            if (this.firstName % i == 0) {
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
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= (number / 2); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    // These are my static methods with Integer signatures
    // Checks if the integer passed to the method is even
    static public boolean isEven(Integer instance) {
        if (instance.firstName % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Checks if the value of the Integer object's variable passed to the method is
    // odd
    static public boolean isOdd(Integer instance) {
        if (instance.firstName % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    // checks if the value of the Integer object's varible passed to parameter is
    // prime.
    static public boolean isPrime(Integer instance) {
        if (instance.firstName <= 1) {
            return false;
        }
        for (int i = 2; i <= (instance.firstName / 2); i++) {
            if (instance.firstName % i == 0) {
                return false;
            }
        }
        return true;

    }

    // These are my equals() methods
    public boolean equals(int number) {
        return number == (this.firstName);
    }

    public boolean equals(Integer instance) {
        return this.firstName == instance.firstName;
    }

}
