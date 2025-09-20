// This program explains how to use JavaDocs in Java.
// JavaDocs are special comments used to generate documentation for classes, methods, and fields.
// JavaDoc comments start with /** and end with */.
// Use @param for method parameters, @return for return values, @throws for exceptions.
// Documentation can be generated using 'javadoc' tool.

public class UsingJavaDocs {

    /**
     * Main method to demonstrate JavaDocs usage.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("JavaDocs Example\n");

        UsingJavaDocs obj = new UsingJavaDocs();
        int sum = obj.addNumbers(10, 20);
        System.out.println("Sum: " + sum);

        try {
            obj.divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    /**
     * Adds two numbers and returns the sum.
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int addNumbers(int a, int b) {
        return a + b;
    }

    /**
     * Divides two numbers and returns the result.
     * @param a Numerator
     * @param b Denominator
     * @return Result of division
     * @throws ArithmeticException if denominator is zero
     */
    public int divideNumbers(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}


//Key Points about JavaDocs:

//1. JavaDoc comments start with /** and end with */.
//2. Can document classes, methods, and fields.
//3. Use @param to describe method parameters.
//4. Use @return to describe return values.
//5. Use @throws to describe exceptions thrown by methods.
//6. Generate HTML documentation using javadoc tool:
//- Example: javadoc UsingJavaDocs.java
//7. Helps create professional and readable documentation for APIs or projects.

