public class recTracing{
  public static void main(String [] args){
    int a = 7;
    mTrace1(++a);
    System.out.println(a);
  }  
  public static void mTrace1(int n){
    if (n>=6){
      mTrace1(n-1);
      System.out.println(mTrace2(n));
    }
  }   
  public static int mTrace2(int a){
    int b = a++;
    return a + b;
  }   
}
