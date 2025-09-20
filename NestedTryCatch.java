// This program explains nested try-catch blocks in Java.
// Nested try-catch means placing a try-catch block inside another try or catch block.
// It allows handling exceptions at different levels for more precise error control.

public class NestedTryCatch {
    public static void main(String[] args) {

        System.out.println("Nested Try-Catch Example\n");

        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Outer try block starts");

            try {
                // Inner try block
                System.out.println("Accessing element at index 3: " + numbers[3]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Array index out of bounds: " + e);
            }

            // Another operation in outer try block
            int result = numbers[0] / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Outer catch: Arithmetic exception caught: " + e);
        }

        System.out.println("Program continues after nested try-catch blocks.");
    }
}

/*
Key Points:

1. Nested try-catch allows handling exceptions at multiple levels.
2. Inner try-catch handles exceptions specific to a smaller code block.
3. Outer try-catch handles exceptions not caught by inner try-catch.
4. Program continues execution after exceptions are handled.
5. Useful when multiple operations may throw different exceptions.
*/
