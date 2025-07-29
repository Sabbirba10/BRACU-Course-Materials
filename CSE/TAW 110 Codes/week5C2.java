import java.util.Scanner;
public class week5C2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
//    int outer = 1;
//    while(outer<=2){
//      int inner = 1;
//      while(inner<=3){
//        System.out.println(outer+" "+inner);
//        inner++;
//      }
//      System.out.println("Inner loop sesh");
//      outer++;
//    }
    
    for(int outer=1;outer<=2;outer++){
      for(int inner=1;inner<=3;inner++){
        System.out.println(outer+" "+inner);
      }
      System.out.println("Inner loop sesh");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
//    //for(initialization; condition; step)
//    for(int i=1;i<=2;){
//      System.out.println("enter number "+i);
//      int num = sc.nextInt();
//      if(num%2==0){
//        System.out.println(num);
//        i++;
//      }
//    }
//    System.out.println("Last line of the code");
    
    
    
    
//    int count = 1;       // initialization
//    while(count<=100){    // Condition
//      if(count%4==0){
//        System.out.println(count+" div by 4");  // Body.
//      }else{
//        System.out.println(count+" Jani na");
//      }
//      count += 1;                           //steps
//    }
  }
}