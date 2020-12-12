import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AidRegistry registry = new AidRegistry();
        registry.add("1001-1", "Høreapperat");
        registry.add("1001-2", "Høreapperat");
        registry.add("1002-1", "Varslingsutstyr");
        registry.add("1002-2", "Varslingsutstyr", "Per Hansen");
        registry.add("1003-1", "Samtaleforsterker", "Ole Person");
        registry.add("1003-2", "Samtaleforsterker", "Frank Nilsen");

        boolean carryOn = true;
        Scanner scanner = new Scanner(System.in, "UTF-8");

        while(carryOn) {
            System.out.println("1: Legg til nytt hjelpemiddel \n2: Skriv ut helpemiddler \n3: Vis tilgjengelige hjelpemiddel \n4: Lei et hjelpemiddel \n5: Retuner et hjelpemiddel \n6: Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            // TODO: For endringer gjort sett opp if-setninger booleaner.

            switch(choice) {
                case 1:
                    System.out.println("ID?");
                    String id0 = scanner.nextLine();
                    System.out.println("Type?");
                    String type = scanner.nextLine();
                    registry.add(id0, type);
                    break;
                case 2:
                    System.out.println(registry.toString());
                    break;
                case 3:
                    System.out.println("ID: ");
                    String id1 = scanner.nextLine();
                    System.out.println("Leietaker: ");
                    String renter = scanner.nextLine();
                    registry.rent(id1, renter);
                    break;
                case 4:
                    System.out.println("ID: ");
                    String id2 = scanner.nextLine();
                    registry.returnAid(id2);
                    break;
                case 5:
                    System.out.println("Avslutter program.");
                    carryOn = false;
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        }
        scanner.close();
    } 
}
