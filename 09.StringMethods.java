// This program explains common String methods in Java.
// Strings are sequences of characters, and Java provides many methods to work with them.
// This code shows useful methods like length, charAt, concat, equals, substring, replace, etc.

public class StringMethods {
    public static void main(String[] args) {

        // Creating strings
        String text = "Hello, Java!";
        String name = "Umar";

        // 1. length() -> returns number of characters in string
        System.out.println("Length of text: " + text.length());

        // 2. charAt(index) -> returns character at specified index
        System.out.println("Character at index 7: " + text.charAt(7));

        // 3. concat() -> joins two strings
        String message = text.concat(" Welcome, " + name + "!");
        System.out.println("Concatenated message: " + message);

        // 4. equals() -> compares two strings (case-sensitive)
        String str1 = "Java";
        String str2 = "java";
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // 5. equalsIgnoreCase() -> compares two strings ignoring case
        System.out.println("str1 equals str2 ignoring case? " + str1.equalsIgnoreCase(str2));

        // 6. toUpperCase() and toLowerCase() -> converts case
        System.out.println("Uppercase text: " + text.toUpperCase());
        System.out.println("Lowercase text: " + text.toLowerCase());

        // 7. contains() -> checks if string contains specified text
        System.out.println("Does text contain 'Java'? " + text.contains("Java"));

        // 8. startsWith() and endsWith() -> checks start and end of string
        System.out.println("Text starts with 'Hello'? " + text.startsWith("Hello"));
        System.out.println("Text ends with '!': " + text.endsWith("!"));

        // 9. indexOf() and lastIndexOf() -> returns index of character or substring
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Last index of 'a': " + text.lastIndexOf('a'));

        // 10. substring() -> extracts part of string
        System.out.println("Substring from index 7: " + text.substring(7));
        System.out.println("Substring from index 0 to 5: " + text.substring(0, 5));

        // 11. replace() -> replaces characters or substring
        System.out.println("Replace 'Java' with 'World': " + text.replace("Java", "World"));

        // 12. trim() -> removes spaces at beginning and end
        String spacedText = "   Java Programming   ";
        System.out.println("Before trim: '" + spacedText + "'");
        System.out.println("After trim: '" + spacedText.trim() + "'");

        // 13. split() -> splits string into array using delimiter
        String fruits = "Apple,Banana,Mango";
        String[] fruitArray = fruits.split(",");
        System.out.print("Fruits: ");
        for (String fruit : fruitArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 14. isEmpty() -> checks if string is empty
        String emptyString = "";
        System.out.println("Is emptyString empty? " + emptyString.isEmpty());
    }
}
