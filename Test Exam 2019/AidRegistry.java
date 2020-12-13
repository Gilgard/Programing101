import java.util.HashMap;
/**
* Class AidRegistry
* A class that has a map of all aids with ids as keys
*
* @author  Gilgard
* @version 1.0
* @since   2020.11.01 
*/
public class AidRegistry {
    HashMap<String, HearingAid> registry;

    /**
     * Construkts an AidRegistry with an empty map
     */
    public AidRegistry(){
        this.registry = new HashMap<>();
    }

    /**
     * Gets the registry
     * @return HashMap<String, HearingAid>
     */
    public HashMap<String, HearingAid> getRegistry() {
        HashMap<String, HearingAid> tempRegistry = new HashMap<>();
        for (String id : registry.keySet()) {
            tempRegistry.put(id, registry.get(id).copy());
        }
        return tempRegistry;
    }

    /** 
     * Adds a hearingaid to the registry as available
     * @param id : String (2002-123)
     * @param type : String
     * @return boolean
     */
    public boolean add(String id, String type) {
        if (!registry.containsKey(id)){
            registry.put(id,new HearingAid(id, type));
            return true;
        }
        return false;
    }

    
    /** 
     * Adds a hearingaid to the registry as rented to the given renter
     * @param id : String (2001-123)
     * @param type : String
     * @param renter : String
     * @return boolean
     */
    public boolean add(String id, String type, String renter) {
        if (!registry.containsKey(id)){
            registry.put(id,new HearingAid(id, type, renter));
            return true;
        }
        return false;
    }
    
    
    /** 
     * Removes a hearingaid given id
     * @param id : String (2001-123)
     * @return boolean
     */
    public boolean remove(String id) {
        if (registry.remove(id) != null) return true;
        return false;
    }

    
    /** 
     * Sets the status of an aid given id and availablity to rented to the given renter
     * @param id : String (2001-123)
     * @param renter : String
     * @return boolean
     */
    public boolean rent(String id, String renter) {
        if (registry.containsKey(id) && !registry.get(id).isRented()){
            registry.get(id).setRenter(renter);
            return true;
        }
        return false;
    }

    
    /** 
     * Returns an aid to available
     * @param id : String (2001-123)
     * @return boolean
     */
    public boolean returnAid(String id) {
        if (registry.containsKey(id) && registry.get(id).isRented()){
            registry.get(id).setRenter("ingen");;
            return true;
        }
        return false;
    }

    
    /** 
     * Makes a string of all available aid of the given type
     * @param type
     * @return String
     */
    public String findAid(String type) {
        String s = "Ledige " + type + ":\n";
        String empty = s;
        for (String id : registry.keySet()) {
            boolean sameType = registry.get(id).getType().toLowerCase().trim().equals(type.trim().toLowerCase());
            if(sameType && !registry.get(id).isRented()) {
                s += registry.get(id).toStringRegistry() + "\n";
            }
        }
        if (s.equals(empty)) s = "Fant ingen ledige hjelpemiddel av denne typen.";
        return s;
    }

    
    /** 
     * Makes a string showing all aids
     * @return String
     */
    public String toString() {
        String s = "Hjelpemiddelsentral:\n";
        for (String id : registry.keySet()) {
            s += registry.get(id).toStringRegistry() + "\n";
        }
        return s;
    }
}
