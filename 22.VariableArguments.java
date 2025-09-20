// This program explains variable arguments (varargs) in Java.
// Varargs allow a method to accept zero or more arguments of the same type.
// It is useful when you don’t know exactly how many arguments will be passed.

public class VariableArguments {
    public static void main(String[] args) {

        // Using varargs to sum numbers
        int sum1 = sumNumbers(10, 20, 30);
        System.out.println("Sum of 10, 20, 30: " + sum1);

        int sum2 = sumNumbers(5, 15);
        System.out.println("Sum of 5, 15: " + sum2);

        int sum3 = sumNumbers(); // no arguments
        System.out.println("Sum with no arguments: " + sum3);

        System.out.println();

        // Using varargs with strings
        printNames("Umar", "Ali", "Ahmed");
        printNames("Sara");
        printNames(); // no names
    }

    // Method using varargs (int... numbers)
    static int sumNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num; // add each number
        }
        return sum;
    }

    // Method using varargs (String... names)
    static void printNames(String... names) {
        if (names.length == 0) {
            System.out.println("No names provided.");
        } else {
            System.out.print("Names: ");
            for (String name : names) {
                System.out.print(name + " ");
            }
            System.out.println();
        }
    }
}
