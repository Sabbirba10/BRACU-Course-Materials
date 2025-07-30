//print a square shape using *
import java.util.Scanner;
public class squarePattern{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int side = sc.nextInt();
    for(int row = 0; row < side; row++){
      for(int i = 0; i < side; i++){
        System.out.print("* ");
      }
      System.out.println();
    }
//    for(int i = 0; i < side; i++){
//      System.out.print("*");
//    }
//    System.out.println();
//    for(int i = 0; i < side; i++){
//      System.out.print("*");
//    }
//    System.out.println();
//    for(int i = 0; i < side; i++){
//      System.out.print("*");
//    }
//    System.out.println();
  }
}
    