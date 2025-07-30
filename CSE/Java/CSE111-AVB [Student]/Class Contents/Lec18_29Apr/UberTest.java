package Lec18_29Apr;

public class UberTest {
    public static void main(String[] args) {

        UberRide ride1 = new UberRide("Driver1", "Rider1", 5.4);
        // ride1.details();
        System.out.println(ride1);
        System.out.println("==========");
        ride1.calculateFare();
        System.out.println("==========");
        // ride1.details();
        System.out.println(ride1);
        System.out.println("==========");

        UberMoto ride2 = new UberMoto("Driver2", "Rider2", 4.1, "Model1");
        // ride2.details();
        System.out.println(ride2);
        System.out.println("==========");       
        ride2.calculateFare();
        System.out.println("==========");        
        // ride2.details();
        System.out.println(ride2);
        System.out.println("==========");

        System.out.println("==========");
        UberRide ride3 = ride2;
        // ride3.details();
        System.out.println(ride3);

        System.out.println("==========");
        /*
        Object ride4 = ride2;
        String address = ride3.toString();
        System.out.println(address);
        System.out.println("==========");
        System.out.println(ride4);
         */
        System.out.println("==========");
        UberMoto ride5 = (UberMoto)ride3;
        System.out.println(ride5);
    }
}
