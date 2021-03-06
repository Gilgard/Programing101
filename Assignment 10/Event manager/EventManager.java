import java.util.ArrayList;
import java.util.Collections;

/**
* Class EventManager 
*
* @author  Gilgard
* @version 1.0
* @since   2020.10.22 
*/
public class EventManager {
    private ArrayList<Event> eventList;

    /**
    * Constructs an EventManager with an empty eventlist
    */
    public EventManager() {
        this.eventList = new ArrayList<>();
    }
    
    /** 
     * Gets copy of eventlist
     * @return ArrayList<Event>
     */
    public ArrayList<Event> getEventList() {
        ArrayList<Event> tempList = new ArrayList<>();
        for (int i = 0; i < eventList.size(); i++) {
            tempList.add(eventList.get(i).clone());
        }
        return tempList;
    }

    /** 
     * Adds event to eventlist if the time and location is available
     * @param event : Event
     * @return boolean
     */  
    public boolean add(Event event) {
        for (int i = 0; i < eventList.size(); i++) {
            if ((eventList.get(i).getTime() == event.getTime())
                    && eventList.get(i).getLocation().compareTo(event.getLocation()) == 0) {
                System.out.println("There's already an event at that time and place!");
                return false;
            }
        }
        if(eventList.contains(event)) {
            System.out.println("There's already an event with that id!");
            return false;
        }
        eventList.add(event);
        return true;
    }
    
    /** 
     * Finds an unused id
     * @return int
     */
    public int getNewID() {
        int testID = 0;
        for(Event event : eventList) {
            if(event.getId() == testID){
                testID += 1;
            }
        }
        return testID;
    }
    
    /** 
     * Gets a list of all events at a given location
     * @param location : String
     * @return ArrayList<Event>
     */
    public ArrayList<Event> getAtLocation(String location) {
        ArrayList<Event> locationList = new ArrayList<>();
        for (int i = 0; i < eventList.size(); i++) {
            if (eventList.get(i).getLocation().compareTo(location) == 0) {
                locationList.add(eventList.get(i).clone());
            }
        }
        return locationList;
    }

    
    /** 
     * Gets a list of all events on a given date
     * @param date : int (yymmdd)
     * @return ArrayList<Event>
     */
    public ArrayList<Event> getOnDate(int date) {
        int time = date * 10000;
        ArrayList<Event> dateList = new ArrayList<>();
        for (int i = 0; i < eventList.size(); i++) {
            if (eventList.get(i).getTime() >= time && eventList.get(i).getTime() <= (time + 2359)) {
                dateList.add(eventList.get(i));
            }
        }
        return dateList;
    }

    
    /** 
     * Gets a list of all events in a time interval on two dates
     * @param date1 : int (yymmdd)
     * @param date2 : int (yymmdd)
     * @param startTime : int (hhmm)
     * @param endTime : int (hhmm)
     * @return ArrayList<Event>
     */
    public ArrayList<Event> getInInterval(int date1, int date2, int startTime, int endTime) {
        if (date1 == date2) {
            throw new IllegalArgumentException("Must be two different dates.");
        }
        if (startTime > endTime) {
            throw new IllegalArgumentException("Interval can't start after it ends.");
        }
        int start1 = (date1 * 10000) + startTime;
        int start2 = (date2 * 10000) + startTime;
        int end1 = (date1 * 10000) + endTime;
        int end2 = (date1 * 10000) + endTime;
        ArrayList<Event> dateList = new ArrayList<>();
        for (int i = 0; i < eventList.size(); i++) {
            if (eventList.get(i).getTime() >= start1 && eventList.get(i).getTime() <= end1) {
                dateList.add(eventList.get(i));
            }
            if (eventList.get(i).getTime() >= start2 && eventList.get(i).getTime() <= end2) {
                dateList.add(eventList.get(i));
            }
        }
        Collections.sort(dateList, new SortByTime());
        return dateList;
    }

    
    /** 
     * Makes a sorted list of all events, sorted by time
     * @return ArrayList<Event>
     */
    public ArrayList<Event> sortByTime() {
        ArrayList<Event> tempList = getEventList();
        Collections.sort(tempList, new SortByTime());
        return tempList;
    }

    
    /** 
     * Makes a sorted list of all events, sorted by location
     * @return ArrayList<Event>
     */
    public ArrayList<Event> sortByLocation() {
        ArrayList<Event> tempList = getEventList();
        Collections.sort(tempList, new SortByLocation());
        return tempList;
    }

    
    /** 
     * Makes a sorted list of all events, sorted by type
     * @return ArrayList<Event>
     */
    public ArrayList<Event> sortByType() {
        ArrayList<Event> tempList = getEventList();
        Collections.sort(tempList, new SortByType());
        return tempList;
    }

    
    /** 
     * Makes a string of all events in the eventlist
     * @return String
     */
    public String toString() { 
        String s = "";
        for (int i = 0; i < eventList.size(); i++) {
            s += eventList.get(i).toString() + "\n";
        }
        return s;
    }

    
    /** 
     * Makes a string of all the events in the given list
     * @param events : ArrayList<Event>
     * @return String
     */
    public String stringifyList(ArrayList<Event> events) {
        String s = "";
        for (int i = 0; i < events.size(); i++) {
            s += events.get(i).toString() + "\n";
        }
        return s;
    }
}
