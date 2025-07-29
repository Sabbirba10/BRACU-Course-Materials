import java.util.Scanner;
public class charSearch{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine(); //class
    String s2 = sc.nextLine(); //s
    boolean flag = false;
    for(int i = 0; i < s1.length(); i++){
//      if(s1.charAt(i) == s2){
//      if(s1.charAt(i).equals(s2)){
      String temp = ""+s1.charAt(i);
//      if(s1.charAt(i) == s2.charAt(0)){
      if(temp.equals(s2)){
        flag = true;
      } 
    }
    if(flag == true){
      System.out.println("found");
    }else{
      System.out.println("not found");
    }
  }
}
    
//char remove -> class, a > clss
//char replace -> class, a, t > cltss

