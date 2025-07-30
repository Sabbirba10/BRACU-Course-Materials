import java.util.Scanner;
public class arrayCreation{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int [] arr = new int [size];
    
    for(int i = 0; i < arr.length; i++){
      arr[i] = sc.nextInt();
    }
    for(int i = 0; i < arr.length; i++){  //100, 200, 300, 400
      if(i == arr.length-1){
        System.out.print(arr[i]);
      }
      else{
        System.out.print(arr[i] + ", ");
      }
    }
  }
}