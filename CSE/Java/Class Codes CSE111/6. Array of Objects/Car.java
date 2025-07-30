class Car{
  
  boolean engine;
  double speed;
  String model;
  String color;
  int wheels;
  
  // POLYMORPHISM
  // Method Overloading :: Compile Time Polymorphism
  
  public void updateCarInfo(){
    this.model = "Default Model";
    this.color = "White";
    this.wheels = 4;
  }
  //Overloaded V0
  public void updateCarInfo(String model, String color, int wheels){
    this.model = model;
    this.color = color;
    this.wheels = wheels;
  }
  //Overloaded V1
  public void updateCarInfo(String model, String color){
    this.model = model;
    this.color = color;
  }
  //Overloaded V2
  public void updateCarInfo(int wheels){
    this.wheels = wheels;
  }
  //Overloaded V3
  public void updateCarInfo(String color, int wheels){
    this.color = color;
    this.wheels = wheels;
  }
  //Overloaded V4
  public void updateCarInfo(String model){
    this.model = model;
  }
  
  public void startEngine(){
    this.engine=true;
  }
  public void brake(){
    this.speed -= 5.5;
  }
  
  public boolean accelerate(){
    if( engine ){
      this.speed += 5.5;
      return true;
    } else {
      System.out.println("The Engine is Off!");
      return false;
    }
  }
  // Overloaded v1
  public void accelerate(double speed){
    if( engine ) this.speed += speed;
    else System.out.println("The Engine is Off!");
  }
 
  public void showSpeed(){
    System.out.println("The "+this.model+" is going at "+this.speed+" km/hr");
  }
  public double returnSpeed(){
    return this.speed;
  }
  
  public void showCar(){
    System.out.println("Car model: "+this.model);
    System.out.println("Car color: "+this.color);
    System.out.println("Car wheels: "+this.wheels);
    if (engine) System.out.println("Engine Status: On");
    else System.out.println("Engine Status: Off");
    this.showSpeed();
  }
  //Overloaded v1
  public void showCar( boolean spd ){
    System.out.println("Car model: "+this.model);
    System.out.println("Car color: "+this.color);
    System.out.println("Car wheels: "+this.wheels);
    if (engine) System.out.println("Engine Status: On");
    else System.out.println("Engine Status: Off");
    if (spd) this.showSpeed();
  }
   
  public void crash( Car c ){
    System.out.println( this.model+" crashed with "+c.model ); 
    c.engine = this.engine = false;
    c.speed = this.speed = 0.0;
  }
  public boolean compareCar( Car c ){
    if (this.wheels == c.wheels &&
        this.color.equals( c.color ) &&
        this.model.equals( c.model ) ){
      return true;
    } else {
      return false;
    }
  }
}