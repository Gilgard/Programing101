import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        /*
        //creating the initial employee:
        System.out.println("Employee personalia (firstname, lastname, birthyear): ");
        String in = scanner.nextLine();
        String[] personalia = in.split(", ");
        System.out.println("Employee ID:");
        String id = scanner.nextLine();
        System.out.println("Employment year:");
        int year = scanner.nextInt();
        System.out.println("Monthly salary:");
        double salary = scanner.nextDouble();
        System.out.println("Tax percentage:");
        double tax = scanner.nextDouble();

        Employee employee = new Employee(personalia[0], personalia[1], Integer.parseInt(personalia[2]), id, year, salary, tax);
        */
        
        //test employee for loop testing
        Employee employee = new Employee("Alida", "Hjelljord", 1994, "AH230693", 2018, 18485.32, 14.6);

        //Menu loop:
        boolean carryOn = true;
        while(carryOn){
            System.out.println(employee.toString() + "\n");

            System.out.println("What would you like to change: \n 1: Name \n 2: Monthly salary \n 3: Taxation level \n 4: Exit program");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Input new full name:");
                    String name = scanner.next();
                    String[] names = name.split(" ");
                    if(names.length == 2) {
                        employee.setName(names[0], names[1]);
                    }else{
                        String firstName = "";
                        for(int i = 0; i < names.length - 1; i++){
                            firstName += names[i] + " ";
                        }
                        employee.setName(firstName, names[names.length - 1]);
                    }
                    break;
                case 2:
                    System.out.println("Input new monthly salary:");
                    double newSalary = scanner.nextDouble();
                    employee.setMonthlySalary(newSalary);
                    break;
                case 3: 
                    System.out.println("Input new taxation level:");
                    double newTax = scanner.nextDouble();
                    employee.setTaxLevel(newTax);
                    break;
                case 4:
                    System.out.println("Process exited, with employee information:");
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
