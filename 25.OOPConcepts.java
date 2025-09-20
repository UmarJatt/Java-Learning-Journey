// This program explains the main Object-Oriented Programming (OOP) concepts in Java.
// OOP concepts help us write organized, reusable, and maintainable code.
// Main concepts: Encapsulation, Inheritance, Polymorphism, Abstraction.

public class OOPConcepts {
    public static void main(String[] args) {

        // 1. Encapsulation example
        System.out.println("Encapsulation:");
        Employee emp = new Employee();
        emp.setName("Umar"); // setting name using setter
        emp.setSalary(50000); // setting salary using setter
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        System.out.println();

        // 2. Inheritance example
        System.out.println("Inheritance:");
        Dog dog = new Dog();
        dog.eat(); // inherited from Animal class
        dog.bark(); // specific to Dog class

        System.out.println();

        // 3. Polymorphism example
        System.out.println("Polymorphism:");
        Animal myAnimal = new Dog(); // reference of parent class
        myAnimal.eat(); // overridden method in Dog class (runtime polymorphism)

        System.out.println();

        // 4. Abstraction example
        System.out.println("Abstraction:");
        Shape circle = new Circle();
        circle.draw(); // calls draw method of Circle (abstract class example)
    }
}

// ----------------- Encapsulation -----------------
class Employee {
    private String name; // private field
    private double salary; // private field

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// ----------------- Inheritance -----------------
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }

    // Method overriding (runtime polymorphism)
    @Override
    void eat() {
        System.out.println("Dog is eating");
    }
}

// ----------------- Abstraction -----------------
abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}
