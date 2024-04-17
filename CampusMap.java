import java.util.ArrayList;

public class CampusMap {

    ArrayList<Building> buildings;

    /* Default constructor, initializes empty ArrayList */
    public CampusMap() {
        buildings = new ArrayList<Building>();
    }

    /**
     * Adds a Building to the map
     * @param b the Building to add
     */
    public void addBuilding(Building b) {
        System.out.println("Adding building...");           
        buildings.add(b);
        System.out.println("-->Successfully added " + b.getName() + " to the map.");
    }

    /**
     * Removes a Building from the map
     * @param b the Building to remove
     * @return the removed Building
     */
    public Building removeBuilding(Building b) {
        System.out.println("Removing building..."); 
        buildings.remove(b);
        System.out.println("-->Successfully removed " + b.getName() + " to the map.");
        return b;
    }

    public String toString() {
        String mapString = "DIRECTORY of BUILDINGS";

        for (int i = 0; i < this.buildings.size(); i ++) {
            mapString += "\n  " + (i+1) + ". "+ this.buildings.get(i).getName() + " (" + this.buildings.get(i).getAddress() + ")";
        }
        return mapString;
    }

    public static void main(String[] args) {
        CampusMap myMap = new CampusMap();
        myMap.addBuilding(new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4));

        myMap.addBuilding(new Building("Bass Hall", "4 Tyler Court Northampton, MA 01063", 4));

        House chase = new House("Chase House", "Elm Street 110 Northampton, MA 01063", 3);
        myMap.addBuilding(chase);
        chase.enter();

        House albright = new House("Albright House ", "Elm Street 100 Northampton, MA 01063", 3);
        myMap.addBuilding(albright);
        albright.enter();
        albright.goUp();

        Library neilson = new Library("Neilson Library", "5 Tyler Court Northampton, MA 01063", 4,true);
        myMap.addBuilding(neilson);
        neilson.enter();
        neilson.goToFloor(1);

        House cushing = new House("Cushing", "Elm Street 87 Northampton, MA 01063", 2);
        myMap.addBuilding(cushing);
        cushing.enter();
        cushing.goToFloor(2);
        cushing.goDown(); 

        Cafe campusCafe = new Cafe("Campus Cafe", "Elm Street 100, MA 01063");
        myMap.addBuilding(campusCafe);
        campusCafe.enter();

        Cafe neilsonLibraryCafe = new Cafe("Neilson Library Cafe", "Elm Street 45 Northampton, MA 01063");
        neilsonLibraryCafe.sellCoffee(100,100,100);
        myMap.addBuilding(neilsonLibraryCafe);
        neilsonLibraryCafe.enter();

        Library hillyer = new Library("Hillyer Library", "Elm Street 10 Northampton, MA 01063",2,true);
        hillyer.enter();
        hillyer.addTitle("Northamptno's History");
        hillyer.printCollection();
        myMap.addBuilding(hillyer);

        House lamount = new House("Lamount House","Elm Street 60 Northampton, MA 01063", 3, true, true);
        lamount.moveIn("Sakura");
        myMap.addBuilding(lamount);
        lamount.enter();

        Library jostenPerformingArtsLibrary = new Library("Josten Performing Arts Library","Mendenhall Center, 122 Green St",2, true);
        jostenPerformingArtsLibrary.addTitle("Smith's History");
        myMap.addBuilding(jostenPerformingArtsLibrary);
        jostenPerformingArtsLibrary.enter();

        House dawsHouse = new House("Daws House", "Elm Street 92 Northampton, MA 01063", 2, true, false);
        dawsHouse.isResident("Nicole");
        myMap.addBuilding(dawsHouse);
        dawsHouse.enter();

        System.out.println(myMap);
    }
    
}
