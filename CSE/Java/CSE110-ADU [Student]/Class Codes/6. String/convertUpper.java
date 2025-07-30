import java.util.Scanner;
public class convertUpper{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    // s2 = "Heo"
    String ans = "";
//    System.out.println(ans);
    for(int i = 0; i < s1.length(); i++){
      char ch = s1.charAt(i);
      int ascii = (int)ch;
      if(ascii >= 97 && ascii <= 122){
        int asc2 = ascii - 32;
        char newCh = (char)asc2;
//      System.out.print(newCh);
        ans = ans + newCh; // "H" + 'E' = "HE"
//      System.out.println(ans);
      }
      else{
        ans += ch;
      }
    }
    System.out.println(ans);
  }
}


//convert lower
//convert =>  upper > lower, lower > upper