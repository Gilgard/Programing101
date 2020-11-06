import java.util.ArrayList;

public class MunicipalRegistry {
    private ArrayList<Lot> lots;

    public MunicipalRegistry() {
        this.lots = new ArrayList<>();
    }
    
    public void add(int municipalityNumber, int lotNumber, int sectionNumber, String name, double squarefootage, String owner) {
        Lot lot = new Lot(municipalityNumber, lotNumber, sectionNumber, name, squarefootage, owner);
        if(!lots.contains(lot)) lots.add(lot);
    }

    public void remove(String id) {
        for (Lot lot : lots) {
            if (lot.getID().equals(id)) lots.remove(lot);
        }
    }

    public ArrayList<Lot> getLots() {
        ArrayList<Lot> tempLots = new ArrayList<>();
        for(Lot lot : lots) {
            tempLots.add(lot.clone());
        }
        return tempLots;
    }

    public int getNumberofLots() {
        return lots.size();
    }

    public Lot getLot(String id) {
        for (Lot lot : lots) {
            if (lot.getID().equals(id)) return lot.clone();
        }
        return null;
    }

    public double getAverageArea() {
        double sum = 0;
        for (Lot lot : lots) sum += lot.getSquarefootage();
        return sum / lots.size();
    }

    public ArrayList<Lot> getLotNumber(int lotNumber) {
        ArrayList<Lot> tempLots = new ArrayList<>();
        for(Lot lot : lots) {
            if (lot.getLotNumber() == lotNumber) tempLots.add(lot);
        }
        return tempLots;
    }

    public String toString() {
        String s = "Tomter: ";
        for (Lot lot : lots) s += "\n\n" + lot.toString();
        return s;
    }   
}
