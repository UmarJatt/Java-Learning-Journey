// This program explains how to create and use a user-defined package in Java.
// A package is a way to group related classes and interfaces together.
// Steps to create a package:
// 1. Create a folder with the package name.
// 2. Add 'package packageName;' at the top of your Java file.
// 3. Compile the class and use 'import' to use it in another program.

// Step 1: Create a package named "mypackage"
// File: MyClass.java inside folder 'mypackage'
/*
package mypackage;

public class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass inside mypackage");
    }
}
*/

// Step 2: Use the package in another program
import mypackage.MyClass; // importing the user-defined package class

public class CreatingJavaPackage {
    public static void main(String[] args) {

        // Creating object of class inside package
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}

/*
Steps to compile and run:

1. Navigate to the folder containing 'mypackage' and 'CreatingJavaPackage.java'.
2. Compile the package class:
   javac mypackage/MyClass.java
3. Compile the main program:
   javac -cp . CreatingJavaPackage.java
4. Run the program:
   java -cp . CreatingJavaPackage

Benefits:
- Organizes classes logically
- Avoids name conflicts
- Makes code reusable
*/
