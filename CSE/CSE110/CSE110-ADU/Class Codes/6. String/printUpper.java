import java.util.Scanner;
public class printUpper{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    for(int i = 0; i < s1.length(); i++){
      char ch = s1.charAt(i);
      int ascii = (int)ch;
      if( ascii >= 65 && ascii <= 90){
        System.out.print(ch);
      }
    }
  }
}