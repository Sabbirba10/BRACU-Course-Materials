package Lec03_11Feb;

import java.util.Arrays;

public class MultiDimentional {
    public static void main(String[] args) {
        // 1. Initializing a 2D array with fixed dimensions
        int[][] fixed = {
            {1, 2, 3, 4},
            {4, 5, 6, 7},
        };

        System.out.println("Fixed Matrix:");
        System.out.println(Arrays.toString(fixed));
        System.out.println("Print by loop:");
        for (int i = 0; i < fixed.length; i++) {
            if (i==0) System.out.print(Arrays.toString(fixed[i]));
            else System.out.print(", "+Arrays.toString(fixed[i]));
        }
        System.out.println("\n"); // copied this to printMatrix()

        // Initializing a 2D array without predefined values
        int[][] emptyMatrix = new int[4][3]; // 4x3 zero-initialized

        // Filling emptyMatrix with values
        for (int i = 0; i < emptyMatrix.length; i++) {
            for (int j = 0; j < emptyMatrix[i].length; j++) { // notice the condition
                emptyMatrix[i][j] = i + j; // Example pattern: sum of indices
            }
        }

        System.out.println("Empty Matrix (After Filling):");
        printMatrix(emptyMatrix);

        // 2D array with variable-length inner arrays
        int[][] array2D = new int[3][];
        array2D[0] = new int[]{1, 2, 3};      // Row 0 has 3 elements
        array2D[1] = new int[]{4, 5};         // Row 1 has 2 elements
        array2D[2] = new int[]{6, 7, 8, 9};   // Row 2 has 4 elements

        System.out.println("Non Uniform Array:");
        printMatrix(array2D);

        // 4. Matrix Addition (fixed size 3x3 for simplicity)
        int[][] matrixA = {{6, 2, 1}, {2, 9, 6}, {5, 3, 3} };

        int[][] matrixB = {{4, 1, 3}, {6, 8, 4}, {7, 1, 5} };

        int[][] sumMatrix = new int[3][3];

        // Adding matrixA and matrixB
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Matrix A + Matrix B:");
        printMatrix(matrixA);
        printMatrix(matrixB);
        printMatrix(sumMatrix);

        // 5. Transpose of a matrix
        /*
           6 2 1     6 2 5
           2 9 6 --> 2 9 3
           5 3 3     1 6 3
         */
        int[][] transposedMatrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposedMatrix[j][i] = matrixA[i][j]; // Swap rows & columns
            }
        }

        System.out.println("Transpose of Matrix A:");
        printMatrix(transposedMatrix);
    }
    // Helper method to print a 2D array
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i==0) System.out.print(Arrays.toString(matrix[i]));
            else System.out.print(", "+Arrays.toString(matrix[i]));
        }
        System.out.println();
    }
}
