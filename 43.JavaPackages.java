// This program explains Java packages.
// A package in Java is a way to organize classes and interfaces into namespaces.
// It helps avoid naming conflicts and makes code easier to manage.
// Types of packages:
// 1. Built-in Packages (java.util, java.io, etc.)
// 2. User-defined Packages

// Example using built-in package
import java.util.Scanner; // importing Scanner class from java.util package

public class JavaPackages {
    public static void main(String[] args) {

        System.out.println("Using Java packages example:");

        // Using Scanner from java.util package
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // reading input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        scanner.close();
    }
}

/*
User-defined package example:

1. Create a package folder, e.g., "mypackage"
2. Create a class inside the package:

   package mypackage;
   public class MyClass {
       public void display() {
           System.out.println("Hello from MyClass in mypackage");
       }
   }

3. Use the class in another program:
   import mypackage.MyClass;
   public class TestPackage {
       public static void main(String[] args) {
           MyClass obj = new MyClass();
           obj.display();
       }
   }

Benefits of packages:
- Avoid class name conflicts
- Organize code logically
- Easier maintenance
*/
