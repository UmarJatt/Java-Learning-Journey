// This program explains interfaces in Java.
// An interface is like a contract that a class can implement.
// It contains abstract methods (without body) by default and can also have default or static methods.
// A class can implement multiple interfaces (multiple inheritance support in Java).

public class InterfacesInJava {
    public static void main(String[] args) {

        // Creating object of class that implements interface
        Dog dog = new Dog();
        dog.sound(); // implemented method
        dog.sleep(); // implemented method

        System.out.println();

        Cat cat = new Cat();
        cat.sound();
        cat.sleep();
    }
}

// Interface 1
interface Animal {
    void sound(); // abstract method
}

// Interface 2
interface Sleeper {
    void sleep(); // abstract method
}

// Class implementing multiple interfaces
class Dog implements Animal, Sleeper {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps 8 hours");
    }
}

// Another class implementing interfaces
class Cat implements Animal, Sleeper {

    @Override
    public void sound() {
        System.out.println("Cat meows");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeps 12 hours");
    }
}
