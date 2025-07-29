package Lec02_09Feb;

public class StringsTest {
    public static void main(String[] args) {
        // String created using a string "literal" (stored in string pool)
        String str1 = "Hello";
        String str2 = "Hello"; // str2 contains the exact same memory as str1

        // String created using 'new' keyword (stored separately, not string pool)
        String str3 = new String("Hello");

        // String declaration, without initialization
        String strn; // saves ** null **.
        // System.out.println(strn); // Error: cannot print without initializing

        // Comparing references
        if (str1 == str2) // true (same string pool reference)
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");
        if (str1 == str3) // false (different memory)
            System.out.println("str1 == str3"); 
        else
            System.out.println("str1 != str3"); 

        // String concatenation creates a new object
        String str4 = str1 + " World";
        System.out.println("Concatenated String: " + str4);
    }
}
