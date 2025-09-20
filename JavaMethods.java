// This program explains methods in Java.
// A method is a block of code that performs a specific task.
// Methods help in code reusability and better organization.
// A method can have parameters (inputs) and can return a value (output).

public class JavaMethods {

    public static void main(String[] args) {

        // 1. Calling a method without parameters and without return value
        sayHello();

        System.out.println();

        // 2. Calling a method with parameters but no return value
        greetUser("Umar");

        System.out.println();

        // 3. Calling a method with parameters and returning a value
        int sumResult = addNumbers(10, 20);
        System.out.println("Sum of 10 and 20: " + sumResult);

        System.out.println();

        // 4. Using method overloading (same method name, different parameters)
        int multiplyResult1 = multiply(5, 3); // two integers
        double multiplyResult2 = multiply(2.5, 4.0); // two doubles
        System.out.println("Multiply 5 * 3: " + multiplyResult1);
        System.out.println("Multiply 2.5 * 4.0: " + multiplyResult2);

        System.out.println();

        // 5. Using method with no parameters but returning a value
        int randomNumber = getRandomNumber();
        System.out.println("Random number: " + randomNumber);
    }

    // Method without parameters and without return value
    static void sayHello() {
        System.out.println("Hello! Welcome to Java Methods.");
    }

    // Method with parameters but no return value
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Have a nice day.");
    }

    // Method with parameters and returning a value
    static int addNumbers(int a, int b) {
        return a + b;
    }

    // Method overloading example
    static int multiply(int a, int b) {
        return a * b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    // Method with no parameters but returning a value
    static int getRandomNumber() {
        return (int) (Math.random() * 100); // random number between 0-99
    }
}
