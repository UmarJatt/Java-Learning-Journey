// This program explains abstract classes and methods in Java.
// An abstract class cannot be instantiated directly and may contain abstract methods.
// An abstract method is a method without a body (no implementation) and must be implemented by child classes.
// Abstract classes can also have regular methods with implementation.

public class AbstractClassAndMethods {
    public static void main(String[] args) {

        // Creating object of child class
        Circle circle = new Circle();
        circle.setRadius(5);
        circle.calculateArea();
        circle.displayInfo();

        System.out.println();

        Rectangle rectangle = new Rectangle();
        rectangle.setDimensions(4, 6);
        rectangle.calculateArea();
        rectangle.displayInfo();
    }
}

// Abstract class
abstract class Shape {
    double area;

    // Abstract method (no body)
    abstract void calculateArea();

    // Regular method
    void displayInfo() {
        System.out.println("Area: " + area);
    }
}

// Child class 1
class Circle extends Shape {
    double radius;

    void setRadius(double r) {
        radius = r;
    }

    @Override
    void calculateArea() {
        area = 3.14 * radius * radius; // area of circle
    }
}

// Child class 2
class Rectangle extends Shape {
    double length, width;

    void setDimensions(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    void calculateArea() {
        area = length * width; // area of rectangle
    }
}
