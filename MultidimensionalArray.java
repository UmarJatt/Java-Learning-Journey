// This program explains multidimensional arrays in Java.
// A multidimensional array is an array of arrays, often used to represent tables or matrices.
// Most common is 2D array, which has rows and columns.

public class MultidimensionalArray {
    public static void main(String[] args) {

        // 1. Declaring and initializing a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 2. Accessing elements
        System.out.println("Element at row 1, column 2: " + matrix[0][1]); // index starts from 0
        System.out.println("Element at row 3, column 3: " + matrix[2][2]);

        System.out.println();

        // 3. Printing the 2D array using nested for loop
        System.out.println("2D array (matrix) elements:");
        for (int i = 0; i < matrix.length; i++) { // iterate rows
            for (int j = 0; j < matrix[i].length; j++) { // iterate columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }

        System.out.println();

        // 4. Using enhanced for loop (for-each) to iterate 2D array
        System.out.println("Matrix elements using for-each loop:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println();

        // 5. Example: Sum of all elements in 2D array
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        System.out.println("Sum of all elements in matrix: " + sum);
    }
}
