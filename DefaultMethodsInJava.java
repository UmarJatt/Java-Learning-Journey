// This program explains default methods in Java interfaces.
// Default methods were introduced in Java 8.
// They allow us to add a method in an interface with a default implementation.
// Classes implementing the interface can use it directly or override it.

public class DefaultMethodsInJava {
    public static void main(String[] args) {

        // Creating object of class implementing interface
        Dog dog = new Dog();
        dog.sound(); // overridden method
        dog.sleep(); // default method from interface
    }
}

// Interface with default method
interface Animal {
    void sound(); // abstract method

    // Default method
    default void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// Class implementing interface
class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    // Optional: can override default method if needed
    // @Override
    // public void sleep() {
    //     System.out.println("Dog sleeps 8 hours");
    // }
}
