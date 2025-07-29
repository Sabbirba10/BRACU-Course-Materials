package Lec16_22Apr.Two;

public class IceCreamTester3 {
 public static void main(String[] args) {
  IceCream a = new IceCream("Vanilla");
  System.out.println(a.showFlavour());
  System.out.println("==================");
  BoxIceCream b = new BoxIceCream("Mango", 1.5);
  System.out.println(b.showFlavour());
 }
}