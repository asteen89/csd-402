// Alisa Steensen
// Module 12

// This program calculates the cost of a yearly service for a car. The service can include an oil change, tire rotation, and a coupon deduction. The program has four methods that calculate the cost of the service based on the number of services and the coupon deduction. The program also tests the methods twice to ensure they work correctly.

public class ServiceCalculator {

    // Standard service charge
    public static double yearlyService() {
        return 150.0; 
    }

    // Service charge with oil change
    public static double yearlyService(double oilChangeFee) {
        return 150.0 + oilChangeFee;
    }

    // Service charge with oil change and tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        return 150.0 + oilChangeFee + tireRotationFee;
    }

    // Service charge with oil change, tire rotation, and coupon deduction
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double coupon) {
        double totalCost = 150.0 + oilChangeFee + tireRotationFee;
        double discount = totalCost * (coupon / 100);
        return totalCost - discount;
    }

    public static void main(String[] args) {
        // The testing for each method two times
        System.out.println("Test 1: " + yearlyService());
        System.out.println("Test 2: " + yearlyService());

        System.out.println("Test 1: " + yearlyService(75.0));
        System.out.println("Test 2: " + yearlyService(75.0));

        System.out.println("Test 1: " + yearlyService(75.0, 40.0));
        System.out.println("Test 2: " + yearlyService(75.0, 40.0));

        System.out.println("Test 1: " + yearlyService(75.0, 40.0, 10.0));
        System.out.println("Test 2: " + yearlyService(75.0, 40.0, 25.0));
    }
}
