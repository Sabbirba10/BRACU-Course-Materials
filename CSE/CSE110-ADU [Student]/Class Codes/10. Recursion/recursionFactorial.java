public class recursionFactorial{
  public static void main(String [] args){
    int ans = factorialRec(4);
    System.out.println(ans);
  }
  public static int factorialRec(int num){
    if(num == 0){ //base case
      return 1;
    }
    else{ //recursive case
//      System.out.println("else part");
      return num * factorialRec(num-1);
    }
  }
}

//power calculation