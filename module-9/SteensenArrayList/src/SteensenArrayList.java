//Alisa Steensen
//Module 9.2 part 1

import java.util.ArrayList;
import java.util.Scanner;

public class SteensenArrayList {
    public static void main(String[] args) {
        
        // Welcome message
        System.out.println("Welcome to the program.");

        // ArrayList of 10+ strings
        ArrayList<String> items = new ArrayList<>();
        items.add("0. Humpty Dumpty");
        items.add("1. Itsy Bitsy Spider");
        items.add("2. Mary Had a Little Lamb");
        items.add("3. Twinkle Twinkle Little Star");
        items.add("4. Jack and Jill");
        items.add("5. Baa Baa Black Sheep");
        items.add("6. The Wheels on the Bus");
        items.add("7. London Bridge is Falling Down");
        items.add("8. Ring a Ring o' Roses");
        items.add("9. Hickory Dickory Dock");

        // Print ArrayList using a for-each loop
        System.out.println("Available Items:");
        for (String item : items) {
            System.out.println(item);
        }

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nThe Array is numbered 0-9. Please enter the index (number) of the item you want to see again (0-" + (items.size() - 1) + "): ");

        try {
            // Read input as String first
            String userInput = scanner.nextLine();

            // Converts a String to Integer 
            int index = Integer.parseInt(userInput);

            // Validates if index is in bounds
            if (index < 0 || index >= items.size()) {
                throw new IndexOutOfBoundsException("Out of Bounds");
            } else {
                // Display the selected item
                System.out.println("Item at index " + index + ": " + items.get(index));
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a number.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception thrown: Out of Bounds");
        } finally {
            scanner.close();
        }
    }
}

