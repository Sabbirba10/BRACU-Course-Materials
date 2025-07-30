class CarTesterV2{
  public static void main(String[] args){
   
    //Objects of Car
    Car c1 = new Car();
    c1.updateCarInfo();
    
    Car c2 = new Car();
    c2.updateCarInfo("Toyota", "Black", 4);
    c2.startEngine();
    c2.accelerate( 34.5 );
    
    Car c3 = new Car();
    c3.updateCarInfo("Audi", "White", 4);
//    Car[] cArr = {c1, c2, c3};
    Car[] cArr = new Car[5];
    cArr[0] = c1;
    cArr[2] = c3;
    cArr[4] = c2;
    
    for( int i=0; i<cArr.length; i++ ){
      if( cArr[i]!=null ) cArr[i].showCar();
      System.out.println("--------");
    }
    
  }
}