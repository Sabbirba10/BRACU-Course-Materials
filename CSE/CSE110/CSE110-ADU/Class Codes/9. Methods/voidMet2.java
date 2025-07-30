public class voidMet2{
  public static void main(String [] args){
//    System.out.println(5+6);
    int x = 5, y = 10;
    addition(y, 10.5);  //addition(10, 5);
  }
  public static void addition(int x, double y){
    System.out.println("x: " + x);
    System.out.println("y: " + y);
    System.out.println("Sum: " + (x + y));
  }
}