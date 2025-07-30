//find out if a number is prime
import java.util.Scanner;
public class prime{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int divisorCount = 0;
    for(int i = 1; i <= num; i++){
      if(num % i == 0){
//        System.out.println(i);
        divisorCount++;
      }
    }
    if(divisorCount == 2){
      System.out.println(num + " is prime");
    }
    else{
      System.out.println(num + " is not prime");
    }
  }
}




