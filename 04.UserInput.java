// This program explains how to take input from the user in Java.
// We use Scanner class to read input from the keyboard.
// User can enter numbers, text, or single characters.
// This code shows examples of taking different types of input.

import java.util.Scanner; // import Scanner class from java.util package

public class UserInput {
    public static void main(String[] args) {

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Taking integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // reads an integer
        System.out.println("Your age is: " + age);

        // Taking double input
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble(); // reads a decimal number
        System.out.println("Your height is: " + height + " meters");

        // Clearing the buffer after reading number before reading string
        scanner.nextLine(); // important to avoid skipping input

        // Taking string input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // reads a line of text
        System.out.println("Hello, " + name + "!");

        // Taking single character input
        System.out.print("Enter your grade (single character): ");
        char grade = scanner.nextLine().charAt(0); // reads first character of input
        System.out.println("Your grade is: " + grade);

        // Boolean input
        System.out.print("Do you like Java? (true/false): ");
        boolean likesJava = scanner.nextBoolean(); // reads boolean value
        System.out.println("Likes Java? " + likesJava);

        // Closing the scanner
        scanner.close();
    }
}
