import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt(); // 1st side

        System.out.print("Enter side 2: ");
        int b = sc.nextInt(); // 2nd side

        System.out.print("Enter side 3: ");
        int c = sc.nextInt(); // 3rd side

        if (a == b && b == c) { // if all sides are equal, it is an Equilateral triangle
            System.out.println("This is a Equilateral triangle");
        } else if (a == b || b == c || a == c) { // if any two sides are equal, it is an Isosceles triangle
            System.out.println("This is a Isosceles triangle");
        } else { // if no sides are equal, it is a Scalene triangle
            System.out.println("This is a Scalene triangle");
        }
        sc.close();
    }
}
