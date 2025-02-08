//Alisa Steensen
// Module M7

// This program has a collection of fans that demonstrate a list that manages a collection of Fan objects.
// It creates a list of fans, with different attributes and then prints the details of each fan 

import java.util.ArrayList;
import java.util.List;

public class UseFans {

    // Method to display collection of fans
    public static void printFans(List<Fan> fans) {
        for (Fan fan : fans) {
            printFan(fan);
            System.out.println();
        }
    }

    public static void printFan(Fan fan) {
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Power: " + (fan.getPower() ? "On" : "Off"));
    }
    
    // Test code
    public static void main(String[] args) {
        // Create a collection of fans
        List<Fan> fans = new ArrayList<>();

        // Add fans to the collection
        fans.add(new Fan(3, true, 9, "pink"));
        fans.add(new Fan(1, false, 2, "purple"));
        fans.add(new Fan(4, true, 7, "silver"));
        fans.add(new Fan(3, false, 12, "gold"));

        UseFans.printFans(fans);
    }
}
