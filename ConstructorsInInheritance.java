// This program explains constructors in inheritance in Java.
// When a child class object is created, the parent class constructor is called first.
// The 'super' keyword can be used to call parent class constructor explicitly.

public class ConstructorsInInheritance {
    public static void main(String[] args) {

        // Creating object of child class
        Dog dog = new Dog("Buddy", 3);
        System.out.println();

        // Creating another child object with default constructor
        Cat cat = new Cat();
    }
}

// Parent class
class Animal {
    String name;

    // Default constructor
    Animal() {
        System.out.println("Animal default constructor called");
        name = "Unknown";
    }

    // Parameterized constructor
    Animal(String name) {
        this.name = name;
        System.out.println("Animal parameterized constructor called. Name: " + name);
    }
}

// Child class
class Dog extends Animal {
    int age;

    // Parameterized constructor
    Dog(String name, int age) {
        super(name); // call parent class parameterized constructor
        this.age = age;
        System.out.println("Dog constructor called. Age: " + age);
    }
}

// Another child class
class Cat extends Animal {

    // Default constructor
    Cat() {
        super(); // call parent class default constructor
        System.out.println("Cat constructor called");
    }
}
