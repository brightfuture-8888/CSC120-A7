import java.util.Hashtable;

/* This is a stub for the Library class */
public class Library extends Building {
  private Hashtable<String, Boolean> collection;

  /**
   * Creates a library with name, an address, and # of floors
   * 
   * @param name
   * @param address
   * @param nFloors
   */

  public Library(String name, String address, int nFloors) {
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
    System.out.println(" Your library is called " + name + ", located in " + address + " with " + nFloors + " floors.");
  }

  /**
   * Update the Hashtable containing the collection every time we add a title
   * 
   * @param title
   */
  public void addTitle(String title) {
    if (this.collection.contains(title)) {
      throw new RuntimeException(title + " is already in " + title);
    } else {
      System.out.print("Adding " + title + " in " + title + "...");
      this.collection.put(title, true);
      System.out.println("Success!");
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
  public void printCollection(String title) {
    this.collection.toString();
  }

  public static void main(String[] args) {
    Library myLibrary = new Library("Sakura Library", "78 Shinjuku, Tokyo,", 5);
    System.out.println(myLibrary);
  }

  public void showOptions() {
        System.out.println("Available options at " + this.name + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + addTitle\n +removeTitle()\n + checkOut()\n + returnBook()\n + containsTitle()\n + isAvailable()\n + printCollection()");
    }
}