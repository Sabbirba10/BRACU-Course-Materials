//Take N inputs from the user and find out the maximum and minimum value
import java.util.Scanner;
public class max_min{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    for(int i = 1; i <= N; i++){
      int num = sc.nextInt();
      if(i == 1){
        max = num;
      }
      if(num > max){
        max = num;
      }
    }
    System.out.println(max);
  }
}