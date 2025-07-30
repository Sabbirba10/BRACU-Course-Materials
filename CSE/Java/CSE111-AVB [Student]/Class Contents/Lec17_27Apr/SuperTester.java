package Lec17_27Apr;

public class SuperTester {
    public static void main(String[] args) {
        SuperClass object1 = new SuperClass(5);
        System.out.println(object1.v1);
        SubClass object2 = new SubClass(6);
        System.out.println(object2.v1);

        System.out.println("===object1========");
        System.out.println(object1.show());

        System.out.println("===object2========");
        System.out.println(object2.show());

        System.out.println("==================");
        System.out.println("\n");

        SuperClass object3 = new SubClass(3);
        System.out.println(object3.v1);
        System.out.println("===object3========");
        System.out.println(object3.show());

        System.out.println("==================");
        System.out.println("\n");

        // SuperClass objectT = new SuperClass(3);
        // SubClass object4 = (SubClass)objectT;
        SubClass object4 = (SubClass)object3;
        System.out.println(object4.v1);
        System.out.println("===object4========");
        System.out.println(object4.show());

        System.out.println("==================");
        System.out.println("\n");

        System.out.println(object3.methodA());
    }
}
