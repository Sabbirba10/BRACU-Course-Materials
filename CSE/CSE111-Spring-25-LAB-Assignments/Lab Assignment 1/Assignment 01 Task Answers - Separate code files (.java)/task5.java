//
//
//
//
//
//--TASK--05-------------------------------------------
import java.util.Scanner;
public class task5 {
  public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the length of the array");
    int length = sc.nextInt();
    int [] array = new int [length];
    int track = 0;
    for (int i = 0; i<length; i++) {
      System.out.println("Enter array element "+(i+1));
      array[i] = sc.nextInt();}
    if (length%2 == 0) {
      track = length/2;}
    else {
      track = (length+1)/2;}
    for (int i = length-1; i>=track; i--) {
      int temp = array [i];
      array [i] = array [length-(i+1)];
      array [length-(i+1)] = temp;}
    for (int i = 0; i<length; i++) {
      System.out.print(array[i]+" ");}
  }
}