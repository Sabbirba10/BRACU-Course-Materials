package Lec01_04Feb;

public class NestedLoops {
    public static void main(String[] args) {
        // nested loops are needed when a loop operation is needed over a range.
        int a = 5, b = 7; // assume we need 7 serieses, but for each series, we need 5 values.
        /*
            Expected:
            1, 2, 3, 4, 5     (increase by 1)
            1, 3, 5, 7, 9     (increase by 2)
            1, 4, 7, 10, 13   (increase by 3)
            1, 5, 9, 13, 17   (increase by 4)
            1, 6, 11, 16, 21  (increase by 5)
            1, 7, 13, 19, 25  (increase by 6)
            1, 8, 15, 22, 29  (increase by 7)
         */

        System.out.println("Example series:");
        for (int i = 1; i <= a; i+=1) {
            System.out.print(i); // println() goes to next line, print() stays in same line.
            if (i==a) { // if last case, no comma,  but println() goes to next line.
                System.out.println();
            } else {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("Nested loop output 1 (Wrong):");
        for (int outer = 1; outer <= b; outer++) {
            // outer - outer loop iterator variable
            for (int inner = 1; inner <= a; inner+=outer) {
                // inner - inner loop iterator variable
                System.out.print(inner);
                if (inner==a) {
                    System.out.println();
                } else {
                    System.out.print(", ");
                }
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Nested loop output 2 (Corrected):");
        int output = 1; // need a separate variable to print. 
        for (int outer = 1; outer <= b; outer++) {
            // reset output before each series.
            output = 1;
            for (int inner = 1; inner <= a; inner+=1) {
                System.out.print(output);
                // the iterator (looping variable) goes up by one.
                // butt the printing variable goes up by whatever line we are on.
                output = output + outer; // why did we do this after printing?
                // adding before printing would not output from 1; test it yourself. 
                if (inner==a) {
                    System.out.println();
                } else {
                    System.out.print(", ");
                }
            }
        }
        
    }
}
