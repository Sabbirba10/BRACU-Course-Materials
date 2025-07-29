public class Tracing1 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = -3;
        int num3 = -1;
        int sum = num1 + num2 + num3;
        if (num3 < 0) {
            System.out.println(num3 * (-2));
        } else {
            System.out.println(sum);
        }
        if (num1 < 5) {
            System.out.println(sum);
        }
        if (num1 < 5) {
            System.out.println(num1 + 10);
        } else if (num2 == 3) {
            num2 = num1;
            System.out.println(num2);
        } else {
            System.out.print(num1 + num2 + num3);
        }
        if (num1 > 15) {
            System.out.println(num1);
        }
        if (num2 == 0) {
            System.out.println(num2 + num3);
        } else {
            System.out.println(num3);
        }
        if (sum != 0) {
            System.out.println(100);
        } else {
            System.out.println(sum + 100);
        }
        if (num1 > 0 && num2 < 0) {
            System.out.println(num1 == num2);
        } else {
            System.out.println("End");
        }
    }
}
