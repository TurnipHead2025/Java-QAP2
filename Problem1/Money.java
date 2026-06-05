//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2

public class Money {
    private long dollars; //instance var-fields
    private long cents;   // long = data type really big int over 2 mil



// overloading constructors (same name, different params)

    // casting a double to a long chops off the decimals. But that truncates the long decimal. Rounded the cents to prevent that issue.
    public Money(double amount){
       this.dollars =(long) amount;
       this.cents = Math.round((amount - this.dollars) * 100);
    }

    //copy constructor
    public Money(Money otherAmount){
        this.dollars = otherAmount.dollars;
        this.cents =  otherAmount.cents;
    }

//methods

    //convert to cents. ADD this to new. create new Money obj. Convert back to 00.00
    public  Money add(Money otherAmount){
        long totalcents = (this.dollars *100 + this.cents) + (otherAmount.dollars *100 + otherAmount.cents);
        return new Money (totalcents / 100.0);
    }

        //convert to cents. subtract this from new. create new Money obj. Convert back to 00.00
    public Money subtract(Money otherAmount){
        long totalcents = (this.dollars *100 + this.cents) - (otherAmount.dollars *100 + otherAmount.cents);
        return new Money (totalcents / 100.0);
    }

    //convert to cents. subtract this obj from new obj
    public int compareTo(Money otherObject){
        long totalCentsThis = (this.dollars * 100 + this.cents);
        long totalCentsOther = (otherObject.dollars * 100 + otherObject.cents);
        return (int) (totalCentsThis -totalCentsOther);
    }

        //Use compareTo to check for equality. If you use an if statement VS Code gets snarky and tells you "it's redudant" lol
    public boolean equals(Money otherObject){
       return this.compareTo(otherObject) == 0;
    }

//toString
    public String toString(){
        return String.format("$%d.%02d", dollars, cents);
    }






}    




