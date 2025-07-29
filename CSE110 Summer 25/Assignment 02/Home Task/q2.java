import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter payment: ");
        int num = sc.nextInt();

        System.out.print("Enter age: ");

        if (num < 0) { // payment amount for payable money can't be negative
            System.out.println("Invalid payment amount");
        }
        int age = sc.nextInt();
        if (age < 18) { // age is less than 18
            System.out.println("You are not eligible to pay tax");
        } else if (num < 10000) {
            System.out.println("Your tax ammount is 0 TK");
        } else if (num >= 10000 && num <= 20000) {
            System.out.println("Your tax ammount is " + (num * 5 / 100) + " TK"); // Calculate tax at 5%
        } else if (num > 20000) {
            System.out.println("Your tax ammount is " + (num * 10 / 100) + " TK"); // tax at 10%
        }
        sc.close();
    }
}