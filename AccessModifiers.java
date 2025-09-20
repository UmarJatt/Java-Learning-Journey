// This program explains access modifiers in Java.
// Access modifiers control the visibility of classes, methods, and variables.
// There are four main types:
// 1. public    -> accessible from anywhere
// 2. private   -> accessible only within the same class
// 3. default   -> accessible within the same package (no modifier)
// 4. protected -> accessible within the same package and by subclasses

public class AccessModifiers {
    public static void main(String[] args) {

        Person person = new Person();

        // Accessing public field
        person.name = "Umar"; // public: accessible everywhere
        System.out.println("Name (public): " + person.name);

        // Accessing private field directly is not allowed
        // person.age = 19; // Error! private

        // Using getter and setter to access private field
        person.setAge(19); // using setter
        System.out.println("Age (private via getter): " + person.getAge());

        // Accessing default field
        person.city = "Jamshoro"; // default: accessible in same package
        System.out.println("City (default): " + person.city);

        // Accessing protected field
        person.country = "Pakistan"; // protected: accessible in same package or subclasses
        System.out.println("Country (protected): " + person.country);
    }
}

// Class demonstrating access modifiers
class Person {
    public String name;         // public: accessible anywhere
    private int age;            // private: accessible only within this class
    String city;                 // default: accessible in same package
    protected String country;    // protected: accessible in same package and subclasses

    // Getter for private field
    public int getAge() {
        return age;
    }

    // Setter for private field
    public void setAge(int age) {
        this.age = age;
    }
}

/*
Summary:

1. public: Accessible from any class in any package.
2. private: Accessible only within the class it is defined.
3. default (no modifier): Accessible only within the same package.
4. protected: Accessible within same package and subclasses (even in different packages).
*/
