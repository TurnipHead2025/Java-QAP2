//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2


public class CreditCard {
    private Money balance;       //instance var-fields
    private Money creditLimit;
    private Person owner;

//constructor
    //limit is a money obj, not a number. The Money Copy constructor has a money obj as a param. So java knows to use the copy constructor. The copy takes THIS dollars and THIS cents which makes THIS the arguments passed as limit. limit becomes otherAmount (weird comments maybe, but it's notes for my brain lol)
    public CreditCard(Person newCardHolder, Money limit){
        this.owner =newCardHolder;
        this.creditLimit = new Money(limit);
        this.balance = new Money(0); 
    }

//methods
    //getters. get methods returns the value of each field

    // return a COPY for security. Changes will not affect the real balance
    public Money getBalance(){
        return new Money (this.balance);
    }

    public Money getCreditLimit(){
        return new Money (this.creditLimit);
    }

    // owner is a Person Obj. Returning the Person toString
    public String getPersonals(){
        return owner.toString();
    }

    //if the balance plus the amount, compared (subrtacted from) the creditlimit is greater than 0. The purchase is over under the creditLimit-deny. If not proceed
    public void charge(Money amount){
        if (balance.add(amount).compareTo(creditLimit) > 0){
            System.out.println("Exceeds credit limit");
        }else{
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);

        }
    }
        public void payment(Money amount){
            balance = balance.subtract(amount);
            System.out.println("Payment: " + amount);
        }   

    

}
