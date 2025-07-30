class Car{
  
  boolean engine;
  double speed;
  String model;
  String color;
  int wheels;
  public void updateCarInfo(String model, String color, int wheels){
    this.model = model;
    this.color = color;
    this.wheels = wheels;
  }
  public void startEngine(){
    this.engine=true;
  }
  public void brake(){
    this.speed -= 5.5;
  }
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