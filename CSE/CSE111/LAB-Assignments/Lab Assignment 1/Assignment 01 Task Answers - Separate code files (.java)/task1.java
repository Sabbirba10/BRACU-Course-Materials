//--TASK--01-------------------------------------------
import java.util.Scanner;
public class task1 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int sum = 0;
    double count = 0;
    int min = 0;
    int max = 0;
    for (int i = 1; i<=10; i++) {
      System.out.println("Enter Integer "+i);
      int a = sc.nextInt();
      if (a%2==0) {
        continue;}
      if (a<0) {
        continue;}
      sum = sum+a;
      count = count+1;
      if (i==1) {
        min = a;
        max = a;}
      else {
        if (a<min) {
          min = a;}
        else if (a>max) {
          max = a;}}}
    double avg = sum/count;
    if (count==0) {
      System.out.println("No odd positive numbers found");}
    else {
      System.out.println("Sum = "+sum);
      System.out.println("Minimum = "+min);
      System.out.println("Maximum = "+max);
      System.out.println("Average = "+avg);}
  }
}