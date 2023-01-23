
// Michael Streed
// Module 4
// 01-22-2023
import java.util.ArrayList;// need this to use the methods in ArrayList()
import java.util.Scanner;// This is to get user input.

class streedArrayListTest {
    // This is the method called max that takes an ArrayList called list and returns
    // the highest digit.
    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {// This will return 0 if the list is empty
            return 0;
        }
        int max = list.get(0);// This makes a max variable filled with the first item in the ArrayList
        // we will iterate through the rest of the list and compare each one to max. If
        // an integer is greater
        // then the current max then that integer becomes max
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;// This returns whatever integer becomes max
    }

    public static void main(String[] args) {// This is the test method to test my method.
        // creates an ArrayList called list that is filled with integers.
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);// Makes a scanner for getting user input
        System.out.println("Enter integers, enter 0 to stop:");// This is the prompt for input
        int input = scanner.nextInt();// user input goes into this variable.
        // This while loop adds integers into the ArrayList as long as the user does not
        // enter 0
        while (input != 0) {
            list.add(input);
            input = scanner.nextInt();
        }
        // once user enters 0 this code gets executed
        list.add(input);// Adds the 0 that user entered to get to this point into the list
        // calls the max function with the parameter of the list
        System.out.println("Largest value in the ArrayList: " + max(list));
        scanner.close();// closes the scanner
    }
}
