// This program explains hashing in Java using HashMap and HashSet.
// Hashing is a technique to store data in a way that allows fast access using a key.
// HashMap stores key-value pairs, while HashSet stores unique elements (keys only).
// HashMap and HashSet use hashCode() and equals() methods internally for storage and retrieval.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashingInJava {
    public static void main(String[] args) {

        System.out.println("Hashing in Java Example\n");

        // ---------------- Using HashMap ----------------
        Map<String, Integer> studentMarks = new HashMap<>();

        // Adding key-value pairs
        studentMarks.put("Ali", 85);
        studentMarks.put("Sara", 92);
        studentMarks.put("John", 78);
        studentMarks.put("Ali", 90); // Updating value for existing key

        System.out.println("HashMap (Student Marks): " + studentMarks);

        // Accessing value by key
        System.out.println("Marks of Sara: " + studentMarks.get("Sara"));

        // Checking if key exists
        System.out.println("Contains key 'John'? " + studentMarks.containsKey("John"));

        // Removing a key-value pair
        studentMarks.remove("John");
        System.out.println("After removing John: " + studentMarks);

        // Iterating over HashMap
        System.out.println("\nIterating over HashMap:");
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // ---------------- Using HashSet ----------------
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate ignored

        System.out.println("\nHashSet of fruits: " + fruits);

        // Check if element exists
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After removing 'Orange': " + fruits);
    }
}

/*
Key Points about Hashing in Java:

1. Hashing allows fast storage and retrieval of data using keys.
2. HashMap:
   - Stores key-value pairs
   - Keys must be unique, values can be duplicate
   - Uses hashCode() and equals() internally
3. HashSet:
   - Stores unique elements (no duplicates)
   - Uses hashCode() and equals() internally
4. Common methods:
   - put(key, value), get(key), remove(key), containsKey(key), contains(value)
   - add(element), remove(element), contains(element)
5. HashMap and HashSet provide average O(1) time complexity for basic operations.
6. Part of java.util package, import java.util.HashMap / HashSet to use.
*/
