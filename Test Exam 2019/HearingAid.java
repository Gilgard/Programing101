/**
* Class HearingAid
* A class for defining aids that can be rented to people that are hard of hearing.
*
* @author  Gilgard
* @version 1.0
* @since   2020.11.01 
*/
public class HearingAid {
    private String id;
    private String type;
    private String renter;

    /**
     * Constructs a hearing aid with no current renter.
     * @param id : int (ex: 2001)
     * @param type : String
     */
    public HearingAid(String id, String type) {
        this.id = id;
        this.type = type;
        this.renter = "";
    }

    /**
     * Constructs a hearing aid with the given renter.
     * @param id : int (ex: 2001)
     * @param type : String
     * @param renter : String
     */
    public HearingAid(String id, String type, String renter) {
        this.id = id;
        this.type = type;
        this.renter = renter;
    }
    
    // implementing getters for all parameters, but setter only for renter so that the status of the aid can be altered


    /** 
     * Gets the id.
     * @return int
     */
    public String getId() {
        return this.id;
    }

    
    /** 
     * Gets the type.
     * @return String
     */
    public String getType() {
        return this.type;
    }

    
    /** 
     * Gets the rent status of the aid.
     * @return boolean
     */
    public boolean isRented() {
        return !renter.equals("");
    }

    
    /** 
     * Gets the name of the renter, if not rented name will be "Ingen".
     * @return String
     */
    public String getRenter() {
        return this.renter;
    }

    
    /** 
     * Sets the renters name and the rented status. If input name is "" the status will be set to false.
     * @param renter
     */
    public void setRenter(String renter) {
        this.renter = renter;
    }

    
    /** 
     * Checks if the object equals this hearing aid.
     * @param obj
     * @return boolean
     */
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof HearingAid)) return false;
        HearingAid hearingAid = (HearingAid) obj;
        return this.getId().equals(hearingAid.getId());
    }

    
    /** 
     * Copies this hearing aid.
     * @return HearingAid
     */
    public HearingAid copy() {
        return new HearingAid(id, type, renter);
    }

    /** 
     * Makes a string for printing aids in the registry
     * @return String
     */
    public String toStringRegistry(){
        if(isRented()) {
            return id + " " + type + " utleid til: " + renter;
        }
        return id + " " + type + " ledig";
    }
    
    /** 
     * Makes a string with all the variables.
     * @return String
     */
    public String toString() {
        String yesno = "NEI";
        if(isRented()) yesno = "JA";
        return "ID: " + id + " Type: " + type + " Utleid: " + yesno + " Utleid til: " + renter; 
    }
}
