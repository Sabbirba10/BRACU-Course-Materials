public class recursion1{
  public static void main(String [] args){
//    printNumberLoop(5);
    printNumberRec(5);
  }
  public static void printNumberRec(int num){
    if(num == 0){ //base case
      System.out.println(num);
    }
    else{ 
//      System.out.println(num);
      printNumberRec(num-1); //recursive case
      System.out.println(num);
    }
  }
//  public static void printNumberLoop(int num){
//    for(int i = num; i >= 0; i--){
//      System.out.println(i);
//    }
//  }
}