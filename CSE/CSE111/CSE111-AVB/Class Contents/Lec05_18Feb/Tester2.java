package Lec05_18Feb;

public class Tester2 {
    {
        App twitter = new App();
        twitter.name = "Twitter";
        twitter.size = 80.5;
        twitter.run();
        System.out.println("================");
        System.out.println("Twitter Object: " + twitter);
        System.out.println("Info: \n"+twitter.info());
        System.out.println("================");
        App X = twitter;
        System.out.println("X Object: " + X);
        System.out.println("Info: \n"+X.info());
        System.out.println("================");
        X.close();
        System.out.println("X Object: " + X);
        System.out.println("Info: \n"+X.info());
        System.out.println("================");
        System.out.println("Twitter Object: " + twitter);
        System.out.println("Info: \n"+twitter.info());
        System.out.println("================");




    }
}
