// This program explains the while and do-while loops in Java.
// Loops are used to repeat a block of code multiple times.
// while loop checks the condition first, then executes the code.
// do-while loop executes the code first, then checks the condition.

public class WhileLoop {
    public static void main(String[] args) {

        // Basic while loop
        int i = 1;
        System.out.println("While loop example (1 to 5):");
        while (i <= 5) { // loop runs as long as condition is true
            System.out.println(i);
            i++; // increment i to avoid infinite loop
        }

        System.out.println();

        // Sum of first 5 numbers using while loop
        int sum = 0;
        int j = 1;
        while (j <= 5) {
            sum += j; // add j to sum
            j++;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        System.out.println();

        // do-while loop example
        int k = 1;
        System.out.println("Do-while loop example (1 to 5):");
        do {
            System.out.println(k);
            k++;
        } while (k <= 5); // condition checked after executing code

        System.out.println();

        // Using while loop with a boolean flag
        boolean keepRunning = true;
        int counter = 1;
        System.out.println("While loop with boolean flag:");
        while (keepRunning) {
            System.out.println("Counter: " + counter);
            counter++;
            if (counter > 3) {
                keepRunning = false; // stop loop
            }
        }
    }
}
