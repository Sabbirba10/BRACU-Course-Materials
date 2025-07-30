import java.util.Scanner;
public class reverse{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String ans = "";
    for(int i = s1.length()-1; i >= 0 ; i--){
      ans += s1.charAt(i);
    }
    System.out.println(ans);
  }
}

//palindrome