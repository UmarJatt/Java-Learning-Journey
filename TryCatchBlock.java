// This program explains the try-catch block in Java.
// try-catch is used to handle exceptions (runtime errors) gracefully.
// The code that may cause an exception is placed inside the try block.
// If an exception occurs, it is caught by the catch block, preventing program crash.

public class TryCatchBlock {
    public static void main(String[] args) {

        System.out.println("Try-Catch Block Example\n");

        int[] numbers = {10, 20, 30};

        try {
            // Code that may cause exception
            System.out.println("Accessing element at index 3: " + numbers[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling exception
            System.out.println("Exception caught: " + e);
        }

        // Another example with arithmetic exception
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }
}

/*
Key Points about try-catch:

1. try block:
   - Contains code that might throw an exception.

2. catch block:
   - Catches the exception and defines how to handle it.
   - Syntax: catch(ExceptionType e)

3. Multiple catch blocks:
   - Can handle different types of exceptions separately.

4. finally block (optional):
   - Executes code regardless of exception occurrence.

Benefits:
- Prevents program crash
- Allows graceful error handling
- Makes programs robust and user-friendly
*/
