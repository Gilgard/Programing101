import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MunicipalRegistry municipalRegistry = new MunicipalRegistry();
        municipalRegistry.add(4650, 77, 631, "", 1017.6 , "Jens Olsen");
        municipalRegistry.add(4650, 77, 131, "Syningom", 661.3, "Nicolay Madsen");
        municipalRegistry.add(4650, 75, 19, "Fugletun", 650.6, "Evilyn Jensen");
        municipalRegistry.add(4650, 74, 188, "", 1457.2, "Karl Ove Bråten");
        municipalRegistry.add(4650, 69, 47, "Høiberg", 1339.4, "Elsa Indregård");
        municipalRegistry.add(4650, 77, 631, "", 1017.6 , "Jens Olsen");
        
        boolean carryOn = true;
        Scanner scanner = new Scanner(System.in, "UTF-8");

        while(carryOn) {
            System.out.println("1: Legg til tomt \n2: Skriv ut tomter \n3: Finn tomt \n4: Finn gjennomsnittlig areal \n5: Exit");
            int choice = Integer.parseInt(scanner.nextLine());
            switch(choice) {
                case 1:
                    System.out.println("Hvilken tomt skal legges til? (kommunenr, grn, brn, navn, km2, eier)");
                    String[] info = scanner.nextLine().split(", ");
                    municipalRegistry.add(Integer.parseInt(info[0]), Integer.parseInt(info[1]), Integer.parseInt(info[2]), info[3], Double.parseDouble(info[4]), info[5]);
                    break;
                case 2:
                    System.out.println(municipalRegistry.toString());
                    break;
                case 3:
                    System.out.println("Hvilken eiendom ønsker du å søke etter? (kommmunenummer-gnr/bnr)");
                    String searchID = scanner.nextLine();
                    System.out.println(municipalRegistry.getLot(searchID).toString());
                    break;
                case 4:
                    System.out.println("Gjennomsnittsarealet i registeret er: " + municipalRegistry.getAverageArea());
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
