import java.util.Scanner;
public class week7C2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);  
    String s1 = "This is CSE123";
    for(int i =0;i<s1.length();i++){
      if(s1.charAt(i)>='0' && s1.charAt(i)<='9'){
        System.out.println(s1.charAt(i));
      }
    }
    
    
    
    
//    for(int i =0;i<s1.length();i++){
//      System.out.println(s1.charAt(i)+" : "+s1.codePointAt(i));
//    }
//    System.out.println((int)'L');   // ascii value dey
//    System.out.println((char)70);
    
    
    
    
    
    
    
//    System.out.println(s1 == s2);
//    System.out.println(s1.equals(s2));
    
    
    
    //System.out.println(s1.charAt(0));
//    System.out.println(s1+" "+s2);
    
//    for(int i=0;i<s1.length();i++){
//      System.out.println(i+" "+s1.charAt(i));
//    } 
//    
    
    
    //System.out.println(s1.length());
  }
}