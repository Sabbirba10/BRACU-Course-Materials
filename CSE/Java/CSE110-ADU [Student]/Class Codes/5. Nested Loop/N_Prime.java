import java.util.Scanner;
public class N_Prime{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int start = 2;
    int primeCount = 0;
    while(true){
      int divisorCount = 0;
      for(int i = 1; i <= start; i++){
        if(start % i == 0){
          divisorCount++;
        }
      }
      if(divisorCount == 2){
        primeCount++;
        System.out.println(start + " is prime");
      }
      if(primeCount == N){
        break;
      }
      start++;
    }
  }
}
    
    