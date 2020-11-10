import java.util.Comparator;

/**
 * Class SortByType
 */
class SortByType implements Comparator<Event> { 
    /**
     * Compares two events by type
     * @param eventA : Event
     * @param eventB : Event
     * @return int 
     */
    public int compare(Event eventA, Event eventB) { 
        return eventA.getType().compareTo(eventB.getType()); 
    } 
}

