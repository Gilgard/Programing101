import java.util.Comparator;

/**
 * Class SortByTime
 */
class SortByTime implements Comparator<Event> { 
    /**
     * Compares two events by time
         * @param eventA : Event
        * @param eventB : Event
        * @return int 
        */
    public int compare(Event a, Event b) { 
        return a.getTime() - b.getTime(); 
    } 
}