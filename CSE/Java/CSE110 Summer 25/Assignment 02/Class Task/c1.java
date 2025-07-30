import java.util.Scanner;

public class c1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("largest number: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("largest number: " + num2);
        } else {
            System.out.println("largest number: " + num3);
        }
        sc.close();
    }
}