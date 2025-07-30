import java.util.Arrays;
public class arrayBasics{
  public static void main(String [] args){
//    int [] arr = {1,4,3,2,1,5};   //[1,4,3,2,1,5]
//    System.out.println(arr[2]);
//    arr[2] = 25;
//    System.out.println(arr[2]);   //[1,4,25,2,1,5]
//    System.out.println("Length: " + arr.length); 
    int [] arr2 = new int[4];     //[0,0,0,0]
    arr2[0] = 100;                //[100,0,0,0] 
    arr2[1] = 200;                //[100,200,0,0] 
    arr2[2] = 300;                //[100,200,300,0] 
    arr2[3] = 400;                //[100,200,300,400] 
    System.out.println(arr2[2]);
    System.out.println(arr2);
//    for(int i = 0; i < arr2.length; i++){  
//      System.out.print("index: " + i +", value: "+ arr2[i]);
//    }
    
    for(int i = 0; i < arr2.length; i++){  //100, 200, 300, 400
      if(i == arr2.length-1){
        System.out.print(arr2[i]);
      }else{
        System.out.print(arr2[i] + ", ");
      }
    }
//    System.out.println(Arrays.toString(arr2));
  }
}

