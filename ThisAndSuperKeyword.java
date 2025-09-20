// This program explains the 'this' and 'super' keywords in Java.
// 'this' refers to the current object of the class.
// It is used to access current class fields, methods, or constructors.
// 'super' refers to the parent class object.
// It is used to access parent class fields, methods, or constructors.

public class ThisAndSuperKeyword {
    public static void main(String[] args) {

        // Example using 'this'
        Student student = new Student("Umar", 19);
        student.displayInfo();

        System.out.println();

        // Example using 'super' in inheritance
        Dog dog = new Dog("Buddy", 3);
        dog.displayInfo();
    }
}

// ---------------- Using 'this' keyword ----------------
class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name; // 'this' refers to current object's field
        this.age = age;
    }

    // Method to display info
    void displayInfo() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }
}

// ---------------- Using 'super' keyword ----------------
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called. Name: " + name);
    }

    void displayInfo() {
        System.out.println("Animal Name: " + name);
    }
}

class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name); // calls parent class constructor
        this.age = age; // 'this' refers to current object field
        System.out.println("Dog constructor called. Age: " + age);
    }

    @Override
    void displayInfo() {
        super.displayInfo(); // calls parent class method
        System.out.println("Dog Age: " + age);
    }
}
