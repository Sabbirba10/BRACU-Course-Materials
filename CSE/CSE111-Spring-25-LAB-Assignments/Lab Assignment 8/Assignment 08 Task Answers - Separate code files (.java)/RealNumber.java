public class RealNumber {
public double realValue;
public RealNumber() {
this(0.0);
}
public RealNumber(double realValue) {
this.realValue = realValue;
}
public String toString(){
return "RealPart: " + realValue;
}
}