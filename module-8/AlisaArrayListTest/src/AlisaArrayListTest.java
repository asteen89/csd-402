// Alisa Steensen
// Module M8

import java.util.ArrayList; // import arraylist
import java.util.Scanner; // import scanner

public class AlisaArrayListTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> userList = new ArrayList<>();

        System.out.println("Please enter numbers only, enter 0 to stop. \nPress Enter to stop without adding anything: ");

        while (true) {
            String input = scanner.nextLine().trim(); // Read input as a string
            
            if (input.isEmpty()) {
                break; // If input is empty, break (no numbers entered)
            }

            try {
                int num = Integer.parseInt(input);
                userList.add(num);
                if (num == 0) {
                    break; // Stop input while including 0 in the list
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        // Call the method and display the result
        int largest = max(userList);
        System.out.println("The largest number in the ArrayList is: " + largest);
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0; // If the list is empty, return 0
        }

        int largest = list.get(0); // Start with the first element

        for (int num : list) {
            if (num > largest) {
                largest = num;
            }
        }

        return largest;
    }
}

