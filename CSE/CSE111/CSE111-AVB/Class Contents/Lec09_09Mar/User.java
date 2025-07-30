package Lec09_09Mar;

public class User {
    public String name;
    public String nameOfFather;
    public String nameOfMother;
    public String dateOfBirth;
    public Address addr;
    public User friend;

    public User(String name, String nameOfFather, String nameOfMother, String dateOfBirth, 
    String address_house, String address_city, int address_zip_code, String country){

        this.name=name;
        this.nameOfFather=nameOfFather;
        this.nameOfMother=nameOfMother;
        this.dateOfBirth=dateOfBirth;
        this.addr = new Address(address_house, address_city, address_zip_code, country);

        System.out.println("New User created successfully");
    }

    public void showUser(){
        System.out.println(
            "Name: "+this.name+
        "\nName of Father: "+this.nameOfFather+
        "\nName of Mother: "+this.nameOfMother+
        "\nDate of Birth: "+this.dateOfBirth);
        this.addr.showAddress();
        System.out.println("Friend: "+this.friend);
        
    }

    public void birthdayWish(String date) {
        if (this.friend.dateOfBirth.equals(date))  // date ki same??
        {
            System.out.println("Happy birthday, "+this.friend.name);
        }
        else {
            System.out.println("Birthday is not today.");
        }
    }

}
