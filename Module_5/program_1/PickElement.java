// Michael Streed
// module 5 program 1
// 01-28-2023

import java.util.Scanner;
import java.util.ArrayList;

public class PickElement {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();// Init our ArrayList of String elements
        Integer numOfElements = ((int) (10 + Math.random() * 10));// This picks how many total elements
        // This will loop through and populate the Array list.
        for (int i = 1; i <= numOfElements; i++) {
            arrList.add("This is String number " + i);
        }
        // For-each loop to print the ArrayList
        for (String element : arrList) {
            System.out.println(element);
        }

        Scanner scan = new Scanner(System.in);// Get user input
        System.out.println("Which String element from this list would you like to see again? (Enter a number 1-"
                + numOfElements + ")");
        String userInput = scan.nextLine();// Saves the choice as a String
        scan.close();

        try {
            int userIndex = Integer.parseInt(userInput); // Converts userInput into an int
            if (userIndex > 0 && userIndex <= numOfElements) {
                // Use autoboxing to convert the int userInput to an Integer
                Integer index = userIndex;
                // Use auto-unboxing to convert the Integer back to an int
                int arrayIndex = index;
                // Print the element at the specified index
                System.out.println("Element at index " + arrayIndex + ": " + arrList.get(arrayIndex - 1));
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Out of Bounds: Did not pick integer between (1-" + numOfElements + ")");
        } catch (NumberFormatException e) {
            System.out.println("Did not enter a numerical value");
        }

    }
}
