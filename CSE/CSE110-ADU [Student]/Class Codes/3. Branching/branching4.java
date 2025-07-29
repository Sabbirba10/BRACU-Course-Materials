import java.util.Scanner;
public class branching4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num > 0){
      if(num % 2 == 0){
        System.out.println("Positive and even");
      }
      else{
        System.out.println("Positive and odd");
      }
    }
    else{
      System.out.println("Negative or zero");
    }
  }
}