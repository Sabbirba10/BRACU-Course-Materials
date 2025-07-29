import java.util.Scanner;
public class palindrome{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine(); //nursesrun
    //abccba
//    int count = 0;
    boolean flag = false;
    for(int i = 0; i < s1.length()/2; i++){
      if(s1.charAt(i) == s1.charAt(s1.length()-1-i)){
//        System.out.println("Palindrome");
//        count = 0;
      }
      else{
//        count++;
        flag = true;
//        System.out.println("Not a palindrome");
      }
    }
//    if(count == 0){
//      System.out.println("Palindrome");
//    }
//    else{
//      System.out.println("Not a Palindrome");
//    }
    if(flag == false){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not a Palindrome");
    }
  }
}



