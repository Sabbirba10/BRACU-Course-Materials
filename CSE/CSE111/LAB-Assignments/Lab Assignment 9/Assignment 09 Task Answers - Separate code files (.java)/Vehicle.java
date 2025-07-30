public class Vehicle {
private String brand;
private int year, wheels;
public Vehicle(String b, int y){
this.brand = b;
this.year = y;
}
public String getBrand(){
return this.brand;
}
public int getYear(){
return this.year;
}
public void setWheels( int w ){
this.wheels = w;
}
public int getWheels(){
return this.wheels;
}
public String toString(){
return "Brand: "+this.brand+", Year: "+this.year+", Wheels: "+this.wheels;
}
}