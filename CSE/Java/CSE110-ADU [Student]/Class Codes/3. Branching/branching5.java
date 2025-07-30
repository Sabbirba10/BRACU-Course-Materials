//find out if a number is divisible by 2 or 5
import java.util.Scanner;
public class branching5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    //prompt
    int num = sc.nextInt();
    if(num % 2 == 0){
      System.out.println(num + " is divisible by 2");
    }
    else{
      if(num % 5 == 0){
        System.out.println(num + " is divisible by 5");
      }
      else{
        System.out.println(num + " is not divisible by 2 or 5");
      }
    }
  }
}