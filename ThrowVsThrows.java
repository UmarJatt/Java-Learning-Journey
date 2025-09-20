// This program explains the difference between 'throw' and 'throws' in Java.
// 'throw' is used to actually throw an exception from a method or block.
// 'throws' is used in a method declaration to specify which exceptions the method might throw.

public class ThrowVsThrows {
    public static void main(String[] args) {

        System.out.println("Throw vs Throws Example\n");

        // Example using throw
        try {
            checkNumber(-5); // negative number, will throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught using throw: " + e);
        }

        // Example using throws
        try {
            readFile("test.txt"); // may throw checked exception
        } catch (Exception e) {
            System.out.println("Exception caught using throws: " + e);
        }

        System.out.println("Program continues after handling exceptions.");
    }

    // Using throw to throw an exception
    static void checkNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive"); // throwing exception
        } else {
            System.out.println("Number is valid: " + num);
        }
    }

    // Using throws to declare exception
    static void readFile(String filename) throws Exception {
        // Simulating file read that may throw Exception
        throw new Exception("File not found: " + filename);
    }
}

/*
Key Points:

1. throw:
   - Used to actually throw an exception.
   - Can throw only one exception at a time.
   - Used inside method or block.
   - Example: throw new IllegalArgumentException("Error");

2. throws:
   - Used in method declaration to indicate which exceptions may occur.
   - Can declare multiple exceptions separated by comma.
   - Alerts the caller of the method to handle the exception.
   - Example: void readFile() throws IOException, NullPointerException

3. Checked vs Unchecked:
   - throw can be used for both checked and unchecked exceptions.
   - throws is mainly used for checked exceptions.
*/
