import java.util.Scanner;

public class OnePieceStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gift quantity: ");
        int n = sc.nextInt();

        double price = n * 150;
        double vat = price * 7 / 100;
        double sum = price + vat;
        System.out.println("Total vat: " + vat);
        System.out.println("Total price: " + sum);
        sc.close();
    }
}
