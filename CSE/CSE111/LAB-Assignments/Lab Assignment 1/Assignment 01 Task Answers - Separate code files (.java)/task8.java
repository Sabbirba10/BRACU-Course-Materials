//
//
//
//
//
//--TASK--08-------------------------------------------
import java.util.Scanner;
public class task8 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Row Size");
    int row = sc.nextInt();
    System.out.println("Enter Column Size");
    int col = sc.nextInt();
    int [] [] twoDarray = new int [row] [col];
    int [] oneDarray = new int [row*col];
    for (int i = 0; i<row; i++) {
      for (int j = 0; j<col; j++) {
        System.out.println("Enter Integer for Row "+ i + " & Column " + j);
        twoDarray[i][j] = sc.nextInt();}}
    System.out.println("2D Array: ");
    int count = 0;
    for (int i = 0; i<row; i++) {
      for (int j = 0; j<col; j++) {
        oneDarray [count] =  twoDarray[i][j];
        count = count + 1;
        System.out.print(twoDarray[i][j] + " ");}
      System.out.println();}
    System.out.println("1D Array: ");
    for (int i = 0; i<oneDarray.length; i++) {
      System.out.print(oneDarray[i]+" ");}
  }
}
    