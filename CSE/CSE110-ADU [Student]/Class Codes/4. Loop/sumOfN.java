//sum of first N natural numbers
import java.util.Scanner;
public class sumOfN{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= N; i++){
//      System.out.println(i);
      sum = sum + i;
    }
    System.out.println(sum);
  }
}

//calculate factorial
