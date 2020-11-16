/**
* Class HearingAid
* A class for defining aids that can be rented to people that are hard of hearing.
*
* @author  Gilgard
* @version 1.0
* @since   2020.11.01 
*/
public class HearingAid {
    private int id;
    private String type;
    private boolean rented;
    private String renter;

    /**
     * Constructs a hearing aid with no current renter.
     * @param id : int (ex: 2001)
     * @param type : String
     */
    public HearingAid(int id, String type) {
        this.id = id;
        this.type = type;
        this.rented = false;
        this.renter = "Ingen";
    }

    /**
     * Constructs a hearing aid with the given renter.
     * @param id : int (ex: 2001)
     * @param type : String
     * @param renter : String
     */
    public HearingAid(int id, String type, String renter) {
        this.id = id;
        this.type = type;
        this.rented = true;
        this.renter = renter;
    }
    
    
    /** 
     * Gets the id.
     * @return int
     */
    public int getId() {
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
        return this.rented;
    }

    
    /** 
     * Gets the name of the renter, if not rented name will be "Ingen".
     * @return String
     */
    public String getRenter() {
        return this.renter;
    }

    
    /** 
     * Sets the renters name and the rented status. If input name is "ingen" (capital letters does not matter) the status will be set to false.
     * @param renter
     */
    public void setRenter(String renter) {
        if(renter.toLowerCase().equals("ingen")) {
            this.rented = false;
        }else{
            this.rented = true;
        }
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
        return this.getId() == hearingAid.getId();
    }

    
    /** 
     * Copies this hearing aid.
     * @return HearingAid
     */
    public HearingAid copy() {
        if(!rented) return new HearingAid(id, type);
        return new HearingAid(id, type, renter);
    }

    
    /** 
     * Makes a string with all the variables.
     * @return String
     */
    public String toString() {
        String yesno = "NEI";
        if(rented) yesno = "JA";
        return "ID: " + id + " Type: " + type + " Utleid: " + yesno + " Utleid til: " + renter; 
    }
}
