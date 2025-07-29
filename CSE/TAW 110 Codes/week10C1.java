import java.util.Scanner;
public class week10C1
{
//Access_Modifier static void/return_type method_name(Parameters)
  public static void myMethod(int n1){        //parameters
    System.out.println(n1+" My method is working");
  }
  public static void evenCheck(int n1){        //parameters
    myMethod(78);
    if(n1%2==0){
      System.out.println(n1+" is even");
    }else{
      System.out.println(n1+" is odd");
    }
  }
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);  
    System.out.println("Inside main method start");
    //evenCheck(55);
   // myMethod(5, "CSE");    //arguments
    System.out.println("Inside main method end");
  }
}