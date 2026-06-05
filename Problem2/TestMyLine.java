//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2



public class TestMyLine {
    public static void main(String args[]){
        MyPoint p1 = new MyPoint(2, 4);
        MyPoint p2= new MyPoint(3, 6);
        MyLine line1= new MyLine(p1, p2);

        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println();

        System.out.println("Gradient: " + line1.getGradient());
        System.out.println();

        System.out.println(line1.getBegin());
        System.out.println(line1.getEnd());
        System.out.println();

        System.out.println(line1.getBeginX());
        System.out.println(line1.getBeginY());
        System.out.println();

        System.out.println(line1.getEndX());
        System.out.println(line1.getEndY());
        System.out.println();

        MyPoint p3= new MyPoint(10,20);
        line1.setBegin(p3);
        System.out.println("New begin points: " + line1);
        System.out.println();

        MyPoint p4 =new MyPoint(20,30);
        line1.setEnd(p4);
        System.out.println("New end points: " + line1);
        System.out.println();

        //void doesn't return anything so you can't print directly. Must set the new value first
        line1.setBeginX(18);
        System.out.println("New beginX: " + line1);
        System.out.println();

        line1.setBeginY(21);
        System.out.println("New beginY: " + line1);
        System.out.println();

        line1.setEndX(12);
        System.out.println("New EndX: " + line1);
        System.out.println();

        line1.setEndY(14);
        System.out.println("New EndY: " + line1);
        System.out.println();

        line1.setBeginXY(45,51);
        System.out.println("NewBeginXY: " + line1);
        System.out.println();

        line1.setEndXY(45,51);
        System.out.println("NewEndXY: " + line1);
        System.out.println();






    }
}
