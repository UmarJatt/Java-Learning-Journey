// This program explains the basics of Object-Oriented Programming (OOP) in Java.
// OOP allows us to model real-world objects in programming.
// Main concepts include: class, object, fields (variables), and methods (functions).

public class OOPInJava {
    public static void main(String[] args) {

        // 1. Creating an object of the class Student
        Student student1 = new Student(); // create object
        student1.name = "Umar"; // setting field values
        student1.age = 19;

        // 2. Accessing methods using the object
        student1.displayInfo();

        System.out.println();

        // 3. Creating another object
        Student student2 = new Student();
        student2.name = "Ali";
        student2.age = 20;
        student2.displayInfo();

        System.out.println();

        // 4. Using method with parameters
        student2.setInfo("Ahmed", 21);
        student2.displayInfo();
    }
}

// Class definition
class Student {
    // Fields (attributes or properties)
    String name;
    int age;

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method to set information
    void setInfo(String name, int age) {
        this.name = name; // 'this' refers to the current object
        this.age = age;
    }
}
