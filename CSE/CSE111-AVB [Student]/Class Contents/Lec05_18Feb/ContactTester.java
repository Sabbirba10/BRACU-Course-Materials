package Lec05_18Feb;

import java.util.Arrays;

public class ContactTester {
    public static void main(String[] args) {
        Contact var = new Contact();
        var.phone = "+8801234";
        var.name = "Arif";
        System.out.println("Var: "+var);
        System.out.println(var.name +", "+ var.phone);

        Contact var2 = new Contact();
        var2.name = "Bristy";
        var2.phone = "+8804532";
        System.out.println("Var2:"+var2);
        System.out.println(var2.name +", "+ var2.phone);
        System.out.println();

        Contact[] arr1 = new Contact[5];
        System.out.println(arr1+"\n"+Arrays.toString(arr1));
        arr1[0] = var;
        arr1[1] = var2;
        System.out.println(arr1+"\n"+Arrays.toString(arr1));
        // int[] arr1 = new int[length]
        // int[] arr2 = new int[]{val1, val2}
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != null) {
                System.out.println(arr1[i].name +", "+ arr1[i].phone);
            }
        }

        Contact[] arr2 = new Contact[]{var2, var, null, null};
        
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != null) {
                System.out.println(arr2[i].name +", "+ arr2[i].phone);
            }
        }
        System.out.println();
        System.out.println("A1: "+arr1+"\n"+Arrays.toString(arr1));
        System.out.println("A2: "+arr2+"\n"+Arrays.toString(arr2));

        // Creating object inside Array
        arr1[2] = new Contact();
        arr1[2].name = "Kamal";
        arr1[2].phone = "+8802332";
        System.out.println("A1: "+arr1+"\n"+Arrays.toString(arr1));

        // Editing objects
        System.out.println();
        arr1[0].phone = "+8809876";
        var2.name = "Bristy Bracu";
        System.out.println("Var: "+var);
        System.out.println(var.name +", "+ var.phone);
        System.out.println("Array 1");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != null) {
                System.out.println(arr1[i].name +", "+ arr1[i].phone);
            }
        }System.out.println("Array 2");
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != null) {
                System.out.println(arr2[i].name +", "+ arr2[i].phone);
            }
        }
    }
}
