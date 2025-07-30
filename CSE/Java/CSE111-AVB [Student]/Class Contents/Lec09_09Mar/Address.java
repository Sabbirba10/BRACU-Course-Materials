package Lec09_09Mar;

public class Address {
    public String address_house;
    public String address_city;
    public int address_zip_code;
    public String country;

    public Address(String address_house, String address_city, int address_zip_code, String country){
        this.address_house=address_house;
        this.address_city=address_city;
        this.address_zip_code=address_zip_code;
        this.country=country;
    }

    public void showAddress(){
        System.out.println("Address: "+this.address_house+
        ", "+this.address_city+
        "-"+this.address_zip_code+
        ", "+this.country);
    }
}
