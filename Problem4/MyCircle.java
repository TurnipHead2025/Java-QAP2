//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2


public class MyCircle{
    private String color = "red";
    private double radius;


//Constructors
    public MyCircle()
    {
        this.color = "red";
        this.radius = 1.0;
    }
    public MyCircle(double r)
    {
        this.radius = r;
    
    }
    public MyCircle(String c, double r)
    {
        this.color = c;
        this.radius = r;
    }

//methods    

    public double getRadius()
    {
        return this.radius;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setColor(String s)
    {
        this.color = s;
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }
    public double getArea()
    {
        return (Math.PI * this.radius * this.radius);
    }

}