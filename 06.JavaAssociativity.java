// This program explains Java associativity.
// Associativity defines the order in which operators of the same precedence are evaluated.
// Most operators in Java are left-to-right associative.
// Some operators like assignment (=) are right-to-left associative.
// This code shows examples of both.

public class JavaAssociativity {
    public static void main(String[] args) {

        // Left-to-right associativity example
        int a = 10;
        int b = 5;
        int c = 2;

        // Addition and subtraction are left-to-right
        int result1 = a - b + c; // same as (a - b) + c
        System.out.println("Result of a - b + c: " + result1);

        // Multiplication and division are also left-to-right
        int result2 = a / b * c; // same as (a / b) * c
        System.out.println("Result of a / b * c: " + result2);

        // Right-to-left associativity example
        int x, y, z;

        x = y = z = 100; // assignment is right-to-left
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);

        // Combining operators with different associativity
        int result3 = a + b * c - 5; 
        // multiplication (*) evaluated first, then addition (+) and subtraction (-) left-to-right
        System.out.println("Result of a + b * c - 5: " + result3);

        // Demonstrating unary operator associativity (right-to-left)
        int p = 5;
        int q = ++p + p++; 
        // ++p evaluated first (right-to-left for unary), then p++
        System.out.println("Value of q (using ++p + p++): " + q);
        System.out.println("Current value of p after operation: " + p);
    }
}
