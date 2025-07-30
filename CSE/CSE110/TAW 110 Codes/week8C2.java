import java.util.Scanner;
public class week8C2
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);  
    String s1 = "JavaProgrammer123++";
    String s2 = "";
    for(int i =0;i<s1.length();i++){
      if(s1.codePointAt(i)>=97 && s1.codePointAt(i)<=122){
        int temp = s1.codePointAt(i);   //97
        temp = temp - 32;   // 65
        char c = (char)temp;
        s2 += c;
      }else{
        s2 += s1.charAt(i);
      }
    }
    System.out.println(s2);
  }
}