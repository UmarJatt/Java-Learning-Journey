// This program explains multiple inheritance in Java.
// Java does not allow a class to inherit from more than one class (no multiple class inheritance).
// But multiple inheritance is possible using interfaces.
// A class can implement multiple interfaces to inherit behavior from multiple sources.

public class MultipleInheritance {
    public static void main(String[] args) {

        // Creating object of class that implements multiple interfaces
        SmartPhone phone = new SmartPhone();
        phone.call();
        phone.text();
        phone.internet();
    }
}

// Interface 1
interface Phone {
    void call(); // abstract method
    void text(); // abstract method
}

// Interface 2
interface Internet {
    void internet(); // abstract method
}

// Class implementing multiple interfaces
class SmartPhone implements Phone, Internet {

    @Override
    public void call() {
        System.out.println("Making a call from smartphone");
    }

    @Override
    public void text() {
        System.out.println("Sending a text from smartphone");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on smartphone");
    }
}
