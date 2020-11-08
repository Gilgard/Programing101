import java.util.ArrayList;

/**
* Class MunicipalRegistry
*
* @author  Gilgard
* @version 1.0
* @since   2020.11.01 
*/
public class MunicipalRegistry {
    private ArrayList<Lot> lots;

    /**
     * Constructs the registry with an empty arraylist
     */
    public MunicipalRegistry() {
        this.lots = new ArrayList<>();
    }
    
    
    /** 
     * Creates a lot with the given parameteres and adds it to the registry
     * @param municipalityNumber : int
     * @param lotNumber : int
     * @param sectionNumber : int
     * @param name : String
     * @param squarefootage : double
     * @param owner : String
     */
    public void add(int municipalityNumber, int lotNumber, int sectionNumber, String name, double squarefootage, String owner) {
        Lot lot = new Lot(municipalityNumber, lotNumber, sectionNumber, name, squarefootage, owner);
        if(!lots.contains(lot)) lots.add(lot);
    }

    
    /** 
     * Removes a lot from the registry given the id
     * @param id : String
     */
    public void remove(String id) {
        for (Lot lot : lots) {
            if (lot.getID().equals(id)) lots.remove(lot);
        }
    }

    
    /** 
     * Gets the list of lots
     * @return ArrayList<Lot>
     */
    public ArrayList<Lot> getLots() {
        ArrayList<Lot> tempLots = new ArrayList<>();
        for(Lot lot : lots) {
            tempLots.add(lot.clone());
        }
        return tempLots;
    }

    
    /** 
     * Finds the number of lots in the registry
     * @return int
     */
    public int getNumberofLots() {
        return lots.size();
    }

    
    /** 
     * Find a lot given the id (municipalityNumber-lotNumber/sectionNumber)
     * @param id
     * @return Lot
     */
    public Lot getLot(String id) {
        for (Lot lot : lots) {
            if (lot.getID().equals(id)) return lot.clone();
        }
        return null;
    }

    
    /** 
     * Calculates the average area of the lots
     * @return double
     */
    public double getAverageArea() {
        double sum = 0;
        for (Lot lot : lots) {
            sum += lot.getSquarefootage();
        }
        return sum / getNumberofLots();
    }

    
    /** 
     * Makes a list of all lots with the given lot number
     * @param lotNumber : int
     * @return ArrayList<Lot>
     */
    public ArrayList<Lot> getLotNumber(int lotNumber) {
        ArrayList<Lot> tempLots = new ArrayList<>();
        for(Lot lot : lots) {
            if (lot.getLotNumber() == lotNumber) {
                tempLots.add(lot.clone());
            }
        }
        return tempLots;
    }

    
    /** 
     * Makes a string of all lots in the registry
     * @return String
     */
    public String toString() {
        String s = "Tomter: ";
        for (Lot lot : lots) s += "\n\n" + lot.toString();
        return s;
    }
}
