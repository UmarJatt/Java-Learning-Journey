// This program explains Java literals.
// Literals are fixed values we directly write in the code.
// Examples of literals are numbers, text, characters, true/false values.
// This code shows different types of literals and how to use them.

public class JavaLiterals {
    public static void main(String[] args) {

        // Integer literal
        int age = 25; // 25 is an integer literal
        System.out.println("Age: " + age);

        // Double literal
        double price = 99.99; // 99.99 is a double literal
        System.out.println("Price: " + price);

        // Character literal
        char grade = 'B'; // 'B' is a character literal
        System.out.println("Grade: " + grade);

        // String literal
        String name = "Umar"; // "Umar" is a string literal
        System.out.println("Name: " + name);

        // Boolean literal
        boolean isJavaFun = true; // true is a boolean literal
        System.out.println("Is Java fun? " + isJavaFun);

        // Example of arithmetic using literals
        int sum = 10 + 20; // 10 and 20 are integer literals
        System.out.println("Sum of 10 and 20 is: " + sum);

        // Floating point literals
        float pi = 3.14f; // f is used to tell Java it's a float literal
        System.out.println("Value of pi: " + pi);

        // Using underscores in numeric literals for better readability
        int bigNumber = 1_000_000; // same as 1000000
        System.out.println("Big number: " + bigNumber);

        // Escape sequence in string literal
        String message = "Hello,\nWelcome to Java!"; // \n makes a new line
        System.out.println(message);
    }
}
