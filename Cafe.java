/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    /* Overloaded constructor with name only */
    public Cafe(String name) {
        super(name); // Call default constructor
        this.name = name; // Override name
    }

    /* Overloaded constructor with name, address */
    public Cafe(String name, String address) {
        super(name, address); // Call full constructor
        this.name = name; // Override name
        this.address = address; // Override address
    }

    /* Full constructor */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams,
            int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }

    /**
     * If # of coffee ounces is 0 or # of sugar packs is 0 or # of creams is 0, then
     * restock them
     * Other side, give the remaining # of those products to us
     * 
     * @param size
     * @param nSugarPackets
     * @param nCreams
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces == 0 || this.nSugarPackets == 0 || this.nCreams == 0) {
            restock(size, nSugarPackets, nCreams, nCreams);
        } else {
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets;
            this.nCreams = this.nCreams - nCreams;
        }
    }

    /**
     * Restock method is to restock # cofee ounces, # of sugar packs, # of creams,
     * and # of cups
     * 
     * @param nCoffeeOunces
     * @param nSugarPackets
     * @param nCreams
     * @param nCups
     */
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println();
    }

    /** Print available options */
    public void showOptions() {
        System.out.println("Available options at " + this.name
                + ":\n + enter() \n + exit() \n + goUp() \n + goDown()\n + goToFloor(n)\n + sellCofee()\n + restock()");
    }

    /**
     * Create Cafe
     * 
     * @param args
     */
    public static void main(String[] args) {
        Cafe sakuraCafe = new Cafe("Sakura Cafe", "Elm Street", 3, 8, 10, 10, 10);
        sakuraCafe.showOptions();
        Cafe sakuraNewCafe = new Cafe("Sakura's new Cafe");
        System.out.println(sakuraNewCafe.name);
        Cafe sakuraSecondNewCafe = new Cafe("Sakura's new second Cafe", "Yokohama");
        System.out.println(sakuraSecondNewCafe.name + " " + "at" + " " + sakuraSecondNewCafe.address);
    }
}
