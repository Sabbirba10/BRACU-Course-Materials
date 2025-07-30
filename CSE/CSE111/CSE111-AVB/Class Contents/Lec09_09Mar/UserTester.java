package Lec09_09Mar;
public class UserTester {
    public static void main(String[] args) {
        Simple_User user1 = new Simple_User("NameA", "NameB", "NameC", "01/02/03", "House123", "Dhaka", 1234, "Bangladesh");
        System.out.println("========");
        user1.showUser();

        System.out.println("---------------");

        User userA = new User("NameA", "NameB", "NameC", "01/02/03", "House123", "Dhaka", 1234, "Bangladesh");
        System.out.println("========");
        userA.showUser();

        System.out.println("= = = = = = = =");

        User userB = new User("NameB", "NameX", "NameY", "01/02/03", "House123", "Dhaka", 1234, "Bangladesh");
        System.out.println("========");
        userB.showUser();

        userA.friend = userB;
        userB.friend = userA;
        System.out.println("========");
        System.out.println("For "+userA);
        userA.showUser();
        System.out.println("========");
        System.out.println("For "+userB);
        userB.showUser();

        System.out.println("= = = = = = = =");
        userA.birthdayWish("01/02/03");
        System.out.println("= = = = = = = =");
        userB.birthdayWish("02/01/03");
    }
}
