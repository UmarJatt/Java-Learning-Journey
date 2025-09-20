// This program explains whether Java is compiled or interpreted.
// Java is both compiled and interpreted:
// 1. Java source code (.java) is compiled into bytecode (.class) by the Java Compiler (javac).
// 2. Bytecode is interpreted by the Java Virtual Machine (JVM) line by line at runtime.
// This makes Java platform-independent and secure.

public class JavaCompiledOrInterpreted {
    public static void main(String[] args) {

        System.out.println("Is Java compiled or interpreted?");
        System.out.println("Answer: Java is both compiled and interpreted.\n");

        // Example: simple addition
        int x = 15;
        int y = 25;

        // Compilation: javac converts this into bytecode
        int result = x + y;

        // Interpretation: JVM executes bytecode line by line
        System.out.println("Sum of " + x + " and " + y + " is: " + result);

        // Another example
        System.out.println("Java bytecode is interpreted by JVM for execution.");
    }
}

/*
Summary:

- Compilation in Java: Source code -> Bytecode (.class) using javac.
- Interpretation in Java: JVM executes bytecode line by line.
- Benefit: Platform-independent (Write Once, Run Anywhere).
- Conclusion: Java is both compiled (by javac) and interpreted (by JVM).
*/
