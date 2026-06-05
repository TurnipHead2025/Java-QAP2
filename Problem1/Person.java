//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2


public class Person {
    private String lastName;
    private String firstName;
    private Address home;   //Address class 

//constructor
    public Person(String firstName, String lastName, Address home){
        this.firstName = firstName;
        this.lastName = lastName;
        this.home = home;
    }


// toString
    public String toString(){
        return (firstName + " " + lastName + ", " + home.toString());
    }   
}
