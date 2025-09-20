// This program explains recursion in Java.
// Recursion is a technique where a method calls itself to solve a problem.
// Every recursive method must have a base case to stop the recursion, otherwise it causes infinite calls.

public class JavaRecursion {
    public static void main(String[] args) {

        // Example 1: Factorial of a number using recursion
        int number = 5;
        int fact = factorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);

        System.out.println();

        // Example 2: Sum of first n numbers using recursion
        int n = 10;
        int sum = sumNumbers(n);
        System.out.println("Sum of first " + n + " numbers is: " + sum);

        System.out.println();

        // Example 3: Fibonacci series using recursion
        int fibCount = 7;
        System.out.print("Fibonacci series up to " + fibCount + " terms: ");
        for (int i = 0; i < fibCount; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        System.out.println();

        // Example 4: Printing numbers from n to 1 using recursion
        System.out.print("Numbers from 5 to 1: ");
        printDescending(5);
        System.out.println();
    }

    // Recursive method to calculate factorial
    static int factorial(int n) {
        if (n == 0 || n == 1) { // base case
            return 1;
        } else {
            return n * factorial(n - 1); // recursive call
        }
    }

    // Recursive method to calculate sum of first n numbers
    static int sumNumbers(int n) {
        if (n == 0) { // base case
            return 0;
        } else {
            return n + sumNumbers(n - 1); // recursive call
        }
    }

    // Recursive method to calculate nth Fibonacci number
    static int fibonacci(int n) {
        if (n == 0) {
            return 0; // base case
        } else if (n == 1) {
            return 1; // base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
        }
    }

    // Recursive method to print numbers from n to 1
    static void printDescending(int n) {
        if (n == 0) { // base case
            return;
        } else {
            System.out.print(n + " ");
            printDescending(n - 1); // recursive call
        }
    }
}
