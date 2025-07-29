public class TraceFibo{
  public static int f(int n){
    if(n == 0){
      return 0;
    }
    if(n == 1){
      return 1;
    }
    int s = f(n-1) + f(n-2);
    System.out.println(s);
    return s;
  }
  public static void main(String[] args){
    int a = f(4);
    System.out.println(a);
  }
}