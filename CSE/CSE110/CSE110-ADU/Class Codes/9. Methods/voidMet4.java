public class voidMet4{
  public static void main(String [] args){
    compare(10, 15);
    compare(7, 7);
    compare(10, 3);
  }
  public static void compare(int x, int y){
    if(x > y){
      System.out.println(x + " is greater than " + y);
    }
    else if (x < y){
      System.out.println(x + " is smaller than " + y);
    }
    else{
      System.out.println(x + " is equal to " + y);
    }
  }
}