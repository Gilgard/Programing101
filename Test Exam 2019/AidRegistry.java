import java.util.HashMap;

public class AidRegistry {
    HashMap<String, HearingAid> registry;

    public AidRegistry(){
        this.registry = new HashMap<>();
    }

    
    /** 
     * @param id
     * @param type
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
     * @param id
     * @param type
     * @param renter
     * @return boolean
     */
    public boolean add(String id, String type, String renter) {
        if (!registry.containsKey(id)){
            registry.put(id,new HearingAid(type, renter));
            return true;
        }
        return false;
    }
    
    
    /** 
     * @param id
     * @return boolean
     */
    public boolean remove(String id) {
        if (registry.remove(id) != null) return true;
        return false;
    }

    
    /** 
     * @param id
     * @param renter
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
     * @param id
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
     * @param type
     * @return String
     */
    public String findAid(String type) {
        String s = "Ledige " + type + ":\n";
        for (String id : registry.keySet()) {
            if(registry.get(id).getType().toLowerCase().equals(type.toLowerCase()) && !registry.get(id).isRented()) {
                s += registry.get(id).toString() + "\n";
            }
        }
        return s;
    }

    
    /** 
     * @return String
     */
    public String toString() {
        String s = "Hjelpemiddelsentral:\n";
        for (String id : registry.keySet()) {
            s += registry.get(id).toString() + "\n";
        }
        return s;
    }
}
