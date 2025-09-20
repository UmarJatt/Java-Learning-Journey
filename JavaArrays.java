// This program explains arrays in Java.
// An array is a collection of elements of the same data type stored in a single variable.
// Arrays have a fixed size and elements are accessed using their index (starting from 0).

public class JavaArrays {
    public static void main(String[] args) {

        // 1. Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50}; // array of integers
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println();

        // 2. Updating array elements
        numbers[2] = 35; // change 3rd element
        System.out.println("Updated 3rd element: " + numbers[2]);

        System.out.println();

        // 3. Accessing specific elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println();

        // 4. Using enhanced for loop (for-each) to iterate array
        System.out.print("Array elements using for-each loop: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println();

        // 5. Array of strings
        String[] fruits = {"Apple", "Banana", "Mango"};
        System.out.println("Fruit array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();

        // 6. Finding length of an array
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("Length of fruits array: " + fruits.length);
    }
}
