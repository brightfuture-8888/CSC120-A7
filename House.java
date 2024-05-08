import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  private boolean elevators;

  /* Overloaded constructor with name, address */
  public House(String name, String address) {
    super(name, address); // Call full constructor
    this.name = name; // Override name
    this.address = address; // Override address
  }

  /* Overloaded constructor with name, address, nFloors only */
  public House(String name, String address, int nFloors) {
    super(name, address, nFloors); // Call default constructor
    this.name = name; // Override name
    this.address = address; // Override address
    this.nFloors = nFloors; // Override nFloors
  }

  /**
   * Creates a house with name, the address, the number of floors, and if it has a
   * dining room or not
   * 
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */

  public House(String name, String address, int nFloors, boolean hasDiningRoom, boolean elevators) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    this.elevators = elevators;
  }

  /**
   * Returns whether or not the house has a dining room
   * 
   * @return this.hasDining (Dining room: true or false)
   */
  public boolean hasDiningRoom() {
    return this.hasDiningRoom;
  }

  /**
   * Returns # of residents
   * 
   * @return this.residents.size
   */
  public int nResidents() {
    return this.residents.size();
  }

  /**
   * return if a person is a resident of the house
   * 
   * @param name
   * @return
   */
  public boolean isResident(String name) {
    return this.residents.contains(name);
  }

  /**
   * Check if a resident is moved in to the house
   * If a resident is not moved in the house, their name will be added as a
   * residence
   * 
   * @param name
   */
  public void moveIn(String name) {
    if (this.residents.contains(name)) {
      throw new RuntimeException(name + " is already enrolled at " + this.name);
    } else {
      System.out.print("Enrolling " + name + " at " + this.name + "...");
      this.residents.add(name);
      System.out.println(" Success!");
    }
  }

  /**
   * Check if a resident is moved out from the house
   * If a resident is not moved in the house, their name will be removed
   * 
   * @param name
   * @return
   */
  public String moveOut(String name) {
    if (!this.residents.contains(name)) {
      return (name + " is not enrolled at " + this.name);
    } else {
      System.out.print(name + " is leaving " + this.name + "...");
      this.residents.remove(name);
      System.out.println("Bye!");
      return name;
    }
  }

  /**
   * Creates a library
   * 
   * @param args
   */
  public static void main(String[] args) {
    House myHouse = new House("Sakura's amazing house", "Tokyo", 5, true, true);
    System.out.println(myHouse);
    House mySecondHouse = new House("Sakura's second house", "Northampton");
    System.out.println(mySecondHouse.name + " " + "is located at" + " " + mySecondHouse.address);
    House myThirdHouse = new House("Sakura's summer house", "Dubai", 7);
    System.out.println(myThirdHouse.name + " " + "is located at " + myThirdHouse.address + " " + "with" + " "
        + myThirdHouse.nFloors + " " + "floors");
  }

  /**
   * Print available options
   */
  public void showOptions() {
    super.showOptions();
    System.out.println(
        "Available options at " + this.name
            + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + hasDiningRoom()\n + nResidents()\n + isResident()\n + moveIn()\n + moveOut()");
  }

  /**
   * If there is an elevator in this house, go to the floor number that is put
   * If not, print "You can't go to the floor"
   */
  public void goToFloor(int floorNum) { 
    if (this.elevators == true) {
      super.goToFloor(floorNum);
    } else {
      System.out.println("You can't go to the floor. If you don't have an elevator going up or down, use goUp() or goDown() method");
    }
  }
}
