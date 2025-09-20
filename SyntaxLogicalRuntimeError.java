// This program explains Syntax, Logical, and Runtime Errors in Java.
// 1. Syntax Error  -> Mistakes in code structure, detected by compiler
// 2. Runtime Error -> Errors that occur during program execution
// 3. Logical Error -> Code runs but output is incorrect due to wrong logic

public class SyntaxLogicalRuntimeError {
    public static void main(String[] args) {

        System.out.println("Syntax, Logical, and Runtime Errors Example\n");

        // ---------------- Syntax Error Example ----------------
        // Uncommenting the below line will cause a compile-time syntax error
        // int num = "10"; // Error: incompatible types
        System.out.println("Syntax errors are detected by compiler before running the program.");

        // ---------------- Runtime Error Example ----------------
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Division by zero causes runtime error
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Runtime Error caught: " + e);
        }

        // ---------------- Logical Error Example ----------------
        int x = 5;
        int y = 3;
        int sum = x - y; // Logical error: subtraction instead of addition
        System.out.println("Logical Error Example - Sum should be 8 but result is: " + sum);
    }
}

/*
Summary of Errors:

1. Syntax Error:
   - Mistakes in code syntax
   - Detected by compiler
   - Example: int num = "10";

2. Runtime Error:
   - Occurs during execution
   - Example: int result = a / 0;

3. Logical Error:
   - Program runs but gives wrong output
   - Example: int sum = x - y; instead of x + y;

Key Point: Understanding these errors helps in debugging and writing correct Java programs.
*/
