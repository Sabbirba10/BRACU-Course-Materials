//
//
//
//
//--Task-06--Garage----------------------------------
public class Garage {
  public Car [] cars;
  public Bike [] bikes;
  public int carcount = 0;
  public int bikecount = 0;
  
  public Garage (int a, int b){
    cars = new Car [a];
    bikes = new Bike [b];
    System.out.println("Welcome to the Garage!");
    System.out.println("Car Capacity: "+a);
    System.out.println("Bike Capacity: "+b);}
  
  public void addVehicle(Vehicle a) {
    if (a instanceof Car) {
      Car b = (Car) a;
      if (carcount==cars.length) {
        System.out.println("Can't add more Cars! Capacity: "+cars.length);}
      else {
        cars[carcount] = b;
        System.out.println("A "+b.getBrand()+" CAR has been added to the Garage");
        carcount = carcount+1;}}
    else {
      Bike b = (Bike) a;
      if (bikecount==bikes.length) {
        System.out.println("Can't add more bikes! Capacity: "+bikes.length);}
      else {
        bikes[bikecount] = b;
        System.out.println("A "+b.getBrand()+" BIKE has been added to the Garage");
        bikecount = bikecount+1;}}}
}