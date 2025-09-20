// This program demonstrates Java Annotations.
// Annotations provide metadata about the code, which can be used by the compiler or runtime.
// Common uses: provide information, enforce checks, or influence program behavior.
// Some built-in annotations: @Override, @Deprecated, @SuppressWarnings

public class JavaAnnotations {

    public static void main(String[] args) {

        System.out.println("Java Annotations Example\n");

        JavaAnnotations obj = new JavaAnnotations();
        obj.displayMessage();

        // Using deprecated method (will give a warning)
        obj.oldMethod();
    }

    /**
     * This method displays a simple message.
     */
    public void displayMessage() {
        System.out.println("Hello! This is a method using Java Annotations example.");
    }

    /**
     * This is a deprecated method.
     * @deprecated Use displayMessage() instead
     */
    @Deprecated
    public void oldMethod() {
        System.out.println("This method is deprecated. Avoid using it.");
    }

    /**
     * Example of @Override annotation
     */
    @Override
    public String toString() {
        return "JavaAnnotations class object";
    }

    /**
     * Example of suppressing warnings
     */
    @SuppressWarnings("unused")
    public void suppressWarningExample() {
        int unusedVariable = 10; // Normally gives warning
    }
}

/*
Key Points about Java Annotations:

1. Annotations provide metadata for classes, methods, and fields.
2. Common built-in annotations:
   - @Override: Ensures method overrides a superclass method.
   - @Deprecated: Marks a method or class as outdated.
   - @SuppressWarnings: Suppresses compiler warnings.
3. Can be used by compiler, IDE, or at runtime (via reflection).
4. Custom annotations can also be created for specific purposes.
5. Helps in better code readability, maintenance, and compiler checks.
6. No effect on program execution unless processed by compiler or runtime.
*/
