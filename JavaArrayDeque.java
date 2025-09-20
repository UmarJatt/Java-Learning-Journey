// This program demonstrates ArrayDeque in Java.
// ArrayDeque is a resizable array that implements Deque interface (double-ended queue).
// It can be used as both a stack (LIFO) and queue (FIFO).
// Common methods: add(), addFirst(), addLast(), remove(), removeFirst(), removeLast(), peek(), peekFirst(), peekLast(), offer(), poll()

import java.util.ArrayDeque;
import java.util.Iterator;

public class JavaArrayDeque {
    public static void main(String[] args) {

        System.out.println("Java ArrayDeque Example\n");

        // Creating an ArrayDeque of String type
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements at the end (like queue)
        deque.add("Apple");
        deque.add("Banana");
        deque.add("Orange");
        System.out.println("ArrayDeque after add(): " + deque);

        // Adding elements at the front and back
        deque.addFirst("Mango");
        deque.addLast("Pineapple");
        System.out.println("After addFirst and addLast: " + deque);

        // Removing elements
        deque.remove(); // removes first element
        System.out.println("After remove(): " + deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removeFirst and removeLast: " + deque);

        // Accessing elements without removing
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Using offer() and poll() (queue operations)
        deque.offer("Grapes");
        deque.offerFirst("Kiwi");
        System.out.println("After offer() and offerFirst(): " + deque);

        System.out.println("Poll first element: " + deque.poll());
        System.out.println("Poll last element: " + deque.pollLast());
        System.out.println("ArrayDeque after poll operations: " + deque);

        // Iterating over ArrayDeque using iterator
        System.out.println("\nIterating using iterator:");
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Check if ArrayDeque is empty
        System.out.println("\nIs ArrayDeque empty? " + deque.isEmpty());
    }
}

/*
Key Points about ArrayDeque:

1. ArrayDeque implements Deque interface (double-ended queue).
2. Can be used as stack (LIFO) or queue (FIFO).
3. Common methods:
   - add(), addFirst(), addLast()
   - remove(), removeFirst(), removeLast()
   - peek(), peekFirst(), peekLast()
   - offer(), offerFirst(), offerLast()
   - poll(), pollFirst(), pollLast()
4. ArrayDeque does not allow null elements.
5. Faster than LinkedList for stack and queue operations.
6. Part of java.util package, import java.util.ArrayDeque to use.
*/
