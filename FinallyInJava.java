// This program explains the finally block in Java.
// The finally block is used to execute code that must run regardless of whether an exception occurs or not.
// Commonly used for cleanup operations like closing files, releasing resources, etc.

public class FinallyInJava {
    public static void main(String[] args) {

        System.out.println("Finally Block Example\n");

        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            // This block executes no matter what
            System.out.println("Finally block executed (always runs)");
        }

        System.out.println("\nAnother example without exception:");

        try {
            int result = 10 / 2; // No exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block executed even when no exception occurs");
        }

        System.out.println("\nFinally block executes even if return statement is used:");

        int value = testFinally();
        System.out.println("Returned value: " + value);
    }

    static int testFinally() {
        try {
            System.out.println("Inside try block of testFinally");
            return 10;
        } finally {
            System.out.println("Finally block in testFinally executes before return");
        }
    }
}

/*
Key Points about finally block:

1. finally block always executes after try-catch, whether an exception occurs or not.
2. Useful for cleanup tasks like closing files, releasing resources, or database connections.
3. finally executes even if return statement is used in try or catch.
4. finally may not execute if JVM exits (System.exit()) or if thread is killed abruptly.
5. Syntax:
   try {
       // code that may throw exception
   } catch(ExceptionType e) {
       // handle exception
   } finally {
       // code that always runs
   }
*/
