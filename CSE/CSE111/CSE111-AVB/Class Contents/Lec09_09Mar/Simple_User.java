package Lec09_09Mar;

public class Simple_User {
    public String name;
    public String nameOfFather;
    public String nameOfMother;
    public String dateOfBirth;
    // public String address_house;
    // public String address_city;
    // public int address_zip_code;
    // public String country;
    public Address addr;

    public Simple_User(String name, String nameOfFather, String nameOfMother, String dateOfBirth, 
    String address_house, String address_city, int address_zip_code, String country){

        this.name=name;
        this.nameOfFather=nameOfFather;
        this.nameOfMother=nameOfMother;
        this.dateOfBirth=dateOfBirth;
        // this.address_house=address_house;
        // this.address_city=address_city;
        // this.address_zip_code=address_zip_code;
        // this.country=country;
        this.addr = new Address(address_house, address_city, address_zip_code, country);

        System.out.println("New User created successfully");
    }

    public void showUser(){
        System.out.println(
            "Name: "+this.name+
        "\nName of Father: "+this.nameOfFather+
        "\nName of Mother: "+this.nameOfMother+
        "\nDate of Birth: "+this.dateOfBirth);
        // System.out.println(
        // "\nAddress: "+this.address_house+
        // ", "+this.address_city+
        // "-"+this.address_zip_code+
        // ", "+this.country
        // );
        this.addr.showAddress();
    }
}

