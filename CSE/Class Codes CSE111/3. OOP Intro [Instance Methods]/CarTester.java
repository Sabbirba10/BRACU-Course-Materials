class CarTester{  
  public static void main(String[] args){
    Car c1 = new Car();
    c1.updateCarInfo( "Toyota Cross", "White", 4 );
    c1.startEngine();
    c1.accelerate( 13.5 );
    c1.showSpeed();
    System.out.println("------------");
    Car c2 = new Car();
    c2.updateCarInfo( "Scania", "Blue", 12 );
    c2.startEngine();
    c2.accelerate( 5.5 );
    c2.showSpeed();
    System.out.println("------------");
    c1.crash( c2 );
    System.out.println("------------");
    Car c3 = new Car();
    c3.updateCarInfo( "Toyota Cross", "White", 4 );
    System.out.println( c1.compareCar(c3) );
  }
}