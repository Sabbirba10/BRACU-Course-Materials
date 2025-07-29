import java.util.Scanner;
public class week11C2
{
  public static int factorialRec(int num){
    if(num==0){
      return 1;
    }
    else{
      return num * factorialRec(num-1);
    }
  }
  public static int factorial(int num){
    int total = 1;
    for(int i=num;i>=1;i--){
      total *= i;
    }
    return total;
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);  
    System.out.println("Main method starts");
    int result = factorialRec(4);
    System.out.println(result);
    System.out.println("Main method ends");
  } 
}