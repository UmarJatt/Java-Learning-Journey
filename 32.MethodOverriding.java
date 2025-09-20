// This program explains method overriding in Java.
// Method overriding occurs when a child class has a method with the same name, return type, and parameters as a parent class.
// It allows the child class to provide its own implementation of a method.
// 'super' keyword can be used to call the parent class method from the child class.

public class MethodOverriding {
    public static void main(String[] args) {

        // Creating object of parent class
        Animal animal = new Animal();
        animal.sound(); // calls parent method

        System.out.println();

        // Creating object of child class
        Dog dog = new Dog();
        dog.sound(); // calls overridden method in child class

        System.out.println();

        // Using parent reference for child object
        Animal myAnimal = new Dog();
        myAnimal.sound(); // runtime polymorphism: calls child method
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Calling parent method using super
    void parentSound() {
        super.sound();
    }
}
