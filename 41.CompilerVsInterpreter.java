// This program explains the difference between Compiler and Interpreter in Java.
// Java uses both concepts: source code is compiled into bytecode by the compiler, then interpreted by the JVM.
// Compiler: Translates entire source code into machine/bytecode at once (e.g., javac).
// Interpreter: Executes code line by line at runtime (e.g., JVM interpreting bytecode).

public class CompilerVsInterpreter {
    public static void main(String[] args) {

        System.out.println("Compiler vs Interpreter in Java");

        // Example: simple arithmetic operation
        int a = 10;
        int b = 20;
        int sum = a + b; // Compiler translates this into bytecode
        System.out.println("Sum of " + a + " and " + b + " is: " + sum);

        // Here JVM acts as an interpreter executing bytecode line by line
        System.out.println("This line is interpreted by JVM");
    }
}

/*
Key Points:

1. Compiler:
   - Translates the whole program into bytecode before execution.
   - Faster execution after compilation.
   - Errors detected at compile-time.

2. Interpreter (JVM in Java):
   - Executes bytecode line by line.
   - Slower than compiled code for large programs.
   - Can execute on any platform with JVM (platform independent).

In Java:
- javac (Java Compiler) converts .java source file into .class bytecode file.
- java command (JVM) interprets the bytecode to run the program.
*/
