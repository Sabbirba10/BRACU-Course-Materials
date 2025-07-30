package Lec01_04Feb;
public class Scopes {
    public static void main(String[] args) {
        int a = 20;
        int b;
        if (a < 5) { // variable b saves the branch number
            b = 1;
            System.out.println("a is smaller than 5"); // 2
        } else if (a < 50) {
            b = 2;
            System.out.println("a is smaller than 50");  // 9
        } else if (a < 500) {
            b = 3;
            System.out.println("a is smaller than 500");  // 97
        } else {
            b = 4;
            System.out.println("a is not smaller than 500"); // 979    
        }

        System.out.println("Output was from branch#"+b);
        a = 20;
        while (a>0) {
            // loop body
            System.out.println( "a = "+a);
            a = a - 3;
        }
        System.out.println();
        System.out.println();
        for( a = 20 ; a > 0 ; a = a - 3) {
            //loop body
            System.out.println( "a = "+a);
        }
    }
}

/* // nested if - else allows us to modify each branches (***)
if (a < 5) {
    System.out.println("a is smaller than 5"); // 2
} else {
    System.out.println("a is not smaller than 5, and");  // ***
    if (a < 50) {
        System.out.println("a is smaller than 50");  // 9
    } else { 
        if (a < 500) {
            System.out.println("a is smaller than 500");  // 97
        } else {
            System.out.println("a is not smaller than 500"); // 979
        }
    }
}
*/
