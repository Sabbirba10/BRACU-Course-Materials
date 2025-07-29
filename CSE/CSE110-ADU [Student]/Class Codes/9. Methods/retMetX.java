public class retMetX{
  public static void main(String [] args){
    //permutation = n! / (n - r)!
    int n = 5, r = 2;
    int factN = factorial(n);
    int factN_r = factorial(n-r);
    int permutation = factN / factN_r;
    System.out.println(permutation);
    n = 6; r = 3;
    factN = factorial(n);
    factN_r = factorial(n-r);
    permutation = factN / factN_r;
    System.out.println(permutation);
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
    