// This program explains the do-while loop in Java.
// A do-while loop executes the block of code first and then checks the condition.
// This ensures the loop runs at least once, even if the condition is false.

public class DoWhileLoop {
    public static void main(String[] args) {

        // Basic do-while loop
        int i = 1;
        System.out.println("Do-while loop example (1 to 5):");
        do {
            System.out.println(i); // execute code
            i++; // increment i
        } while (i <= 5); // condition checked after execution

        System.out.println();

        // Sum of first 5 numbers using do-while loop
        int sum = 0;
        int j = 1;
        do {
            sum += j; // add j to sum
            j++;
        } while (j <= 5);
        System.out.println("Sum of first 5 numbers: " + sum);

        System.out.println();

        // Using do-while loop with a boolean flag
        boolean keepRunning = true;
        int counter = 1;
        System.out.println("Do-while loop with boolean flag:");
        do {
            System.out.println("Counter: " + counter);
            counter++;
            if (counter > 3) {
                keepRunning = false; // stop loop
            }
        } while (keepRunning);

        System.out.println();

        // Difference from while loop
        int number = 10;
        do {
            System.out.println("This runs at least once even if condition is false");
        } while (number < 5); // condition is false, but loop runs once
    }
}
