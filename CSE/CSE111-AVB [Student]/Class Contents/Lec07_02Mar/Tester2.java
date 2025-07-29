package Lec07_02Mar;

public class Tester2 {
    public static void main(String[] args) {
        App twitter = new App("Twitter",80.5);
        App facebook = new App();
        // twitter.run();
        System.out.println("Fcebook Object: " + facebook);
        System.out.println("Info: "+facebook.info());
        System.out.println("================");
        System.out.println("Twitter Object: " + twitter);
        System.out.println("Info: "+twitter.info());
        System.out.println("================");


    }
}
