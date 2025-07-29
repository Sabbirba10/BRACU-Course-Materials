package Lec01_04Feb;
public class TestingFile {
    public static void main(String[] args) {
        System.out.println("Main Method");
        method1(); // call operation
        int a = method2();
        System.out.println("a = "+a);
    }

    public static void method1() {
        System.out.println("Method 1");
        return;
    }

    public static int method2() {
        return 5;
    }
}