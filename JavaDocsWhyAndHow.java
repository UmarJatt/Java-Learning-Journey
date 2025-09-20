// This program explains the purpose of JavaDocs and how to use them in Java.
// JavaDocs are special comments used to generate HTML documentation for classes, methods, and fields.
// They make code more readable and help other developers understand your code easily.
// JavaDocs start with /** and end with */, different from normal comments (// or /* */).
// You can generate HTML documentation using the 'javadoc' tool.

public class JavaDocsWhyAndHow {

    /**
     * Main method to demonstrate JavaDocs usage.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        System.out.println("JavaDocs Why and How Example\n");

        JavaDocsWhyAndHow obj = new JavaDocsWhyAndHow();
        obj.greetUser("Umar");
    }

    /**
     * Greets the user with a custom message.
     * @param name The name of the user
     */
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to JavaDocs tutorial.");
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
     * Divides two numbers and may throw ArithmeticException if denominator is zero.
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

/*
Key Points about JavaDocs:

1. JavaDocs help create professional documentation for classes, methods, and fields.
2. Start JavaDoc comment with /** and end with */.
3. Use @param to describe method parameters.
4. Use @return to describe return values.
5. Use @throws to describe exceptions thrown by methods.
6. Use 'javadoc FileName.java' in terminal to generate HTML documentation.
7. Helps in making code readable and maintainable, especially in large projects.
8. Part of standard Java tools, no extra library needed.
*/
