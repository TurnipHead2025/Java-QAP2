//Sheri Evangelene
// June 1- 5 2026
//Java QAP 2

import java.util.ArrayList;

public class CampusMap {
    ArrayList<MyRectangle> buildings;   //ArrayList fields
    ArrayList<MyLine> walkways;
    ArrayList<MyCircle> fountains;


//constructors

    public CampusMap(){
        buildings = new ArrayList<>();
        walkways = new ArrayList<>();
        fountains = new ArrayList<>();
    }

//methods

    public void addBuilding (MyRectangle building){
        buildings.add(building);
    }

    public void addFountain(MyCircle fountain){
        fountains.add(fountain);
    }

    
    public double calculateWalkwayLength(){
        double total = 0;
        for (int i = 0; i < walkways.size(); i++){
            total += walkways.get(i).getLength();
        }
        return total;
    } 

    public double calculateFountainArea(){
        double total= 0;
        for (int i = 0; i < fountains.size(); i++){        
        total += fountains.get(i).getArea();
    }
    return total;
 }

    // Takes two buildings from the buildings list. Validates that they are objs contained in the list. then finds their centers. Creates a line between those two center points and adds it to the walkways list.  

    public void addWalkway(MyRectangle from, MyRectangle to){
        if (!buildings.contains(from) || !buildings.contains(to)){
            System.out.println("Error: one or both buildings not found.");
            return;
        }    
        int fromCenterX = from.getTopLeft().getX() + from.getWidth() / 2; 
        int fromCenterY = from.getTopLeft().getY() + from.getHeight() / 2; 
        int toCenterX = to.getTopLeft().getX() + to.getWidth() /2;
        int toCenterY = to.getTopLeft().getY() + to.getHeight() /2;
        MyLine walkway = new MyLine(fromCenterX, fromCenterY, toCenterX, toCenterY);
        walkways.add(walkway);        
    }

    // Checks if a walkway already exists between two buildings. Finds the center of each building, then loops through the walkways list to see if any line connects those two centers. Returns true if found, false if not.
    public boolean isWalkwayFromTo(MyRectangle fromBuilding, MyRectangle toBuilding){
        int fromCenterX = fromBuilding.getTopLeft().getX() + fromBuilding.getWidth() / 2;
        int fromCenterY = fromBuilding.getTopLeft().getY() + fromBuilding.getHeight() / 2;
        int toCenterX = toBuilding.getTopLeft().getX() + toBuilding.getWidth() / 2;
        int toCenterY = toBuilding.getTopLeft().getY() + toBuilding.getHeight() / 2; 

        for (int i = 0; i < walkways.size(); i++){
            MyLine w = walkways.get(i);
            if (w.getBeginX() ==  fromCenterX && w.getBeginY() == fromCenterY && w.getEndX() == toCenterX && w.getEndY() == toCenterY){
                return true;
            }
        }
        return false;
    }


}
