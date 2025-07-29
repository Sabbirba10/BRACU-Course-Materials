//Take N inputs from the user and calculate the sum and average
import java.util.Scanner;
public class sum_avg{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 0;
    for(int i = 1; i <= N; i++){
      int num = sc.nextInt();
      sum += num;
    }
    System.out.println(sum);
//    double avg = 1.0*sum/N;
    double avg = (double)sum/N;
    System.out.println(avg);
    //explicit type conversion
//    double x = 5.55;
//    int y = (int)x;
  }
}

