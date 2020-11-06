import java.io.File;
import java.util.Scanner;

public class Lot {
    private int municipalityNumber;
    private String municipalityName;
    private int lotNumber;
    private int sectionNumber;
    private String name;
    private double squarefootage;
    private String owner;

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

    public int getMunicipalityNumber() {
        return this.municipalityNumber;
    }

    public String getMunicipalityName() {
        return this.municipalityName;
    }

    public int getLotNumber() {
        return this.lotNumber;
    }

    public int getSectionNumber() {
        return this.sectionNumber;
    }

    public String getName() {
        return this.name;
    }

    public double getSquarefootage() {
        return this.squarefootage;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getID() {
        return municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
    }

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

    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Lot)) return false;
        Lot lot = (Lot) obj;
        return this.getID().equals(lot.getID());
    }

    public Lot clone() {
        return new Lot(municipalityNumber, lotNumber, sectionNumber, name, squarefootage, owner);
    }

    public String toString() {
        String s = municipalityName + ": " + municipalityNumber + "-" + lotNumber + "/" + sectionNumber;
        if (!name.equals("")) s += "\nNavn: " + name;
        s += "\nAreal: " + squarefootage + "\nEier: " + owner;
        return s;
    }
}
