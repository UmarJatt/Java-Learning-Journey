// This program demonstrates Anonymous Classes and Lambda Expressions in Java.
// Anonymous classes: classes without a name, usually used for short-term implementation of interfaces or extending classes.
// Lambda expressions: concise way to implement functional interfaces using -> syntax.
// Both are useful for simplifying code, especially with event handling or functional programming.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AnonymousClassesAndLambdaExpressions {
    public static void main(String[] args) {

        System.out.println("Anonymous Classes and Lambda Expressions Example\n");

        // ---------------- Anonymous Class Example ----------------
        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("This is running inside an anonymous class.");
            }
        };
        anonymousRunnable.run();

        // ---------------- Lambda Expression Example ----------------
        Runnable lambdaRunnable = () -> System.out.println("This is running inside a lambda expression.");
        lambdaRunnable.run();

        // ---------------- Using Lambda with Comparator ----------------
        ArrayList<String> names = new ArrayList<>();
        names.add("Umar");
        names.add("Ali");
        names.add("Sara");
        names.add("Zara");

        // Sorting using anonymous class
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("Sorted Names with Anonymous Class: " + names);

        // Sorting using lambda expression
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted Names with Lambda Expression: " + names);
    }
}

/*
Key Points about Anonymous Classes and Lambda Expressions:

1. Anonymous classes: no name, defined and instantiated at the same time.
   - Useful for short implementations of interfaces or abstract classes.
2. Lambda expressions: concise way to implement functional interfaces.
   - Syntax: (parameters) -> { body } or (parameters) -> expression
3. Both reduce boilerplate code, especially for event handling and collections operations.
4. Functional interface: interface with only one abstract method (required for lambdas).
5. Lambda expressions cannot access non-final local variables unless effectively final.
6. Helps in writing cleaner, readable, and modern Java code.
*/
