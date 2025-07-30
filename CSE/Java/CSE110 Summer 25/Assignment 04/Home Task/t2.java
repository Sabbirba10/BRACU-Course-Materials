public class t2 {
    public static void main(String[] args) {
        int sum = 0, r = 0, i = 10, j = -5000;
        while (i < 10000) {
            r = (i % 2) + 1;
            j = i + 2;
            while (j < i) {
                r = 2 - 4 + 6 - 8 + 10 - 12;
                j++;
            }
            sum = i % r + (i * r) - j + 5;
            System.out.println(sum);
            j--;
            if (i > 18) {
                sum += (++r) + i / 3 + r + 12;
                break;
            } else {
                i += 3;
            }
        }
        System.out.println(sum);
    }
}
