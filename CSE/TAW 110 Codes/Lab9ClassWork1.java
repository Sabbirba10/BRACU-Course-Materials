public class Lab9ClassWork1{
  public static void calculate(int n) {
    if (n <= 0){
      System.out.println(1);
    }
    else{
      calculate(n - 2);
      System.out.println(n);
    }
  }   
  public static void main(String[] args) {
    calculate(8);
    //System.out.println(result);
  }
}

