import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();
        eventManager.add(new Event("Peter pan", "Childrens theather", "Main stage", 2010221500, "Happy Corp"));
        eventManager.add(new Event("Mini Golf", "Turnament", "Golf Court", 2010231200, "Sport Inc"));
        eventManager.add(new Event("Pepa Pig", "Childrens theather", "Main stage", 2010241500, "Happy Corp"));
        eventManager.add(new Event("Field hockey", "Turnament", "Football field", 2010221500, "Sport Inc"));
        eventManager.add(new Event("Field hockey", "Turnament", "Football field", 2010221500, "Sport Inc"));
        
        boolean carryOn = true;
        Scanner scanner = new Scanner(System.in, "UTF-8");

        while(carryOn) {
            System.out.println("What would you like to do: \n 1: Add event \n 2: Get events on location \n 3: Find events on date \n 4: Find events in interval \n 5: Sort \n 6: Exit");
            int choice = scanner.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("What's the name of the event?");
                    String name = scanner.next();
                    System.out.println("What type of event?");
                    String type = scanner.next();
                    System.out.println("Where is the event?");
                    String location = scanner.next();
                    System.out.println("What's the date and time of the event? (yymmddtttt)");
                    int time = scanner.nextInt();
                    System.out.println("Who's the host of the event?");
                    String host = scanner.next();
                    eventManager.add(new Event(name, type, location, time, host));
                    break;

                case 2:
                    System.out.println("What's the location you want?");
                    location = scanner.next();
                    ArrayList<Event> tempList = eventManager.getAtLocation(location);
                    System.out.print(eventManager.stringifyList(tempList));
                    break;

                case 3:
                    System.out.println("What's the date you want? (yymmdd)");
                    int date = scanner.nextInt();
                    tempList = eventManager.getOnDate(date);
                    System.out.print(eventManager.stringifyList(tempList));
                    break;

                case 4:
                    System.out.println("What's the fist date you want? (yymmdd)");
                    int date1 = scanner.nextInt();
                    System.out.println("What's the second date you want? (yymmdd)");
                    int date2 = scanner.nextInt();
                    System.out.println("What's the start time you want? (tttt)");
                    int startTime = scanner.nextInt();
                    System.out.println("What's the start time you want? (tttt)");
                    int endTime = scanner.nextInt();
                    tempList = eventManager.getInInterval(date1, date2, startTime, endTime);
                    System.out.print(eventManager.stringifyList(tempList));
                    break;

                case 5:
                    System.out.println("What would you like to sort by? \n1: Time \n2: Location \n3: Type");
                    int sortChoice = scanner.nextInt();
                    switch(sortChoice){
                        case 1: 
                            tempList = eventManager.sortByTime();
                            System.out.print(eventManager.stringifyList(tempList));
                            break;

                        case 2:
                            tempList = eventManager.sortByLocation();
                            System.out.print(eventManager.stringifyList(tempList));
                            break;

                        case 3:
                            tempList = eventManager.sortByType();
                            System.out.print(eventManager.stringifyList(tempList));
                            break;

                        default:
                            System.out.print("Input not valid!");
                    }
                    break;

                case 6:
                    System.out.println("Process exited.");
                    carryOn = false;
                    break;

                default:
                    System.out.println("Invalid input.");        
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
