// This program demonstrates ArrayList in Java.
// ArrayList is a resizable array, part of Java Collection Framework.
// It allows dynamic addition, removal, and access of elements.
// Common methods: add(), get(), set(), remove(), size(), contains(), isEmpty(), clear(), iterator()

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println("ArrayList Demo Example\n");

        // Creating an ArrayList of String type
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("Fruits ArrayList: " + fruits);

        // Accessing elements using get(index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // Modifying elements using set(index, element)
        fruits.set(1, "Pineapple");
        System.out.println("After modifying index 1: " + fruits);

        // Removing element by index
        fruits.remove(3);
        System.out.println("After removing index 3: " + fruits);

        // Removing element by object
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);

        // Checking if element exists
        System.out.println("Contains 'Orange'? " + fruits.contains("Orange"));

        // Size of ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Check if ArrayList is empty
        System.out.println("Is ArrayList empty? " + fruits.isEmpty());

        // Iterating using for-each loop
        System.out.println("\nIterating using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating using iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Clearing ArrayList
        fruits.clear();
        System.out.println("\nAfter clearing ArrayList, is empty? " + fruits.isEmpty());
    }
}

/*
Key Points about ArrayList:

1. ArrayList is a resizable array in Java.
2. Allows dynamic addition, removal, and access of elements.
3. Common methods:
   - add(element) / add(index, element)
   - get(index)
   - set(index, element)
   - remove(index) / remove(object)
   - size()
   - isEmpty()
   - contains(object)
   - clear()
   - iterator()
4. ArrayList maintains insertion order and allows duplicates.
5. Part of java.util package, import java.util.ArrayList to use.
*/
