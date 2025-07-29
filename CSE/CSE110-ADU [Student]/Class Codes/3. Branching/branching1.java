import java.util.Scanner;
public class branching1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(num < 0){
      System.out.println("number is negative");
    }
    else{
      System.out.println("number is zero or positive");
    }
  }
}
                         