class CarTester{  
  public static void main(String[] args){
    
    Car c1;
    Car c2 = new Car();
    c1 = c2;
    c1.wheels = 50;
    System.out.println( c2.wheels );
  }
  
}