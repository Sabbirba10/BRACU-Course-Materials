//
//
//
//
//--TASK--02----------------------------------------
public class Shape {
  public String ShapeName;
  public double Area;
  
  public void setParameters (String a, int b) {
    this.ShapeName = a;
    this.Area = 3.14*b*b;}
  
  public void setParameters (String a, int b, int c) {
    this.ShapeName = a;
    this.Area = 0.5*b*c;}
  
  public void setParameters (String a, double b, double c) {
    this.ShapeName = a;
    this.Area = b*c;}
  
  public String details () {
    String a = "Shape Name: "+ShapeName+"\nArea: "+Area;
    return a;}
}