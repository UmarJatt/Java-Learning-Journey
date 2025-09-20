// This program demonstrates JavaDoc tags using four classes.
// JavaDoc tags help document classes, methods, parameters, return values, and exceptions.
// Common tags: 
// @author - author of class
// @version - version of class
// @param - method parameter
// @return - method return value
// @throws - exceptions thrown by method
// @see - reference to other classes/methods

// Class 1: Main class to run the program
/**
 * Main class to demonstrate JavaDocs across multiple classes.
 * @author Umar
 * @version 1.0
 */
public class JavaDocsTagsFourClasses {
    public static void main(String[] args) {
        System.out.println("JavaDocs Tags with Four Classes Example\n");

        // Creating objects of other classes
        Calculator calc = new Calculator();
        Printer printer = new Printer();
        Divider divider = new Divider();

        // Using Calculator
        int sum = calc.add(10, 20);
        System.out.println("Sum: " + sum);

        // Using Printer
        printer.printMessage("Hello, JavaDocs!");

        // Using Divider
        try {
            int result = divider.divide(50, 5);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Class 2: Calculator
/**
 * Calculator class provides basic arithmetic operations.
 * @author Umar
 * @version 1.0
 */
class Calculator {

    /**
     * Adds two integers.
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts second integer from first integer.
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }
}

// Class 3: Printer
/**
 * Printer class is used to print messages.
 * @author Umar
 * @version 1.0
 */
class Printer {

    /**
     * Prints a custom message to console.
     * @param message Message to print
     */
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
}

// Class 4: Divider
/**
 * Divider class performs division operations.
 * @author Umar
 * @version 1.0
 */
class Divider {

    /**
     * Divides two integers.
     * @param numerator Numerator
     * @param denominator Denominator
     * @return Result of division
     * @throws ArithmeticException if denominator is zero
     */
    public int divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator / denominator;
    }
}

/*
Key Points about JavaDocs Tags:

1. @author - specifies the author of the class.
2. @version - specifies the version of the class.
3. @param - describes a method parameter.
4. @return - describes the return value of a method.
5. @throws - describes exceptions thrown by a method.
6. JavaDocs can span across multiple classes for better documentation.
7. Use 'javadoc *.java' to generate HTML documentation for all classes.
8. Helps in creating professional and readable code documentation.
*/
