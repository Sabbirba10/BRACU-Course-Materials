public class q1 {
    public static void main(String[] args) {
        int i = 3456789;

        int year = i / (60 * 24 * 365); // minutes to years
        int day = (i % (60 * 24 * 365)) / (60 * 24); // remaining years to days

        System.out.println(i + " minutes is approximately " + year + " years and " + day + " days");
    }
}
