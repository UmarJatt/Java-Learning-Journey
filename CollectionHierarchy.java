// This program explains the Collection hierarchy in Java.
// The Java Collection Framework is organized in a hierarchy of interfaces and classes for storing and manipulating objects.
// Key Interfaces: Collection, List, Set, Queue, Deque, Map
// Common Implementations: ArrayList, LinkedList, HashSet, TreeSet, PriorityQueue, HashMap, TreeMap

public class CollectionHierarchy {
    public static void main(String[] args) {

        System.out.println("Java Collection Framework Hierarchy Example\n");

        System.out.println("Collection Hierarchy Overview:\n");

        System.out.println("1. Collection Interface (Root Interface)");
        System.out.println("   -> Subinterfaces: List, Set, Queue, Deque");
        System.out.println("   -> Implementations: ArrayList, LinkedList, HashSet, TreeSet, PriorityQueue\n");

        System.out.println("2. List Interface");
        System.out.println("   - Ordered, allows duplicates");
        System.out.println("   - Implementations: ArrayList, LinkedList, Vector, Stack\n");

        System.out.println("3. Set Interface");
        System.out.println("   - Unordered, no duplicates");
        System.out.println("   - Implementations: HashSet, LinkedHashSet, TreeSet\n");

        System.out.println("4. Queue Interface");
        System.out.println("   - Ordered (FIFO), used for processing elements");
        System.out.println("   - Implementations: PriorityQueue, LinkedList\n");

        System.out.println("5. Deque Interface");
        System.out.println("   - Double-ended queue (add/remove from both ends)");
        System.out.println("   - Implementations: ArrayDeque, LinkedList\n");

        System.out.println("6. Map Interface");
        System.out.println("   - Key-Value pairs, keys unique");
        System.out.println("   - Implementations: HashMap, LinkedHashMap, TreeMap, Hashtable\n");

        System.out.println("Note: Map does NOT extend Collection interface, but is part of the Collection Framework.");
    }
}

/*
Key Points about Collection Hierarchy:

1. Collection is the root interface for all collection types except Map.
2. List: ordered, allows duplicates (ArrayList, LinkedList, Vector, Stack)
3. Set: unordered, no duplicates (HashSet, LinkedHashSet, TreeSet)
4. Queue: ordered processing (FIFO), PriorityQueue, LinkedList
5. Deque: double-ended queue (add/remove at both ends), ArrayDeque, LinkedList
6. Map: key-value pairs, keys unique (HashMap, TreeMap, LinkedHashMap)
7. Understanding hierarchy helps choose the right collection for specific needs.
*/
