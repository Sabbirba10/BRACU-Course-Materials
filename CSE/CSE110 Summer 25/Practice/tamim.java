import java.util.Scanner;

public class tamim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double invest, earn, profit;

        int count = 0;
        double total = 0;
        double max = 0;
        double min = 0;
        int maxid = -1;
        int minid = -1;

        for (int i = 0; i < n; i++) {
            invest = input.nextDouble();
            earn = input.nextDouble();
            profit = earn - invest;
            double margin = profit / invest;

            if (margin >= 0.25) {
                count++;
                total += profit;
                if (maxid == -1 || profit > max) {
                    max = profit;
                    maxid = i;
                }
                if (minid == -1 || profit < min) {
                    min = profit;
                    minid = i;
                }
                System.out.println(i + 1 + " " + profit);
            }
        }

        if (count > 0) {
            System.out.println(maxid + 1 + " " + max);
            System.out.println(minid + 1 + " " + min);
            System.out.println(total / count);
        }
        input.close();
    }
}
