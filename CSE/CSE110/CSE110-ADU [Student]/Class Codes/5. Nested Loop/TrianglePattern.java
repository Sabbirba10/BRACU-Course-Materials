import java.util.Scanner;
public class TrianglePattern{   
  public static void main(String[] args)  { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++ ) { //row
      for(int j = 1; j <= i; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
    
  }
}
//input 4
//1       - row 1
//1 2     - row 2
//1 2 3   - row 3
//1 2 3 4 - row 4
