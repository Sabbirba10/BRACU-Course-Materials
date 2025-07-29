public class q3 {
    public static void main(String[] args) {
        int id = 25104006; // Sabbir Bin Abbas's student ID
        int two = id % 100; // geting last two digit of my student id
        int last1 = two % 10; // geting 6 - the last one digit
        int last2 = two / 10; // geting 0 - the second last one digit

        System.out.println("2 rightmost digits of my student ID are " + last1 + " and " + last2);
    }
}
