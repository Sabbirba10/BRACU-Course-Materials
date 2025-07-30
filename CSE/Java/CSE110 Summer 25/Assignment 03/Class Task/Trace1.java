public class Trace1 {
    public static void main(String[] args) {
        int x = 0, p = 0, sum = 0;
        p = 1;
        x = 2;
        double q;
        sum = 0;
        while (p < 12) {
            q = x + p - (sum + 7 / 3) / 3.0 % 2;
            sum = sum + (++x) + (int) q;
            System.out.println(sum++);
            if (x > 5) {
                p += 4 / 2;
            }
        }
        sum = sum + p;
        System.out.println(sum);
    }
}