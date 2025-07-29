package Lec15_20Apr.Three;

public class SuperTester {
    public static void main(String[] args) {
        SuperClass object1 = new SuperClass(5);
        System.out.println(object1.variable);
        SubClass object2 = new SubClass(6);
        System.out.println(object2.variable);
    }
}
