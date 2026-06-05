//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2

public class TestMyRectangle {
     public static void main(String args[]){

        MyPoint p1 = new MyPoint(2, 4);
        MyPoint p2= new MyPoint(3, 6);
        MyRectangle rec1= new MyRectangle(p1, p2);

        System.out.println(rec1);
        System.out.println();

        System.out.println("topLeft= " + rec1.getTopLeft());
        System.out.println("bottomRight= " + rec1.getBottomRight());
        System.out.println();

        MyPoint p3= new MyPoint(6,10);
        rec1.setTopLeft(p3);
        System.out.println("New topLeft= " + rec1);
        System.out.println();

        MyPoint p4= new MyPoint(12,16);
        rec1.setBottomRight(p4);
        System.out.println("New bottomRight= " + rec1);
        System.out.println();

        System.out.println("Getwidth= " + rec1.getWidth());
        System.out.println("GetHeight= " + rec1.getHeight());
        System.out.println("GetArea= " + rec1.getArea());
        System.out.println("GetPerimeter= " + rec1.getPerimeter());
     }
    
}
