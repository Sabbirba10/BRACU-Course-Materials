package Lec15_20Apr.Two;

public class IceCreamTester2 {
 public static void main(String[] args) {
  IceCream a = new IceCream("Vanilla");
  // // System.out.println("Ice-cream Flavour: " + a.flavour);
  System.out.println(a.showFlavour());
  System.out.println("==================");
  BoxIceCream b = new BoxIceCream("Mango", 1.5);
  // // System.out.println("Box Ice-cream Flavour: " + b.flavour);
  System.out.println("Box " + b.showFlavour());
  // System.out.println("Size:" + b.size + " " + b.unit);
  // System.out.println("==================");
  // ConeIceCream c = new ConeIceCream("Chocolate", 2);
  // // System.out.println("Cone Ice-cream Flavour: " + c.flavour);
  // System.out.println("Cone " + c.showFlavour());
  // System.out.println("Size:" + c.size + " " + c.unit);
  // System.out.println("==================");
 }
}