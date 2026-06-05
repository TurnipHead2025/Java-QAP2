//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2
 


public class TestCampusMap {
     public static void main(String args[]){
        CampusMap map1 = new CampusMap();

        MyRectangle scienceHall = new MyRectangle(new MyPoint(100,100), new MyPoint(200,200) );
        MyRectangle library = new MyRectangle(new MyPoint(300,100), new MyPoint(450, 250));

        map1.addBuilding(scienceHall);
        map1.addBuilding(library);
        
        MyCircle fountain = new MyCircle(50);
        map1.addFountain(fountain);

        map1.addWalkway(scienceHall, library);

        System.out.println("Total walkway length: " + map1.calculateWalkwayLength());
        System.out.println("Total fountain area: " + map1.calculateFountainArea());
        System.out.println("Walkway from scienceHall to library: " + map1.isWalkwayFromTo(scienceHall, library));


     }
}
