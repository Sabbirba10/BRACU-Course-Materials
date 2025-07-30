package Lec03_11Feb;

import java.util.Arrays;

public class ArrayOperation{
    public static void main(String[] args) {
        int[] arr1 = {12, 34, 56, 45, 23};
        System.out.println("Array 1: "+arr1);
        System.out.println(Arrays.toString(arr1));

        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.println("Maximum number:"+max);
        /*
        // By using index
        int  max_id = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[max_id] < arr1[i]) {
                max_id = i;
            }
        }
        System.out.println("Maximum number:"+arr1[max_id]);
         */
        System.out.println("\n");


        // Finding unique elements from array
        System.out.println("Finding unique elements from array");
        // - How to test if an element is unique?
        // - What is the length of the new array? How many elements are unique?
        String arr[] = {"BD", "BD", "USA", "BD", "Nepal", "USA"};
        System.out.println("Staring Array:"+Arrays.toString(arr));


        // Idea 1: count first, then make new array
        int count_unique = 0;
        for (int i = 0; i < arr.length; i++) {
            int count_arr_i = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) { // Problem??
                    count_arr_i++;
                }
            }

            if (count_arr_i == 0) { // No more of this element found in inner loop
                count_unique++;
            }
        }
        System.out.println("There are "+count_unique+" unique elements in arr");

        String[] u_arr = new String[count_unique];
        for (int i = 0; i < u_arr.length; i++) {
            int count_arr_i = 0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    count_arr_i++;
                }
            }

            if (count_arr_i == 0) { // No more of this element found in inner loop
                // Place arr2[i] in u_arr2 : Which position??
                u_arr[i] = arr[i];
            }
        }

        // Idea 2: make a temp array, alongside count
        String[] temp_arr = new String[arr.length];
        int temp_idx = 0; // this is also a count for unique elements
        for (int i = 0; i < arr.length; i++) {
            int count_in_temp = 0;
            for (int j = 0; j < temp_idx; j++) {
                if (arr[i].equals(temp_arr[j])){
                    count_in_temp++;
                }
            }
            if (count_in_temp == 0) { // arr[i] is not in temp_arr, so we insert
                temp_arr[temp_idx] = arr[i];
                temp_idx++;
                System.out.println("Temp array updated");
                System.out.println(Arrays.toString(temp_arr));
            }
        }



        String[] unique_arr = new String[temp_idx];
        for (int i = 0; i < unique_arr.length; i++) {
            unique_arr[i] = temp_arr[i];
        }
        System.out.println("Unique Elements: "+Arrays.toString(unique_arr));
    }
}