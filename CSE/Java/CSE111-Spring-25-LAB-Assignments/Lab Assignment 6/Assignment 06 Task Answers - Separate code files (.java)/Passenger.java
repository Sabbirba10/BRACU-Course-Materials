//
//
//
//
//--TASK--02----------------------------------------------------
public class Passenger {
  public String name;
  public double fare;
  public static int no_of_passenger = 0;
  public static double total_fare = 0.0;
  
  
  public Passenger (String a, double b) {
    name = a;
    fare = b*20;
    no_of_passenger = no_of_passenger+1;
    total_fare = total_fare+fare;}
  
  public void passengerDetails () {
    System.out.println("Name: "+name);
    System.out.println("Fare: "+fare+" TK ");}
  
  public void storeBaggageWeight (double a) {
    fare = fare+(a*10);
    total_fare = total_fare+(a*10);}
  
}