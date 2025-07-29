//find prime numbers from a range
import java.util.Scanner;
public class primeFromRange{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();
    int divisorCount = 0;
    for(int k = start; k <= end; k++){
//      int divisorCount = 0;
      for(int i = 1; i <= k; i++){
        if(k % i == 0){
          divisorCount++;
        }
      }
      System.out.println("number: " + k + " divisor: "+ divisorCount);
      if(divisorCount == 2){
        System.out.println(k + " is prime");
      }
      divisorCount = 0;
    }
  }
}