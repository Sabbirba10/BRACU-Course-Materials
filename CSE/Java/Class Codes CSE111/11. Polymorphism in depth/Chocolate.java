public class Chocolate{
    String texture = "Chocolaty";
    public void method1() {
        method2();
        System.out.println("Chocolate m1");
    }
    public void method2() {
        System.out.println("Chocolate m2");
    }
    public String toString(){
        method2();
        return "Chocolate is "+ texture;
    }
}