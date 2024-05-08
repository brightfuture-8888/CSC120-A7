import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {
  private Hashtable<String, Boolean> collection;
  private boolean elevators;
  private int entranceFee;
  private int wifiCost;

  /* Overloaded constructor with name, entranceFee */
  public Library(String name, int entranceFee) {
    super(name); // Call full constructor
    this.collection = new Hashtable<String, Boolean>();
    this.name = name; // Override name
    this.entranceFee = 0; // Override entranceFee
  }

  /* Overloaded constructor with entrance fee and wifi cost only */
  public Library(int entranceFee, int wifiCost) {
    this.collection = new Hashtable<String, Boolean>();
    this.entranceFee = 10; // Override entranceFee
    this.wifiCost = 5; // Override wifiCost
  }

  /**
   * Creates a library with name, an address, and # of floors
   * 
   * @param name
   * @param address
   * @param nFloors
   */
  public Library(String name, String address, int nFloors, boolean elevators) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    this.elevators = elevators;
    System.out.println(" Your library is called " + name + ", located in " + address + " with " + nFloors + " floors.");
  }

  /**
   * Update the Hashtable containing the collection every time we add a title
   * 
   * @param title
   */
  public void addTitle(String title) {
    if (this.collection.size() > 0) {
      if (this.collection.contains(title)) {
        throw new RuntimeException(title + " is already in " + title);
      } else {
        System.out.print("Adding " + title + " in " + title + "...");
        this.collection.put(title, true);
        System.out.println("Success!");
      }
    }
  }

  /**
   * Updates Hashtable containing collection everytime a book is removed after
   * checking
   * 
   * @param title
   * @return Book removed
   */
  public String removeTitle(String title) {
    if (collection.contains(title)) {
      this.collection.remove(title);
      return "This book has been removed from the library.";
    } else {
      return "There is no such book that you're looking for!";
    }
  }

  /**
   * Check Hashtable containing collection if a book has been checked out or not
   */
  public void checkOut(String title) {
    if (this.collection.contains(title)) {
      this.collection.replace(title, false);
    }
  }

  /**
   * Check Hashtable containing collection if a book has been returned
   * 
   * @param title
   */
  public void returnBook(String title) {
    this.collection.replace(title, true);
  }

  /**
   * Check Hashtable if a collection contains a book
   * 
   * @param title
   * @return
   */
  public boolean containsTitle(String title) {
    return (this.collection.contains(title));
  }

  /**
   * Check Hashtable containing collection if a book is available
   */
  public boolean isAvailable(String title) {
    return (this.collection.get(title));
  }

  /**
   * Print Collection
   * 
   * @param title
   */
  public void printCollection() {
    System.out.println(this.collection.toString());
  }

  /**
   * Create Library
   * 
   * @param args
   */
  public static void main(String[] args) {
    Library myLibrary = new Library("Sakura Library", "78 Shinjuku , Tokyo", 5, true);
    System.out.println(myLibrary);
    Library mySecondLibrary = new Library("Sakura's second Library", 60);
    System.out.println(mySecondLibrary.name + " " + "has an entrance fee of" + " " + "$" + mySecondLibrary.entranceFee);
    Library myThirdLibrary = new Library(10, 40);
    System.out.println("Sakura's third library has $" + myThirdLibrary.entranceFee + " " + "of an entrance fee" + " "
        + "and the wifi there costs" + " " + "$" + myThirdLibrary.wifiCost);
    myLibrary.addTitle("History of CS");
    myLibrary.printCollection();
  }

  /* print available options of the library with methods */
  public void showOptions() {
    super.showOptions();
    System.out.println("Available options at " + this.name
        + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + addTitle\n +removeTitle()\n + checkOut()\n + returnBook()\n + containsTitle()\n + isAvailable()\n + printCollection()");
  }

  /*
   * If a library has an elevator,go to the floor number that is put
   * If not, print "You can't go to the floor"
   */
  public void goToFloor(int floorNum) {
    if (this.elevators = true) {
      super.goToFloor(floorNum);
    } else {
      System.out.println("You can't go to the floor");
    }
  }
}