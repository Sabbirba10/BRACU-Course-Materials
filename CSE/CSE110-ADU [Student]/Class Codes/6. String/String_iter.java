import java.util.Scanner;
public class String_iter{
  public static void main(String [] args){
//    char ch = "A";
    Scanner sc = new Scanner(System.in);
    String inp = sc.nextLine();
    
    for(int idx = 0; idx < inp.length(); idx++){ 
      char ch = inp.charAt(idx);
      System.out.println(idx+ " : " + ch);
    }
    
//    String given = "World";
//    System.out.println(given.charAt(0));
//    System.out.println(given.charAt(1));
//    System.out.println(given.charAt(2));
//    System.out.println(given.charAt(3));
//    System.out.println(given.charAt(4));
  }
}