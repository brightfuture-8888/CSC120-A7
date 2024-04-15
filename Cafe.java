/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces; 
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
       super(name, address, nFloors);
       this.nCoffeeOunces = nCoffeeOunces;
       this.nSugarPackets = nSugarPackets;
       this.nCreams = nCreams;
       this.nCups = nCups;
    }
    
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if(this.nCoffeeOunces == 0 || this.nSugarPackets == 0 || this.nCreams ==0){
            restock(size, nSugarPackets, nCreams, nCreams); 
        }else{
            this.nCoffeeOunces = this.nCoffeeOunces - size;
            this.nSugarPackets = this.nSugarPackets - nSugarPackets; 
            this.nCreams = this.nCreams - nCreams; 
        }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        }
    }


