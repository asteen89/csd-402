// Alisa Steensen
// M9.2

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Random;

public class CreateFile {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Path filePath = Paths.get("data.file");

        // Create a file if it does not exist
        try {
            if (Files.notExists(filePath)) {
                Files.createFile(filePath);
                System.out.println("File created: " + filePath);
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Write to the file (append 10 random numbers)
        try {
            StringBuilder numbers = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                numbers.append(randomNumber.nextInt(10) + 1).append(" ");
            }
            numbers.append("\n"); // Add a new line for readability

            Files.write(filePath, numbers.toString().getBytes(), StandardOpenOption.APPEND);
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        // Read from the file and display contents
        try {
            List<String> lines = Files.readAllLines(filePath);
            System.out.println("\nFile Contents:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
