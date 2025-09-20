// This program explains Java variables.
// Variables are used to store data in a program.
// There are different types of variables in Java like:
// 1. int    -> for whole numbers
// 2. double -> for decimal numbers
// 3. char   -> for single characters
// 4. boolean-> for true/false values
// 5. String -> for text (words, sentences)
// This code also shows how to declare, assign, and print variables.

public class JavaVariables {
    public static void main(String[] args) {

        // Integer variable
        int age = 20; // storing whole number 20
        System.out.println("My age is: " + age);

        // Double variable
        double height = 5.9; // storing decimal number
        System.out.println("My height is: " + height);

        // Character variable
        char grade = 'A'; // storing single character
        System.out.println("My grade is: " + grade);

        // Boolean variable
        boolean isStudent = true; // true or false
        System.out.println("Am I a student? " + isStudent);

        // String variable
        String name = "Umar"; // storing text
        System.out.println("My name is: " + name);

        // Changing variable values
        age = 21; // updating age
        System.out.println("Next year I will be: " + age);

        // Using variables in calculations
        int x = 10;
        int y = 5;
        int sum = x + y; // adding numbers
        System.out.println("Sum of " + x + " and " + y + " is: " + sum);

        // Concatenating variables with text
        System.out.println(name + " is " + age + " years old and " + height + " feet tall.");
    }
}
