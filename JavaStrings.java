// This program explains Java Strings.
// A String is a sequence of characters used to store text.
// Strings are non-primitive data types in Java.
// This code shows how to create strings, join them, and use some important methods.

public class JavaStrings {
    public static void main(String[] args) {

        // Creating strings
        String name = "Umar"; // string literal
        String greeting = "Hello"; // another string

        // Printing strings
        System.out.println("Name: " + name);
        System.out.println("Greeting: " + greeting);

        // Concatenation (joining strings)
        String message = greeting + " " + name + "!";
        System.out.println("Message: " + message);

        // Getting the length of a string
        int length = name.length();
        System.out.println("Length of name: " + length);

        // Converting to uppercase and lowercase
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());

        // Accessing a character at a specific position
        char firstChar = name.charAt(0);
        System.out.println("First character of name: " + firstChar);

        // Comparing strings
        String name2 = "umar";
        System.out.println("Is name equal to name2? " + name.equals(name2)); // case-sensitive
        System.out.println("Is name equal to name2 (ignore case)? " + name.equalsIgnoreCase(name2));

        // Checking if a string contains another string
        System.out.println("Does message contain 'Hello'? " + message.contains("Hello"));

        // Replacing text in a string
        String newMessage = message.replace("Hello", "Hi");
        System.out.println("New message: " + newMessage);

        // Substring (extract part of string)
        String part = message.substring(6); // from index 6 to end
        System.out.println("Substring from index 6: " + part);

        // Trimming spaces
        String text = "   Java Strings   ";
        System.out.println("Before trim: '" + text + "'");
        System.out.println("After trim: '" + text.trim() + "'");

        // Splitting a string
        String fruits = "Apple,Banana,Mango";
        String[] fruitArray = fruits.split(",");
        System.out.print("Fruits: ");
        for (String fruit : fruitArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();
    }
}
