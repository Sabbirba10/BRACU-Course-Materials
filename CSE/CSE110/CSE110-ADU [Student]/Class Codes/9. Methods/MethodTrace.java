public class MethodTrace {
   public static void metA(int p, int sum){
       int x = 0, y = 2;
       y += y;
       x = sum + 2 + p;
       sum = x + metB(p, y) + y ;
       System.out.println(x + " " + y+ " " + sum);
   }
   public static int metB(int p, int n){
       int x = 0;
       x = x + 2 + ++n;
       p = n + x + p;
       System.out.println(x + " " + n + " " + p);
       return p++;
   }
   public static void main(String [] args){
     int x = 3, y = 5;
     metA(2, 1);
     metA(x, y);
   }
}
