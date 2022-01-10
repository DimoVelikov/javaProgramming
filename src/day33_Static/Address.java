package day33_Static;

public class Address {

    public String street, city, state;
    public int zipCode;

    static String country ="USA", planet= "Earth";

    public Address(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public void setInfo(String street, String city, String state, int zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return street +
                "\n"+ city + " " + state +", " + zipCode;
    }


}
