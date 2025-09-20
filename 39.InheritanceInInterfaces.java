// This program explains inheritance in interfaces in Java.
// Interfaces can inherit from one or more interfaces using the 'extends' keyword.
// This allows a child interface to inherit abstract methods from parent interfaces.
// A class implementing the child interface must provide implementation for all inherited methods.

public class InheritanceInInterfaces {
    public static void main(String[] args) {

        // Creating object of class implementing child interface
        SmartDevice device = new SmartPhone();
        device.call();
        device.text();
        device.internet();
        device.music();
    }
}

// Parent Interface 1
interface Phone {
    void call();
    void text();
}

// Parent Interface 2
interface Internet {
    void internet();
}

// Child Interface extending multiple parent interfaces
interface SmartDevice extends Phone, Internet {
    void music(); // additional abstract method
}

// Class implementing child interface
class SmartPhone implements SmartDevice {

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

    @Override
    public void music() {
        System.out.println("Playing music on smartphone");
    }
}
