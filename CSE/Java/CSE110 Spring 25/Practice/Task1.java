import java.util.Scanner;

public class Task1 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int a = sc.nextInt();
        System.out.print("Enter a numbers: ");
        int b = sc.nextInt();
        System.out.print("Enter a numbers: ");
        int c = sc.nextInt();

        if ( a > b && a > c ) {
            System.out.println("Largest number is: "+ a);
        }

        else if ( b > c && b > a ) {
            System.out.println("Largest number is: "+ b);
        }

        else if ( c > a && c > b ) {
            System.out.println("Largest number is: "+ c);
        }

        else {
            System.out.println("No largest number found");
        }
        sc.close();
    }
}
