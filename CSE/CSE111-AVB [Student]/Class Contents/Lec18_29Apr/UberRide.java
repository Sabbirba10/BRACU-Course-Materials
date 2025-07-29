package Lec18_29Apr;

public class UberRide {
    String driver;
    String rider;
    double distance;
    double fare;

    UberRide(String d, String r, double dist) {
        driver = d; rider = r; distance = dist;
        System.out.println("New Uber Ride Started");
    }

    void calculateFare() {
        fare = distance*30;
        System.out.println("Fare Set at "+fare+" TK");
    }

    // void details() {
    //     System.out.print("Driver: "+driver+", ");
    //     System.out.println("Rider: "+rider);
    //     System.out.println("Distance: "+distance + "KM");
    //     System.out.println("Fare: "+fare+"TK");
    // }

    public String toString(){
        String s = "Driver: "+driver+", Rider: "+rider;
        s += "\nDistance: "+distance + "KM, Fare: "+fare+"TK";
        return s;
    }

}

class UberMoto extends UberRide{
    String model;
    UberMoto(String d, String r, double dist, String m) {
        super(d, r, dist);
        model = m;
    }

    void calculateFare() {
        fare = distance*25;
        System.out.println("Fare Set at "+fare+" TK");
    }

    // void details() {
    //     System.out.println("Model:"+model);
    //     System.out.print("Driver: "+driver+", ");
    //     System.out.println("Rider: "+rider);
    //     System.out.println("Distance: "+distance + "KM");
    //     System.out.println("Fare: "+fare+"TK");
    // }

    public String toString(){
        String s = "Model: " +model;
        return s+"\n"+super.toString();
    }

}
