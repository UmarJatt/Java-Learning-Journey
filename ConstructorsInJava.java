// This program explains constructors in Java.
// A constructor is a special method used to initialize objects when they are created.
// It has the same name as the class and does not have a return type.
// Types of constructors: Default constructor and Parameterized constructor.

public class ConstructorsInJava {
    public static void main(String[] args) {

        // 1. Using default constructor
        Car car1 = new Car(); // default constructor called
        car1.displayInfo();

        System.out.println();

        // 2. Using parameterized constructor
        Car car2 = new Car("Toyota", "Red", 120);
        car2.displayInfo();

        System.out.println();

        // 3. Another object using parameterized constructor
        Car car3 = new Car("Honda", "Blue", 100);
        car3.displayInfo();
    }
}

// Class with constructors
class Car {
    String brand;
    String color;
    int speed;

    // Default constructor
    Car() {
        brand = "Unknown";
        color = "Unknown";
        speed = 0;
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Car(String brand, String color, int speed) {
        this.brand = brand; // 'this' refers to current object
        this.color = color;
        this.speed = speed;
        System.out.println("Parameterized constructor called");
    }

    // Method to display information
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
    }
}
