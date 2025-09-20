// This program explains Dynamic Method Dispatch in Java.
// Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.
// It allows Java to achieve runtime polymorphism.
// It happens when a parent class reference points to a child class object.

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        // Parent class reference pointing to parent class object
        Animal animal = new Animal();
        animal.sound(); // calls Animal's method

        System.out.println();

        // Parent class reference pointing to child class object
        Animal dog = new Dog();
        dog.sound(); // calls Dog's overridden method (runtime polymorphism)

        System.out.println();

        // Another child class
        Animal cat = new Cat();
        cat.sound(); // calls Cat's overridden method

        System.out.println();

        // Using parent reference variable to call method
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.sound(); // calls Dog's method
        myAnimal = new Cat();
        myAnimal.sound(); // calls Cat's method
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
