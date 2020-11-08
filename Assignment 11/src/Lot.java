import java.io.File;
import java.util.Scanner;

/**
* Class Lot
*
* @author  Gilgard
* @version 1.0
* @since   2020.11.01 
*/
public class Lot {
    private int municipalityNumber;
    private String municipalityName;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private double squarefootage;
    private String owner;

    /**
     * Constructs a lot with the given parameters
     * @param municipalityNumber : int
     * @param lotNumber : int
     * @param sectionNumber : int
     * @param name : String
     * @param squarefootage : double
     * @param owner : String
     */
    public Lot(int municipalityNumber, int lotNumber, int sectionNumber, String name, double squarefootage, String owner){
        if ((municipalityNumber <= 0) || (lotNumber <= 0) || (sectionNumber <= 0) || (squarefootage <= 0)) throw new IllegalArgumentException("municipalityNumber, lot/sectionNumber and squarefootage must be positive.");
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = findMunicipalityName(municipalityNumber);
        if (this.municipalityName.equals("Municipality not found.")) throw new IllegalArgumentException("Invalid municipality number.");
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.squarefootage = squarefootage;
        this.owner = owner;
    }

    
    /** 
     * Gets the municipality number
     * @return int
     */
    public int getMunicipalityNumber() {
        return this.municipalityNumber;
    }

    
    /** 
     * Gets the municipality name
     * @return String
     */
    public String getMunicipalityName() {
        return this.municipalityName;
    }

    
    /** 
     * Gets the lot number (gnr)
     * @return int
     */
    public int getLotNumber() {
        return this.lotNumber;
    }

    
    /** 
     * Gets the section number (bnr)
     * @return int
     */
    public int getSectionNumber() {
        return this.sectionNumber;
    }

    
    /** 
     * Gets the name
     * @return String
     */
    public String getName() {
        return this.name;
    }

    
    /** 
     * Gets the square footage
     * @return double
     */
    public double getSquarefootage() {
        return this.squarefootage;
    }

    
    /** 
     * Gets the name of the owner
     * @return String
     */
    public String getOwner() {
        return this.owner;
    }

    
    /** 
     * Gets the id (kommunenr-gnr/bnr)
     * @return String
     */
    public String getID() {
        return municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    }

    
    /** 
     * Reads the name of the municipality from the list of municipalities found in the lib folder
     * @param municipalityNumber : int
     * @return String
     */
    private String findMunicipalityName(int municipalityNumber) {
        try{
            File file = new File("C:\\Users\\Alida\\Documents\\GitHub\\Programing101\\Assignment 11\\lib\\MunicipalList.txt");
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                String[] numNname = sc.nextLine().split(" ", 2);
                if(Integer.parseInt(numNname[0]) == municipalityNumber) {
                    sc.close();
                    return numNname[1];
                }
            }
            sc.close();
            return "Municipality not found.";
        }catch(Exception ex) {
            ex.printStackTrace();
        }
        return "Municipality not found.";
    }

    
    /** 
     * Checks if the given object is the same as this lot
     * @param obj : Object
     * @return boolean
     */
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Lot)) return false;
        Lot lot = (Lot) obj;
        return this.getID().equals(lot.getID());
    }

    
    /** 
     * Makes a clone of this lot
     * @return Lot
     */
    public Lot clone() {
        return new Lot(municipalityNumber, lotNumber, sectionNumber, name, squarefootage, owner);
    }

    
    /** 
     * Makes a string of all paramers of this lot
     * @return String
     */
    public String toString() {
        String s = municipalityName + ": " + municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
        if (!name.equals("")) s += "\nNavn: " + name;
        s += "\nAreal: " + squarefootage + "\nEier: " + owner;
        return s;
    }
}
