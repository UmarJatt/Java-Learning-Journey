// This program explains the differences between abstract classes and interfaces in Java.
// Both are used to achieve abstraction, but they have differences in usage, inheritance, and method implementation.

public class AbstractClassVsInterface {
    public static void main(String[] args) {

        // Using abstract class
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.calculateArea();
        circle.displayInfo();

        System.out.println();

        // Using interface
        Dog dog = new Dog();
        dog.sound();
        dog.sleep();
    }
}

// ---------------- Abstract Class Example ----------------
abstract class Shape {
    double area;

    // Abstract method
    abstract void calculateArea();

    // Regular method
    void displayInfo() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    @Override
    void calculateArea() {
        area = 3.14 * radius * radius;
    }
}

// ---------------- Interface Example ----------------
interface Animal {
    void sound(); // abstract method
    void sleep(); // abstract method
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps 8 hours");
    }
}

/*
Differences:

1. Abstract Class:
   - Can have abstract and regular methods.
   - Can have fields with access modifiers.
   - Supports single inheritance (extends only one class).
   - Can have constructors.
   
2. Interface:
   - All methods are abstract by default (except default/static methods in Java 8+).
   - Cannot have instance fields (only constants).
   - Supports multiple inheritance (implements multiple interfaces).
   - Cannot have constructors.
*/
