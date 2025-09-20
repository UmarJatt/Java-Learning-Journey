// This program explains Java operators and expressions.
// Operators are symbols that perform operations on variables and values.
// Examples of operators: +, -, *, /, %, ++, --, =, ==, !=, >, <, &&, ||, !
// Expressions are combinations of variables, literals, and operators that produce a value.

public class OperatorsAndExpressions {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 5;

        System.out.println("a + b = " + (a + b)); // addition
        System.out.println("a - b = " + (a - b)); // subtraction
        System.out.println("a * b = " + (a * b)); // multiplication
        System.out.println("a / b = " + (a / b)); // division
        System.out.println("a % b = " + (a % b)); // remainder

        // Increment and Decrement
        int c = 7;
        System.out.println("c = " + c);
        System.out.println("c++ = " + (c++)); // post-increment
        System.out.println("++c = " + (++c)); // pre-increment
        System.out.println("c-- = " + (c--)); // post-decrement
        System.out.println("--c = " + (--c)); // pre-decrement

        // Assignment Operators
        int d = 20;
        d += 5; // same as d = d + 5
        System.out.println("d after d += 5: " + d);
        d -= 3; // same as d = d - 3
        System.out.println("d after d -= 3: " + d);
        d *= 2; // same as d = d * 2
        System.out.println("d after d *= 2: " + d);
        d /= 4; // same as d = d / 4
        System.out.println("d after d /= 4: " + d);
        d %= 3; // same as d = d % 3
        System.out.println("d after d %= 3: " + d);

        // Comparison Operators
        int x = 10, y = 20;
        System.out.println("x == y: " + (x == y)); // equals
        System.out.println("x != y: " + (x != y)); // not equals
        System.out.println("x > y: " + (x > y));   // greater than
        System.out.println("x < y: " + (x < y));   // less than
        System.out.println("x >= y: " + (x >= y)); // greater than or equal
        System.out.println("x <= y: " + (x <= y)); // less than or equal

        // Logical Operators
        boolean p = true, q = false;
        System.out.println("p && q: " + (p && q)); // AND
        System.out.println("p || q: " + (p || q)); // OR
        System.out.println("!p: " + (!p));         // NOT

        // Combining operators in expressions
        int result = (a + b) * (x - y); // expression with multiple operators
        System.out.println("Result of (a + b) * (x - y) = " + result);
    }
}
