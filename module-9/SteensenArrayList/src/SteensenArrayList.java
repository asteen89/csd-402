import java.util.ArrayList;
import java.util.Scanner;

public class SteensenArrayList {
    public static void main(String[] args) {
        
        // Welcome message
        System.out.println("Welcome to the program.");

        // ArrayList of 10+ strings
        ArrayList<String> items = new ArrayList<>();
        items.add("Humpty Dumpty");
        items.add("Itsy Bitsy Spider");
        items.add("Mary Had a Little Lamb");
        items.add("Twinkle Twinkle Little Star");
        items.add("Jack and Jill");
        items.add("Baa Baa Black Sheep");
        items.add("The Wheels on the Bus");
        items.add("London Bridge is Falling Down");
        items.add("Ring a Ring o' Roses");
        items.add("Hickory Dickory Dock");

        // Print ArrayList using a for-each loop
        System.out.println("Available Items:");
        for (String item : items) {
            System.out.println(item);
        }

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the index of the item you want to see again (0-" + (items.size() - 1) + "): ");

        try {
            // Read input as String first
            String userInput = scanner.nextLine();

            // Convert String to Integer (Auto-Unboxing)
            Integer index = Integer.parseInt(userInput);

            // Validate index range
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

