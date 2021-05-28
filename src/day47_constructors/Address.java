package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private int zipcode;
    private String country = "USA";

    //constructor - automatically called
    public Address(){
        System.out.println("Address constructor");
        street = "123 unknown st";
        city = "Java";
        state = "WS";
        zipcode = 12345;

    }
    //second constructor, overloaded constructor using param,
    // providing shortcuts to initialize variables in the same statement
    //ex. Address ad = new Address ("123 Java st, "Boston", "MA" 01234)
    public Address(String street, String city, String state, int zipcode){
        this.street =street;
        setStreet(street);

    }

    //public Address (street, city, state, zipCode)


    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet(){
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " " + zipcode + " " + country;
    }
}
