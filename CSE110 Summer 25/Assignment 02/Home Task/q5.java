import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount the customer need to pay(TAKA): ");
        int pay = sc.nextInt(); // amount to be pay

        System.out.print("Enter the amount that customer gave(TAKA): ");
        int given = sc.nextInt(); // amount given by the customer

        if (given > pay) { // amount given is greater than the amount to be paid
            int change = given - pay; // change to be returned
            System.out.println("The returned amount is " + change + " taka.");

            int count100 = change / 100; // number of 100 taka notes
            System.out.println("100 taka note: " + count100);
            change %= 100; // remaining amount after giving 100 taka notes

            int count50 = change / 50;
            System.out.println("50 taka note: " + count50);
            change %= 50;

            int count20 = change / 20;
            System.out.println("20 taka note: " + count20);
            change %= 20;

            int count10 = change / 10;
            System.out.println("10 taka note: " + count10);
            change %= 10;

            int count5 = change / 5;
            System.out.println("5 taka coin: " + count5);
            change %= 5;

            int count2 = change / 2;
            System.out.println("2 taka coin: " + count2);
            change %= 2;

            int count1 = change;
            System.out.println("1 taka coin: " + count1);

        } else if (given < pay) { // amount given is less than the amount to be paid
            System.out.println("Please pay " + (pay - given) + " taka more."); // minus to additional amount needed
        } else {
            System.out.println("The returned amount is 0 taka.");
        }
        sc.close();
    }
}
