// Alisa Steensen
// Module M5

// Find the smallest and largest element in a 2D array and provide the location in a one dimensional array.

public class Steensen2DArray {
    public static void main(String[] args) {
        // Test Arrays
        double[][] doubleArray = {
            {7.1, 9.9, 4.2}, 
            {5.8, 9.7, 3.9}, 
            {6.4, 10.5, 7.3}
        };
        
        int[][] intArray = {
            {9, 4, 3}, 
            {10, 5, 6}, 
            {4, 8, 11}
        };
        
        // Locate Largest and Smallest for Double Array
        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        
        // Locate Largest and Smallest for Integer Array
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);
        
        // Output Results
        System.out.println("Largest in Double Array: (" + largestDouble[0] + ", " + largestDouble[1] + ")");
        System.out.println("Smallest in Double Array: (" + smallestDouble[0] + ", " + smallestDouble[1] + ")");
        
        System.out.println("Largest in Integer Array: (" + largestInt[0] + ", " + largestInt[1] + ")");
        System.out.println("Smallest in Integer Array: (" + smallestInt[0] + ", " + smallestInt[1] + ")");
    }

    // Method to locate the largest element in a double[][] array
    public static int[] locateLargest(double[][] arrayParam) {
        double largest = arrayParam[0][0];
        int[] largestIndex = {0, 0}; // Initialize with the first element

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    largestIndex[0] = i;
                    largestIndex[1] = j;
                }
            }
        }
        return largestIndex;
    }

    // Method to locate the largest element in an int[][] array
    public static int[] locateLargest(int[][] arrayParam) {
        int largest = arrayParam[0][0];
        int[] largestIndex = {0, 0}; // Initialize with the first element

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    largestIndex[0] = i;
                    largestIndex[1] = j;
                }
            }
        }
        return largestIndex;
    }

    // Method to locate the smallest element in a double[][] array
    public static int[] locateSmallest(double[][] arrayParam) {
        double smallest = arrayParam[0][0];
        int[] smallestIndex = {0, 0}; // Initialize with the first element

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    smallestIndex[0] = i;
                    smallestIndex[1] = j;
                }
            }
        }
        return smallestIndex;
    }

    // Method to locate the smallest element in an int[][] array
    public static int[] locateSmallest(int[][] arrayParam) {
        int smallest = arrayParam[0][0];
        int[] smallestIndex = {0, 0}; // Initialize with the first element

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    smallestIndex[0] = i;
                    smallestIndex[1] = j;
                }
            }
        }
        return smallestIndex;
    }
}


//reference: https://www.youtube.com/watch?v=y1bUfuTkmic // https://www.geeksforgeeks.org/to-find-smallest-and-second-smallest-element-in-an-array/