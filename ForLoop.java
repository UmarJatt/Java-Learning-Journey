// This program explains the for loop in Java.
// A for loop repeats a block of code a specific number of times.
// It has three parts: initialization, condition, and update (increment/decrement).

public class ForLoop {
    public static void main(String[] args) {

        // Basic for loop example
        System.out.println("For loop example (1 to 5):");
        for (int i = 1; i <= 5; i++) { // i starts at 1, runs while i <= 5, increments i by 1
            System.out.println(i);
        }

        System.out.println();

        // Sum of first 5 numbers using for loop
        int sum = 0;
        for (int j = 1; j <= 5; j++) {
            sum += j; // add j to sum
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        System.out.println();

        // Nested for loop example (printing multiplication table)
        System.out.println("Multiplication table (1 to 3):");
        for (int m = 1; m <= 3; m++) {
            for (int n = 1; n <= 3; n++) {
                System.out.print(m * n + "\t"); // \t adds tab space
            }
            System.out.println(); // new line after each row
        }

        System.out.println();

        // Using for loop with arrays
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Array elements: ");
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();

        System.out.println();

        // Using enhanced for loop (for-each)
        System.out.print("Array elements using for-each: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
