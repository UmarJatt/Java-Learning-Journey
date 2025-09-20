// This program explains if-else statements in Java.
// If-else statements are used to make decisions in a program.
// The program runs different code depending on conditions (true or false).

public class IfElse {
    public static void main(String[] args) {

        int age = 18;

        // Simple if statement
        if (age >= 18) {
            System.out.println("You are an adult.");
        }

        // if-else statement
        if (age < 18) {
            System.out.println("You are a minor.");
        } else {
            System.out.println("You are eligible to vote.");
        }

        // if-else-if ladder
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 70) {
            System.out.println("Grade: B+");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C or below");
        }

        // Nested if statement
        int number = 20;
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + " is a positive even number.");
            } else {
                System.out.println(number + " is a positive odd number.");
            }
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        // Using boolean condition
        boolean isJavaFun = true;
        if (isJavaFun) {
            System.out.println("Yes! Java is fun.");
        } else {
            System.out.println("No! Java is not fun.");
        }
    }
}
