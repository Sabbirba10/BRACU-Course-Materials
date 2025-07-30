import java.util.Scanner;

public class Quiz2 {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N: ");
    int n = sc.nextInt();
    
    double sum = 0;
    double max = 0;
    double min = 0;
    
    for (int i = 1; i <= n; i++){
      System.out.println("Enter temperature "+i+": ");
      double temp = sc.nextDouble();
      
      sum +=temp;
      
      if (i == 1){
        max = temp;
        min = temp;
      } else if (temp > max){
        max = temp;
      } else if (temp < min){
        min = temp;
      }
    }
    
    double avg = sum / n;
    System.out.println("Temperature range: "+min+" C - "+max+" C");
    System.out.println("Average Temperature: "+avg+" C");
  }
  }

    
    
    