// This program explains polymorphism using interfaces in Java.
// Polymorphism allows a single interface reference to point to objects of different implementing classes.
// It helps achieve runtime flexibility and dynamic method calls.

public class PolymorphismInInterfaces {
    public static void main(String[] args) {

        // Interface reference pointing to Dog object
        Animal animal = new Dog();
        animal.sound(); // calls Dog's implementation

        System.out.println();

        // Interface reference pointing to Cat object
        animal = new Cat();
        animal.sound(); // calls Cat's implementation

        System.out.println();

        // Interface reference pointing to Lion object
        animal = new Lion();
        animal.sound(); // calls Lion's implementation
    }
}

// Interface
interface Animal {
    void sound(); // abstract method
}

// Implementing class 1
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Implementing class 2
class Cat implements Animal {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

// Implementing class 3
class Lion implements Animal {

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}
