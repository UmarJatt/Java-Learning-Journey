// This program explains method overloading in Java.
// Method overloading allows creating multiple methods with the same name but different parameters.
// The return type can be same or different, but parameter list must be different.
// It helps to perform similar tasks with different inputs using the same method name.

public class MethodOverloading {
    public static void main(String[] args) {

        // Using method overloading with integers
        int sumInt = add(10, 20);
        System.out.println("Sum of 10 and 20: " + sumInt);

        // Using method overloading with doubles
        double sumDouble = add(5.5, 3.5);
        System.out.println("Sum of 5.5 and 3.5: " + sumDouble);

        // Using method overloading with three integers
        int sumThree = add(1, 2, 3);
        System.out.println("Sum of 1, 2, and 3: " + sumThree);

        // Using method overloading with a string
        String result = add("Hello", "World");
        System.out.println("Concatenated string: " + result);
    }

    // Method 1: adding two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 2: adding two doubles
    static double add(double a, double b) {
        return a + b;
    }

    // Method 3: adding three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 4: concatenating two strings
    static String add(String a, String b) {
        return a + b;
    }
}
