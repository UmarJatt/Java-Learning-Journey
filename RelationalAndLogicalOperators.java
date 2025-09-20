// This program explains relational and logical operators in Java.
// Relational operators are used to compare two values and return true or false.
// Logical operators are used to combine multiple boolean conditions.

public class RelationalAndLogicalOperators {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // Relational operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b)); // equal to
        System.out.println("a != b: " + (a != b)); // not equal to
        System.out.println("a > b: " + (a > b));   // greater than
        System.out.println("a < b: " + (a < b));   // less than
        System.out.println("a >= b: " + (a >= b)); // greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // less than or equal to

        System.out.println(); // blank line for readability

        // Logical operators
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y)); // AND -> true if both true
        System.out.println("x || y: " + (x || y)); // OR  -> true if at least one true
        System.out.println("!x: " + (!x));         // NOT -> true if x is false
        System.out.println("!y: " + (!y));         // NOT -> true if y is false

        System.out.println(); // blank line for readability

        // Combining relational and logical operators
        int age = 25;
        int height = 170;

        boolean result1 = (age > 18) && (height > 160); // both conditions must be true
        System.out.println("Age > 18 AND Height > 160? " + result1);

        boolean result2 = (age < 18) || (height > 160); // at least one condition true
        System.out.println("Age < 18 OR Height > 160? " + result2);

        boolean result3 = !(age > 30); // NOT operator
        System.out.println("NOT (Age > 30): " + result3);
    }
}
