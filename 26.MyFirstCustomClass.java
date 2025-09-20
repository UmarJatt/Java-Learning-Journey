// This program explains how to create your first custom class in Java.
// A custom class is a user-defined blueprint to create objects.
// It can have fields (variables) and methods (functions) to represent real-world entities.

public class MyFirstCustomClass {
    public static void main(String[] args) {

        // Creating an object of the custom class Car
        Car myCar = new Car(); // create object
        myCar.brand = "Toyota"; // setting field values
        myCar.color = "Red";
        myCar.speed = 120;

        // Calling methods using the object
        myCar.displayInfo();
        myCar.accelerate();
        myCar.brake();

        System.out.println();

        // Creating another object
        Car yourCar = new Car();
        yourCar.brand = "Honda";
        yourCar.color = "Blue";
        yourCar.speed = 100;

        yourCar.displayInfo();
        yourCar.accelerate();
        yourCar.brake();
    }
}

// Custom class Car
class Car {
    // Fields (attributes)
    String brand;
    String color;
    int speed;

    // Method to display information
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Speed: " + speed + " km/h");
    }

    // Method to accelerate
    void accelerate() {
        speed += 20; // increase speed by 20
        System.out.println(brand + " accelerated to " + speed + " km/h");
    }

    // Method to brake
    void brake() {
        speed -= 20; // decrease speed by 20
        System.out.println(brand + " slowed down to " + speed + " km/h");
    }
}
