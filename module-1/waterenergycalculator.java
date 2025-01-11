// Alisa Steensen
// Module M1: Programming Assignment
// 1/9/2024

import java.util.Scanner;

public class waterenergycalculator {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // import scanner
        
        System.out.print("Please input the amount of water in kilograms: ");
        double waterMass = input.nextDouble(); // get the mass of water
        
        System.out.print("Please enter the initial temperature of the water in Celsius: ");
        double initialTemperature = input.nextDouble(); // get the initial temperature
        
        System.out.print("Please enter the final temperature of the water in Celsius: ");
        double finalTemperature = input.nextDouble(); // get the final temperature
        
        double Qjoules = waterMass * (finalTemperature - initialTemperature) * 4184; // calculate the energy needed
        
        System.out.printf("The energy needed to heat %.2f kg of water from %.2f°C to %.2f°C is %.2f joules.%n", waterMass, initialTemperature, finalTemperature, Qjoules);
 // print the energy needed

        input.close(); // close the scanner
    }
    
}
