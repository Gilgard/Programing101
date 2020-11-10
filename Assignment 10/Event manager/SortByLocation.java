import java.util.Comparator;

/**
 * Class SortByLocation
 */
class SortByLocation implements Comparator<Event> { 
    /**
     * Compares two events by location
         * @param eventA : Event
        * @param eventB : Event
        * @return int 
        */
    public int compare(Event a, Event b) { 
        return a.getLocation().compareTo(b.getLocation()); 
    } 
}