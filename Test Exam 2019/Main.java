import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AidRegistry registry = new AidRegistry();
        registry.add("1001-1", "Lytteapperat");
        registry.add("1001-2", "Lytteapperat");
        registry.add("1002-1", "Varslingsutstyr");
        registry.add("1002-2", "Varslingsutstyr", "Per Hansen");
        registry.add("1003-1", "Samtaleforsterker", "Ole Person");
        registry.add("1003-2", "Samtaleforsterker", "Frank Nilsen");

        boolean carryOn = true;
        boolean itWorked = false;
        Scanner scanner = new Scanner(System.in, "UTF-8");

        while(carryOn) {
            System.out.println("1: Legg til nytt hjelpemiddel \n2: Skriv ut helpemiddler \n3: Vis tilgjengelige hjelpemiddel \n4: Lei et hjelpemiddel \n5: Retuner et hjelpemiddel \n6: Exit");
            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 1:
                    System.out.println("ID?");
                    String id0 = scanner.nextLine();
                    System.out.println("Type?");
                    String type = scanner.nextLine();
                    System.out.println("Utleid? (y/n)");
                    if(scanner.nextLine().contains("y")){
                        System.out.println("Navn på leietaker?");
                        String name = scanner.nextLine();
                        itWorked = registry.add(id0, type, name);
                        if(itWorked) {
                            System.out.println("Hjelpemiddel lagret.");
                        }else {
                            System.out.println("Noe gikk galt, hjelpemiddel ikke lagret");
                        }
                        break;
                    }
                    itWorked = registry.add(id0, type);
                    if(itWorked) {
                        System.out.println("Hjelpemiddel lagret.");
                    }else {
                        System.out.println("Noe gikk galt, hjelpemiddel ikke lagret");
                    }
                    break;
                case 2:
                    System.out.println(registry.toString());
                    break;
                case 3:
                    System.out.println("Type?");
                    System.out.println(registry.findAid(scanner.nextLine().trim()));
                    break;
                case 4:
                    System.out.println("ID: ");
                    String id1 = scanner.nextLine();
                    System.out.println("Leietaker: ");
                    String renter = scanner.nextLine();
                    itWorked = registry.rent(id1, renter);
                    if(itWorked) {
                        System.out.println("Hjelpemiddel utleid.");
                    }else {
                        System.out.println("Noe gikk galt, hjelpemiddel ikke funnet");
                    }
                    break;
                case 5:
                    System.out.println("ID: ");
                    String id2 = scanner.nextLine();
                    itWorked = registry.returnAid(id2);
                    if(itWorked) {
                        System.out.println("Hjelpemiddel returnert.");
                    }else {
                        System.out.println("Noe gikk galt, hjelpemiddel ikke funnet");
                    }
                    break;
                case 6:
                    System.out.println("Avslutter program.");
                    carryOn = false;
                    break;
                default:
                    System.out.println("Invalid innput.");
            }
        }
        scanner.close();
    } 
}
