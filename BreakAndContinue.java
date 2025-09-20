// This program explains the break and continue statements in Java loops.
// break -> exits the loop completely when a condition is met.
// continue -> skips the current iteration and moves to the next iteration of the loop.

public class BreakAndContinue {
    public static void main(String[] args) {

        // Using break in a for loop
        System.out.println("Using break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // loop stops when i is 5
            }
            System.out.println("i = " + i);
        }

        System.out.println();

        // Using continue in a for loop
        System.out.println("Using continue:");
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                System.out.println("Skipping iteration at j = " + j);
                continue; // skips this iteration
            }
            System.out.println("j = " + j);
        }

        System.out.println();

        // Using break in a while loop
        System.out.println("Break in while loop:");
        int k = 1;
        while (k <= 5) {
            if (k == 4) {
                System.out.println("Breaking the while loop at k = " + k);
                break;
            }
            System.out.println("k = " + k);
            k++;
        }

        System.out.println();

        // Using continue in a while loop
        System.out.println("Continue in while loop:");
        int m = 1;
        while (m <= 5) {
            m++;
            if (m == 4) {
                System.out.println("Skipping iteration at m = " + m);
                continue; // skip iteration when m is 4
            }
            System.out.println("m = " + m);
        }
    }
}
