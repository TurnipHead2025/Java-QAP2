//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2

public class MyLine {
    private MyPoint begin;
    private MyPoint end;


//constructors

    public MyLine (int x1, int y1, int x2, int y2){
        this.begin = new MyPoint(x1,y1);
        this.end = new MyPoint (x2, y2); 
    }

    // The users passes in two MyPoint objs. The body is 'getting' the x and y values from the MyPoint objs passed in. And building new MyPoint objs. Honestly I am lost here. 
    public MyLine (MyPoint begin, MyPoint end){
        this.begin = new MyPoint(begin.getX(), begin.getY());
        this.end = new MyPoint(end.getX(), end.getY());
    }

//methods

    public MyPoint getBegin(){
        return new MyPoint(this.begin.getX(), this.begin.getY());
    }

    public MyPoint getEnd(){
        return new MyPoint(this.end.getX(), this.end.getY());
    }

    public int getBeginX(){
        return this.begin.getX();
    }

    public int getBeginY(){
        return this.begin.getY();
    }

    public int getEndX(){
        return this.end.getX();
    }

    public int getEndY(){
        return this.end.getY();
    }

    //update where the line starts without creating a whole new line object
    public void setBegin(MyPoint begin){
        this.begin = new MyPoint(begin.getX(), begin.getY());
    }
    public void setEnd(MyPoint end){
        this.end = new MyPoint(end.getX(), end.getY());
    }

    public void setBeginX(int x){
        this.begin.setX(x);
    }

    public void setBeginY(int y){
        this.begin.setY(y);
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    public void setBeginXY(int x, int y){
        this.begin.setXY(x,y);
    }

     public void setEndXY(int x, int y){
        this.end.setXY(x,y);
    }

    public double getLength(){
        return this.begin.distance(this.end);
    }

    //I have no idea what's happening here    
    public double getGradient(){
        int yDiff = this.end.getY() - this.begin.getY();
        int xDiff = this.end.getX() - this.begin.getX();
        return Math.atan2(yDiff,xDiff);
    }

//toString
    public String toString(){
        return("MyLine[begin=" + this.begin + ",end=" + this.end + "]");
    }    
}
