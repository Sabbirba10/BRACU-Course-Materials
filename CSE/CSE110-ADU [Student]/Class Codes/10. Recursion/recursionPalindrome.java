public class recursionPalindrome{
  public static void main(String [] args){
    boolean ans = palindrome("madam", 0);
    System.out.println(ans);
//    stringIter("abcde", 0);
  }
  public static boolean palindrome(String str, int idx){
    if(idx == str.length()/2){ //base case
      return true;
    }
    else{
      if(str.charAt(idx) != str.charAt(str.length()-1-idx)){
        return false;
      }
      else{
        return palindrome(str, idx+1);
      }
    }
  }
  
  public static void stringIter(String str, int idx){
    if(idx == str.length()){  //base case
      
    }
    else{
      System.out.println(str.charAt(idx));
      stringIter(str, idx+1);
    }    
  }
}