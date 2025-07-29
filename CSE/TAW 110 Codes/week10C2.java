import java.util.Scanner;
public class week10C2
{
//Access_Modifier static void/return_type method_name(Parameters)
  public static void add1(int n1, int n2){        //remote to projector
    System.out.println(n1+n2);
  }
  public static int add2(int n1, int n2){        //parameters
    return n1+n2;
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);  
    System.out.println("Main method starts");
    //add1(48, 232);       //remote to projector
    int result = add2(4, 5); //remote to projector and then projector to remote
    //System.out.println(result);  
    System.out.println("Main method ends");
  }
}