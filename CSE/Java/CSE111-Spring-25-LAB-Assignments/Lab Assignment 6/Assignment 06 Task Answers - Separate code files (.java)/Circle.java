//
//
//
//
//--TASK--04----------------------------------------------------
public class Circle {
  public static int count =0;
  private double radius;
  
  public Circle (int a) {
    radius = a;
    count = count+1;}
  
  public double getRadius () {
    return radius;}
  
  public void setRadius (int a) {
    radius = a;}
  
  public double area () {
    return (3.1416*radius*radius);}
  
}