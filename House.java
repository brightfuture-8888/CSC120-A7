import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building{
  private ArrayList<String> residents;
  private boolean hasDiningRoom; 

  /**
   * Creates a house with name, the address, the number of floors, and if it has a dining room or not
   * @param name
   * @param address
   * @param nFloors
   * @param hasDiningRoom
   */

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name,address,nFloors); 
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;    
  }

    /**
   * Returns whether or not the house has a dining room  
   * @return this.hasDining (Dining room: true or false) 
   */
    public boolean hasDiningRoom() {
      return this.hasDiningRoom;
    }

    /**
   * Returns # of residents
   * @return this.residents.size 
   */
    public int nResidents() {                  
      return this.residents.size();
    }
    
    /**
     * return if a person is a resident of the house 
     * @param name
     * @return
     */
    public boolean isResident(String name) {
      return this.residents.contains(name);
    }

    /**
     * Check if a resident is moved in to the house 
     * If a resident is not moved in the house, their name will be added as a residence 
     * @param name
     */
    public void moveIn(String name){
      if (this.residents.contains(name)) {
        throw new RuntimeException(name + " is already enrolled at " + this.name);
      }else{System.out.print("Enrolling " + name + " at " + this.name + "..."); 
      this.residents.add(name); 
      System.out.println(" Success!"); 
        } 
    }

    public String moveOut(String name){ 
      if (!this.residents.contains(name)) {
        return(name + " is not enrolled at " + this.name);
      }else{System.out.print(name + " is leaving " + this.name + "...");
    this.residents.remove(name);
    System.out.println("Bye!");
    return name;
      }
    }
    
    public static void main(String[] args) {
      House myHouse = new House("Sakura's amazing house", "Tokyo", 5, true);
      System.out.println(myHouse);
    }
  }
  