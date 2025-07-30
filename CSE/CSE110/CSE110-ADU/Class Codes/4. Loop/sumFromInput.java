//Take 5 inputs from the user and calculate the sum
import java.util.Scanner;
public class sumFromInput{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    for(int i = 1; i <= 5; i++){
//      int sum = 0;
      int num = sc.nextInt();
      sum += num;
    }
    System.out.println(sum);
  }
}