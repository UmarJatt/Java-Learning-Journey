// This program explains the Exception class in Java.
// All exceptions in Java are subclasses of the Exception class.
// We can handle exceptions using try-catch or throw custom exceptions.
// Creating custom exceptions involves extending the Exception class.

public class TheExceptionClass {
    public static void main(String[] args) {

        System.out.println("Java Exception Class Example\n");

        // Handling built-in exception
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Built-in Exception caught: " + e);
        }

        // Handling custom exception
        try {
            validateAge(15); // age less than 18, should throw exception
        } catch (AgeNotValidException e) {
            System.out.println("Custom Exception caught: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }

    // Method to check age
    static void validateAge(int age) throws AgeNotValidException {
        if (age < 18) {
            // Throwing custom exception
            throw new AgeNotValidException("Age must be 18 or above");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }
}

// Custom exception class extending Exception
class AgeNotValidException extends Exception {
    AgeNotValidException(String message) {
        super(message); // Call parent constructor
    }
}

/*
Key Points:

1. Exception is the superclass for all checked exceptions.
2. Built-in exceptions like ArithmeticException, IOException extend Exception.
3. Custom exceptions can be created by extending Exception class.
4. Use throw keyword to throw an exception.
5. Use throws keyword in method signature to declare potential exceptions.
6. Exceptions can be handled using try-catch blocks.
7. Helps in making programs robust and handling errors gracefully.
*/
