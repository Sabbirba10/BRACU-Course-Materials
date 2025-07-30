package Lec15_20Apr.Two;

public class IceCream {
    String flavour;

    IceCream() {
        System.out.println("New Ice-cream Available!");
    }
    IceCream(String f) {
        this();
        flavour = f;
    }

    // String showFlavour(){
    //     return "Ice-cream Flavour: "+flavour;
    // }
}

//======================================================
class BoxIceCream extends IceCream {
    double size;
    static String unit = "Litres";

    BoxIceCream() {
        System.out.println("Type: Box");
    }
    BoxIceCream(String f,  double s) {
        super(f);
        System.out.println("Type: Box");
        size = s;
    }
}

//======================================================
class ConeIceCream extends IceCream {
    int size;
    static String unit = "Scoops";
    ConeIceCream() {
        System.out.println("Type: Cone");
    }
    ConeIceCream(String f, int s) {
        super(f);
        System.out.println("Type: Cone");
        size = s;
    }
}

