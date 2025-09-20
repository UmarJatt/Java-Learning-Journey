// This program explains handling specific exceptions in Java.
// You can use multiple catch blocks to handle different types of exceptions separately.
// This ensures each exception is handled appropriately without affecting other parts of the program.

public class HandlingSpecificExceptions {
    public static void main(String[] args) {

        System.out.println("Handling Specific Exceptions Example\n");

        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Accessing element at index 3: " + numbers[3]); // ArrayIndexOutOfBoundsException
            int result = numbers[0] / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception caught: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e);
        } catch (Exception e) {
            // Generic exception to catch any other exception
            System.out.println("Other Exception caught: " + e);
        }

        System.out.println("Program continues after handling specific exceptions.");
    }
}

/*
Key Points:

1. Use multiple catch blocks to handle different exceptions separately.
2. Specific exceptions should be caught before generic Exception.
3. Order matters: more specific exception types first, general ones later.
4. This allows precise handling of each error type.
5. Program continues execution after exceptions are handled.
*/
