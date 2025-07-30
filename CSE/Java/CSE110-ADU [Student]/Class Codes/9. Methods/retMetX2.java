public class retMetX2{
  public static void main(String [] args){
    int ans = permutation(5, 2);
    System.out.println(ans);
    System.out.println(permutation(6,3));
    System.out.println(permutation(6,2));
    System.out.println(permutation(4,3));
  }
  public static int permutation(int n, int r){
    int numerator = factorial(n);
    int denominator = factorial(n-r);
    return numerator/denominator;
  }
   public static int factorial(int num){
    if(num == 0){
      return 1;
    }
    else{
      int prod = 1;
      for(int i = num; i > 0; i--){
        prod *= i;
      }
      return prod;
    }
  }
}