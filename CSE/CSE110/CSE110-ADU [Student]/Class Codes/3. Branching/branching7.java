import java.util.Scanner;
public class branching7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    //prompt
    int marks = sc.nextInt();
    if(marks < 0 || marks > 100){
      System.out.println("Invalid");
    }
    else if( marks >= 0 && marks < 50){ //0 <= marks < 50
      System.out.println("F");
    }
    else if(marks < 60){
      System.out.println("D");
    }
    else if(marks < 70){
      System.out.println("C");
    }
    else if(marks < 80){
      System.out.println("B");
    }
    else if(marks <= 100){
      System.out.println("A");
    }
  }
}