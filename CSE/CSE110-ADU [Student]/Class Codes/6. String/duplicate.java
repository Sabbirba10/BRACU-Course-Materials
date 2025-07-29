import java.util.Scanner;
public class duplicate{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String st = sc.nextLine(); //BDABDSA -> BDAS
    String ans = "";
    ans += st.charAt(0);
    for(int i = 1; i < st.length(); i++){
      char ch = st.charAt(i);
      boolean flag = false;
      for(int j = 0; j < ans.length(); j++){
        if(ch == ans.charAt(j)){
          flag = true;
        }        
      }
      if(flag == false){
        ans += ch;
      }
    }
    System.out.println(ans);
  }
}

//Consecutive duplicate -> AAABBACCDA -> ABACDA
