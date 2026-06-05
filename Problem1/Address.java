//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2



public class Address {
    private String street;   //instance var-fields
    private String city;
    private String state;
    private String zip;

//constructor
    public Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }


//toString
    public String toString(){
        return (street + ", " + city + ", "+ state + "\n" + zip);
    }    
}
