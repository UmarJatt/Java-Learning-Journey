// This program demonstrates Java Generics.
// Generics allow you to write classes, interfaces, and methods with a placeholder for types.
// They provide type safety, meaning you can catch type errors at compile time instead of runtime.
// Generics are widely used in Collections like ArrayList, HashMap, etc.

import java.util.ArrayList;

public class JavaGenerics {
    public static void main(String[] args) {

        System.out.println("Java Generics Example\n");

        // ---------------- Generic Class Example ----------------
        Box<Integer> intBox = new Box<>();
        intBox.setItem(100);
        System.out.println("Integer Box contains: " + intBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics");
        System.out.println("String Box contains: " + stringBox.getItem());

        // ---------------- Generic Method Example ----------------
        System.out.println("\nUsing Generic Method:");
        JavaGenerics obj = new JavaGenerics();
        obj.printArray(new Integer[]{1, 2, 3, 4});
        obj.printArray(new String[]{"Umar", "Ali", "Sara"});

        // ---------------- Generics with Collections ----------------
        ArrayList<String> names = new ArrayList<>();
        names.add("Umar");
        names.add("Ali");
        // names.add(100); // This would cause compile-time error due to generics
        System.out.println("\nArrayList with Generics: " + names);
    }

    /**
     * Generic method to print elements of any array
     * @param array Array of type T
     * @param <T> Type parameter
     */
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

/**
 * Generic class Box which can store any type of object
 * @param <T> Type parameter
 */
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

/*
Key Points about Java Generics:

1. Generics allow classes, methods, and interfaces to operate on objects of various types while providing compile-time type safety.
2. Syntax for generic class: class ClassName<T> { ... }
3. Syntax for generic method: <T> void methodName(T param) { ... }
4. Prevents ClassCastException at runtime.
5. Generics are heavily used with Collections (ArrayList<T>, HashMap<K,V>, etc.).
6. Helps in writing reusable, maintainable, and type-safe code.
7. Type parameter names are usually single letters: T (Type), E (Element), K (Key), V (Value), etc.
*/
