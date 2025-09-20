// This program explains Java data types.
// Data types define what type of data a variable can hold.
// Java has two main types of data types:
// 1. Primitive Data Types -> basic types like int, double, char, boolean, etc.
// 2. Non-Primitive Data Types -> like String, Arrays, Objects, etc.
// This code shows examples of all common data types.

public class JavaDataTypes {
    public static void main(String[] args) {

        // Primitive Data Types

        // byte -> 1 byte, range: -128 to 127
        byte myByte = 100;
        System.out.println("Byte value: " + myByte);

        // short -> 2 bytes, range: -32,768 to 32,767
        short myShort = 10000;
        System.out.println("Short value: " + myShort);

        // int -> 4 bytes, range: -2,147,483,648 to 2,147,483,647
        int myInt = 100000;
        System.out.println("Int value: " + myInt);

        // long -> 8 bytes, range: very large, use L at the end
        long myLong = 10000000000L;
        System.out.println("Long value: " + myLong);

        // float -> 4 bytes, decimal number, use f at the end
        float myFloat = 5.75f;
        System.out.println("Float value: " + myFloat);

        // double -> 8 bytes, decimal number
        double myDouble = 19.99;
        System.out.println("Double value: " + myDouble);

        // char -> 2 bytes, stores a single character
        char myChar = 'A';
        System.out.println("Char value: " + myChar);

        // boolean -> 1 bit, true or false
        boolean myBoolean = true;
        System.out.println("Boolean value: " + myBoolean);

        // Non-Primitive Data Types

        // String -> stores text
        String myName = "Umar";
        System.out.println("String value: " + myName);

        // Arrays -> stores multiple values of same type
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array values: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Object -> every class is an object
        JavaDataTypes obj = new JavaDataTypes();
        System.out.println("This is an object of JavaDataTypes class: " + obj);
    }
}
