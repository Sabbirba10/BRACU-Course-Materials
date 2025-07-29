class Tester{
  
  public static void main(String[] args){
    Garage g = new Garage();
    System.out.println("---------");
    g.showGarage();
    System.out.println("---------");
    Car c = new Car();
    c.updateCarInfo("Audi");
    Car c1 = new Car();
    c1.updateCarInfo("Toyota","White",4);
    g.storeCar( c );
    g.storeCar( c1 );
    g.showGarage();
  }  
}