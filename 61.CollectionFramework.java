// This program explains the Java Collection Framework.
// Collection Framework provides a set of interfaces and classes to store and manipulate groups of objects.
// Main interfaces: Collection, List, Set, Queue, Map
// Common classes: ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap

import java.util.*;

public class CollectionFramework {
    public static void main(String[] args) {

        System.out.println("Java Collection Framework Example\n");

        // ---------------- Using List ----------------
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicates allowed

        System.out.println("List of fruits: " + fruits);

        // ---------------- Using Set ----------------
        Set<String> uniqueFruits = new HashSet<>();
        uniqueFruits.add("Apple");
        uniqueFruits.add("Banana");
        uniqueFruits.add("Orange");
        uniqueFruits.add("Apple"); // duplicate ignored

        System.out.println("Set of unique fruits: " + uniqueFruits);

        // ---------------- Using Map ----------------
        Map<String, Integer> fruitQuantity = new HashMap<>();
        fruitQuantity.put("Apple", 10);
        fruitQuantity.put("Banana", 20);
        fruitQuantity.put("Orange", 15);

        System.out.println("Fruit quantities: " + fruitQuantity);

        // ---------------- Iterating over Collection ----------------
        System.out.println("\nIterating over List using for-each:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nIterating over Set using iterator:");
        Iterator<String> it = uniqueFruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nIterating over Map using entrySet:");
        for (Map.Entry<String, Integer> entry : fruitQuantity.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

/*
Key Points about Collection Framework:

1. Collection is the root interface for List, Set, and Queue.
2. List: ordered, allows duplicates (e.g., ArrayList, LinkedList)
3. Set: unordered, no duplicates (e.g., HashSet, TreeSet)
4. Map: key-value pairs, keys unique (e.g., HashMap, TreeMap)
5. Queue: ordered collection for processing (FIFO)
6. Iterator can be used to traverse collections.
7. Collection Framework simplifies storage, retrieval, and manipulation of objects.
*/
