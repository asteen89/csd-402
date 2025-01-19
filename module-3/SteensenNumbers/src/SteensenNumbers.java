// Alisa Steensen
// Module 3.2
// Date: 1/19/25

// This program prints a pyramid of numbers with an @ symbol in a line on the right side of the pyramid.

public class SteensenNumbers {
    public static int spaceForAtSymbol(int rows) {
        int num = 1;
        
        // Create a StringBuilder to store the last row
        StringBuilder lastRow = new StringBuilder();

        // Calculate spaces for the last row
        for (int i = 1; i <= rows; i++) {
            lastRow.append(String.format("%-2d ", num)); // Append number to last row
            num *= 2;
        }

        num /= 4;
        for (int i = 1; i < rows; i++) {
            lastRow.append(String.format("%-2d ", num)); // Append number to last row
            num /= 2;
        }

        // Return the length of the last row
        return lastRow.length();
    }

    public static void main(String[] args) {
        int rows = 7;

        // Calculate the width of the last row for alignment
        int numberWidth = spaceForAtSymbol(rows);

        for (int i = 1; i <= rows; i++) {
            int num = 1;
            StringBuilder currentRow = new StringBuilder();

            // Print leading spaces
            for (int j = i; j < rows; j++) {
                currentRow.append("   ");
            }

            // Print left side
            for (int j = 1; j <= i; j++) {
                currentRow.append(String.format("%-2d ", num));
                num *= 2;
            }

            // Print right side
            num /= 4;
            for (int j = 1; j < i; j++) {
                currentRow.append(String.format("%-2d ", num));
                num /= 2;
            }

            // Pad with spaces to align the @ symbol
            while (currentRow.length() < numberWidth) {
                currentRow.append(" ");
            }

            // Add the @ symbol
            currentRow.append("@");

            // Print the current row
            System.out.println(currentRow);
        }
    }
}



