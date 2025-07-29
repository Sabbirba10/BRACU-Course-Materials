package Lec06_23Feb;

public class Tester {
    public static void main(String[] args) {
        App twitter = new App();
        twitter.name = "Twitter";
        twitter.size = 80.5;

        System.out.println("================"); // Blank line
        System.out.println("Twitter Object: " + twitter);
        System.out.println("Info: \n"+twitter.info());
        System.out.println("================");
        twitter.run();
        System.out.println("================");
        System.out.println("Twitter Object: " + twitter);
        System.out.println("Info: \n"+twitter.info());
        System.out.println("================");
        App X;
        X = new App();
        System.out.println("X Object: " + X);
        System.out.println("Info: \n"+X.info());
        System.out.println("================");
        X.name = "Twitter X";
        twitter.size = 95.2;
        X.run();
        System.out.println("================");
        System.out.println("X Object: " + X);
        System.out.println("Info: \n"+X.info());
        System.out.println("================");

    }
}
