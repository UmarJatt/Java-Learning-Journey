// This program demonstrates JavaDoc method tags in Java.
// Method tags help document method parameters, return values, and exceptions.
// Common method tags:
// @param - describes each method parameter
// @return - describes the value returned by the method
// @throws - describes exceptions that a method may throw

public class JavaDocMethodTags {

    public static void main(String[] args) {
        System.out.println("JavaDoc Method Tags Example\n");

        JavaDocMethodTags obj = new JavaDocMethodTags();

        // Using addNumbers method
        int sum = obj.addNumbers(10, 25);
        System.out.println("Sum: " + sum);

        // Using divideNumbers method
        try {
            int result = obj.divideNumbers(50, 5);
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Using greetUser method
        obj.greetUser("Umar");
    }

    /**
     * Adds two integers and returns the sum.
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    public int addNumbers(int a, int b) {
        return a + b;
    }

    /**
     * Divides two integers.
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

    /**
     * Prints a greeting message for the user.
     * @param name Name of the user
     */
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to JavaDoc method tags tutorial.");
    }
}


//Key Points about JavaDoc Method Tags:

//1. @param - Describe each input parameter of a method.
//2. @return - Describe what the method returns.
//3. @throws - Describe exceptions the method may throw.
//4. Helps other developers understand how to use methods correctly.
//5. JavaDoc comments start with /** and end with */.
//6. Generate HTML documentation using 'javadoc FileName.java'.
//7. Makes code professional and maintainable.
