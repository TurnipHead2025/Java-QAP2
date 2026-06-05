//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;


//constructor 
    public MyRectangle(MyPoint tLeft, MyPoint bRight){
       this.topLeft = new MyPoint(tLeft.getX(), tLeft.getY());
        this.bottomRight = new MyPoint(bRight.getX(), bRight.getY());
    }

//methods
     public MyPoint getTopLeft(){
        return new MyPoint(this.topLeft.getX(), this.topLeft.getY());
     }  
     
      public MyPoint getBottomRight(){
        return new MyPoint(this.bottomRight.getX(), this.bottomRight.getY());
     }  

     public void setTopLeft(MyPoint topLeft){
        this.topLeft = new MyPoint(topLeft.getX(), topLeft.getY());
    }

    public void setBottomRight(MyPoint bottomRight){
        this.bottomRight = new MyPoint(bottomRight.getX(), bottomRight.getY());
    }

    public int getWidth(){
        return this.bottomRight.getX() - topLeft.getX();
    }

    public int getHeight(){
        return this.bottomRight.getY() - topLeft.getY();
    }

    public int getArea(){
        return getWidth() * getHeight();
    }

    public int getPerimeter(){
        return 2 * (getWidth() + getHeight());
    }

//toString
    public String toString(){
        return "MyRectangle [topLeft= " + topLeft + ", bottomRight= " + bottomRight +"]";
    }    
}
