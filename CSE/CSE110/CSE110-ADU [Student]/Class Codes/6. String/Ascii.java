import java.util.Scanner;
public class Ascii{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String inp = "World";
    char ch = inp.charAt(4);
    int ascii = (int)ch;
//    System.out.println(ch + " : " + ascii);
    int ascii2 = inp.codePointAt(4);
//    System.out.println(ch + " : " + ascii2);
    char ch2 = (char)120;
//    System.out.println(120 + " : " + ch2);
    String inp2 = sc.nextLine();
    for(int i = 0; i < inp2.length(); i++){
      char c = inp2.charAt(i);
      int asc = (int)c;
      System.out.println(i + " : " + c + " : " + asc);
    }
    
  }
}