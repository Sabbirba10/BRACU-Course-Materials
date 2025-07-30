//
//
//
//
//--TASK--05--------------------------------------
public class ComplexNumber extends RealNumber {
  public double imgValue;
  
  public ComplexNumber () {
    super(1.0);
    imgValue = 1.0;}
  
  public ComplexNumber (double a, double b) {
    super(a);
    imgValue = b;}
  
  public String toString() {
    return super.toString()+"\nImaginaryPart: "+imgValue;}
  
}