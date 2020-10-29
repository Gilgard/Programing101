/**
* Class Event 
*
* @author  Gilgard
* @version 1.0
* @since   2020.10.22 
*/
public class Event{
    private int id;
    private String name;
    private String type;
    private String location;
    private int time;
    private String host;

    /**
    * Constructor
    * @param id
    * @param name
    * @param type
    * @param location
    * @param time
    * @param host
    */
    public Event(int id, String name, String type, String location, int time, String host){
        this.id = id;
        this.name = name;
        this.type = type;
        this.location = location;
        this.time = time;
        this.host = host;
    }

    /**
    * Constructor
    * @param name
    * @param type
    * @param location
    * @param time
    * @param host
    */
    public Event(String name, String type, String location, int time, String host){
        this.id = 0;
        this.name = name;
        this.type = type;
        this.location = location;
        this.time = time;
        this.host = host;
    }
    
    /** 
     * Gets id
     * @return int
     */
    public int getId() {
        return id;
    }

    
    /** 
     * Gets name
     * @return String
     */
    public String getName() {
        return name;
    }

    
    /** 
     * Gets type
     * @return String
     */
    public String getType() {
        return type;
    }

    
    /** 
     * Gets location
     * @return String
     */
    public String getLocation() {
        return location;
    }

    
    /**
     * Gets time 
     * @return int
     */
    public int getTime() {
        return time;
    }

    
    /** 
     * Gets host
     * @return String
     */
    public String getHost() {
        return host;
    }

    
    /** 
     * Checks if object equals this event by checking if they have the same id
     * @param obj
     * @return boolean
     */
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof Event)) return false;
        Event event = (Event) obj;
        return this.getId() == event.getId();
    }


    
    /** 
     * Makes a string with all the parameters
     * @return String
     */
    public String toString() {
        String s = "ID: " + id + " Name: " + name + " Type: " + type + " Location: " + location + " Time: " + time + " Host: " + host;
        return s;
    }
    
} 