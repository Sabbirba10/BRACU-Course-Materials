package Lec07_02Mar;

public class Order {
    String products = "";
    double cost = 0;

    public void purchase(String s, double d) {
        System.out.println(s +" Order Successful");
        this.products += "\n"+s;
        this.cost += d;
    }
    public void purchase(double d, String s) {
        System.out.println(s +" Order Successful");
        this.products += "\n"+s;
        this.cost += d;

    }
    public void purchase(String s1, String s2, String s3, double d) {
        
        System.out.println(s1 +" Order Successful");
        this.products += "\n"+s1;
        System.out.println(s2 +" Order Successful");
        this.products += "\n"+s2;
        System.out.println(s3 +" Order Successful");
        this.products += "\n"+s3;
        this.cost += d;

    }
}
