package Lec02_09Feb;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        // Different ways to initialize arrays
        int[] arr1 = {1, 2, 3, 4, 5}; // Direct initialization
        int[] arr2 = new int[5]; // Default value: 0 for int
        int[] arr3, arr4, arr5; // Just declaration
        // arr3 = {4, 5, 6, 7};
        // Error: Cannot use direct initialization separately from declaration
        arr3 = new int[]{4, 5, 6, 7}; // normal initialization
        // "new int[]" : make int[] reference / memory location
        // {4, 5, 6, 7} : place values in memory;

        arr4 = new int[4]; // this is still valid

        // Filling an array using loops
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 2;
        }

        // Printing arrays (Demonstrating reference printing)
        System.out.println("Direct print (reference) Array 1: " + arr1);
        System.out.println("Direct print (reference) Array 2: " + arr2);
        System.out.println("Direct print (reference) Array 3: " + arr3);
        System.out.println("Direct print (reference) Array 4: " + arr4);
        // System.out.println("Direct print (reference) Array 5: " + arr5);
        // arr5 is not initialized. contains ** null **

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
        System.out.println("Array 3: " + Arrays.toString(arr3));
        System.out.println("Array 4: " + Arrays.toString(arr4));
        // System.out.println("Array 5: " + Arrays.toString(arr5));

        // Copying an array
        System.out.println("\n");
        System.out.println("Copying arrays:");
        arr5 = arr1; // this does not COPY, it shares memory
        System.out.println("Direct print (reference) Array 1: " + arr1);
        System.out.println("Direct print (reference) Array 5: " + arr5);
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 5: " + Arrays.toString(arr5));

        arr1[4] = 10;
        // changing inside arr1 would change arr5, since operatinng on same memory.
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 5: " + Arrays.toString(arr5));

        // copy values only, not memory:
        int[] copiedArray = Arrays.copyOf(arr1, arr1.length);
        // Or use a loop...
        System.out.println("Copied Array: " +copiedArray);
        // try updating copiedArray and checking if arr1 stays same or also changes
        // test the loop way yourself


        // Searching in an array
        System.out.println("\n");
        int searchKey = 3;
        int index = -1;
        for (int i = 0; i < arr1.length; i++)
            if (arr1[i]  == searchKey) 
                index = i;

        if (index >= 0) {
            System.out.println(searchKey + " found at index " + index);
        } else {
            System.out.println(searchKey + " not found");
        }

        // Reversing an array (using two-pointer approach)
        System.out.println("\n");
        System.out.println("Before reversal: " + Arrays.toString(arr5));
        int left = 0, right = arr5.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr5[left];
            arr5[left] = arr5[right];
            arr5[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(arr5));
    }

    // Function to reverse an array (two-pointer method)
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
