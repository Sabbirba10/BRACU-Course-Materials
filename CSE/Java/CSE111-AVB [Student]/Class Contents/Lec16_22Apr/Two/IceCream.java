package Lec16_22Apr.Two;

public class IceCream {
    String flavour;

    IceCream(String f) {
        flavour = f;
        System.out.println("New IceCream Flavour :"+f);
    }

    String showFlavour(){
        return "Ice-cream Flavour: "+flavour;
    }
}

//======================================================
class BoxIceCream extends IceCream {
    double size;
    static String unit = "Litres";

    BoxIceCream(String f,  double s) {
        super(f);
        System.out.println("Type: Box");
        size = s;
    }
    String showFlavour(){
        return "Box "+super.showFlavour();
    }
}

