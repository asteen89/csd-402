// Alisa Steensen
// M4

// This program demonstrates method overloading by calculating the average of an array of integers, shorts, longs, and doubles. It will test each overloaded method and return the array as well as the average of that

public class SteensenOverloadedAverage {
     // Calculate the average of a short array
     public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Calculate the average of an int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Calculate the average of a long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Calculate the average of a double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static void main(String[] args) {
        // Test arrays
        short[] shortArray = {10, 20, 30};
        int[] intArray = {1, 2, 3, 4};
        long[] longArray = {100L, 200L, 300L, 400L};
        double[] doubleArray = {1.5, 2.5, 3.5};

        // Test each method and print results
        System.out.println("Short array: " + java.util.Arrays.toString(shortArray));
        System.out.println("Average: " + average(shortArray));

        System.out.println("\nInt array: " + java.util.Arrays.toString(intArray));
        System.out.println("Average: " + average(intArray));

        System.out.println("\nLong array: " + java.util.Arrays.toString(longArray));
        System.out.println("Average: " + average(longArray));

        System.out.println("\nDouble array: " + java.util.Arrays.toString(doubleArray));
        System.out.println("Average: " + average(doubleArray));
    }
}