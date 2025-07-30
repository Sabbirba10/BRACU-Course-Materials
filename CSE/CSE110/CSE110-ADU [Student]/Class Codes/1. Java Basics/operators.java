public class operators{
  public static void main(String [] args){
//    System.out.println(5/2);
//    System.out.println(5.0/2);
//    System.out.println(5/2.0);
//    System.out.println(5.0/2.0);
    int a = 10;
    a += 5;
    //a = a + 5;
//    System.out.println(a + 3); //18
//    System.out.println(-a);
//    System.out.println(a);     //15
    
    
    int x = 5;
    int y = ++x;
    //x += 1;
//    System.out.println(x);   
//    System.out.println(y); 
    ++x;
//    System.out.println(++x);
    
    int r = 6;
    int s = r++;
//    r += 1;
    System.out.println(r);   //7
    System.out.println(s);   //6
    System.out.println("=========");
    int num = 10;
    int sum = num++ + 5 + num; //25,26
    System.out.println(sum);
    
    int m = 7;
    int eq = ++m + m + m++;
    // eq =   8  + 8 + 8
    System.out.println(eq); //24
    System.out.println(m);  //9
    
    int z = 8;
    int eq2 = ++z + z++ + z; //28,26
    //  eq2 =   9 + 9   + 10
    System.out.println(eq2);
    
    System.out.println(5*(5+5/5%(5*5))); 
    //5*(5+5/5%25)
    //5*(5+1%25)
    //5*(5+1)
    //5*6 
    //30
    int id = 24101233;
    int last_digit = id % 10;
    System.out.println(last_digit);  
  }
}


