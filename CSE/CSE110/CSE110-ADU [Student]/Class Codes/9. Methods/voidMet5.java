public class voidMet5{
  public static void main(String [] args){
    factorial(5);
    System.out.println("=========");
    factorial(3);
  }
  public static void factorial(int num){
    int prod = 1;
    for(int i = num; i >= 1; i--){
      prod *= i;
    }
    System.out.println(prod);
    return;
  }
}