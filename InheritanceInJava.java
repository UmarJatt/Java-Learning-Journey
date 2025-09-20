// This program explains inheritance in Java.
// Inheritance allows a class to acquire properties and methods of another class.
// The class that inherits is called the child (subclass), and the class being inherited from is called the parent (superclass).
// It helps in code reusability and creating hierarchical relationships.

public class InheritanceInJava {
    public static void main(String[] args) {

        // Creating object of child class
        Dog dog = new Dog();
        
        // Accessing method from parent class
        dog.eat(); // inherited method

        // Accessing method from child class
        dog.bark(); // specific to child class

        System.out.println();

        // Creating another object
        Cat cat = new Cat();
        cat.eat(); // inherited method
        cat.meow(); // specific to child class
    }
}

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inheriting Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    // Method overriding example
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

// Another child class
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}
