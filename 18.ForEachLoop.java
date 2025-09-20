// This program explains the enhanced for loop (for-each) in Java.
// The for-each loop is used to iterate through arrays or collections easily.
// It automatically goes through each element without using an index.

public class ForEachLoop {
    public static void main(String[] args) {

        // Example 1: Iterating through an integer array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Numbers array: ");
        for (int num : numbers) { // num takes the value of each element in numbers
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println();

        // Example 2: Iterating through a string array
        String[] fruits = {"Apple", "Banana", "Mango", "Orange"};
        System.out.println("Fruits array:");
        for (String fruit : fruits) { // fruit takes the value of each element in fruits
            System.out.println(fruit);
        }

        System.out.println();

        // Example 3: Using for-each with sum of array elements
        int sum = 0;
        for (int n : numbers) {
            sum += n; // add each element to sum
        }
        System.out.println("Sum of numbers array: " + sum);

        System.out.println();

        // Example 4: Using for-each with multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matrix elements:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
