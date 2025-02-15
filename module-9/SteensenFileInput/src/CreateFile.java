// Alisa Steensen
// M9.2
// https://www.w3schools.com/java/java_files_create.asp

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int number;

        // Create a file
        try {
            File myFile = new File("data.file");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // Write to a file (append mode)
        try (FileWriter myWriter = new FileWriter("data.file", true)) { 
            for (int i = 1; i <= 10; i++) {
                number = randomNumber.nextInt(10) + 1;
                myWriter.write(number + " "); // Write numbers separated by space
            }
            myWriter.write("\n"); // Add a new line for readability
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();

            myWriter.close();
        }

        // Read from a file
        try {
            File myFile = new File("data.file");
            Scanner myReader = new Scanner(myFile);
            System.out.println("\nFile Contents:");
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
