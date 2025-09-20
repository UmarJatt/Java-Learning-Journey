// This program demonstrates HashSet in Java.
// HashSet is a collection that stores unique elements (no duplicates).
// It does not maintain any order of elements.
// HashSet uses hashing internally for fast access.

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInJava {
    public static void main(String[] args) {

        System.out.println("HashSet Example\n");

        // Creating a HashSet of String type
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Duplicate ignored
        System.out.println("HashSet: " + fruits);

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Checking if element exists
        System.out.println("Contains 'Orange'? " + fruits.contains("Orange"));
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // Size of HashSet
        System.out.println("Size of HashSet: " + fruits.size());

        // Iterating using for-each loop
        System.out.println("\nIterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterating using Iterator
        System.out.println("\nIterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Clearing HashSet
        fruits.clear();
        System.out.println("\nAfter clearing, is HashSet empty? " + fruits.isEmpty());
    }
}

/*
Key Points about HashSet:

1. HashSet stores unique elements (no duplicates).
2. Does not maintain insertion order.
3. Common methods:
   - add(element), remove(element)
   - contains(element), isEmpty(), size()
   - clear(), iterator()
4. Uses hashing internally, provides fast O(1) access for basic operations.
5. Part of java.util package, import java.util.HashSet to use.
6. Useful when you need a collection of unique elements.
*/
