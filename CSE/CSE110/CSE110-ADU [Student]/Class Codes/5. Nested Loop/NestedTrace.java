 public class NestedTrace {
   public static void main(String[] args) {
     int x = 4, y = 0, sum = 0;
     while (x < 9) {
       y = x - 3;
       while (y < 5) {
         sum = (sum * 2) + x - (y + 1) % 3;
         System.out.println(sum);
         y = y + 1;
       }
       if (x > 4) {
         x++;
       } else {
         x += 3;
       }
     }
     System.out.println(sum % x != 0);
   }
 }