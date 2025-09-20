// This program explains the types of errors in Java.
// There are three main types of errors:
// 1. Compile-time Error  -> Detected by compiler before running the program
// 2. Runtime Error       -> Occurs while the program is running
// 3. Logical Error       -> Program runs but gives wrong output due to logic mistake

public class TypesOfErrorInJava {
    public static void main(String[] args) {

        System.out.println("Types of Errors in Java Example\n");

        // 1. Compile-time Error example
        // Uncommenting the below line will cause compile-time error
        // int x = "Hello"; // Error: incompatible types

        System.out.println("Compile-time errors are detected by compiler.");

        // 2. Runtime Error example
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Runtime Error caught: " + e);
        }

        // 3. Logical Error example
        int num1 = 10;
        int num2 = 5;
        int sum = num1 - num2; // Should be addition, but subtraction causes logical error
        System.out.println("Logical Error Example - Sum: " + sum);
    }
}

/*
Summary of Errors in Java:

1. Compile-time Error:
   - Syntax errors, type mismatch, missing semicolon
   - Detected by compiler
   - Example: int x = "Hello";

2. Runtime Error:
   - Occurs during program execution
   - Example: Division by zero, NullPointerException

3. Logical Error:
   - Program runs but gives incorrect results
   - Caused by wrong logic
   - Example: int sum = num1 - num2; instead of num1 + num2;

Key Tip: Always debug logical errors by checking your program logic carefully.
*/
