import java.util.Calendar;

public class Employee {
    private Person personalia;
    private String employeeID;
    private int employmentYear;
    private double monthlySalary;
    private double taxLevel;

    //constructor:
    public Employee(String firstName, String lastName, int birthYear, String employeeID, int employmentYear, double monthlySalary, double taxLevel){
        this.personalia = new Person(firstName, lastName, birthYear);
        this.employeeID = employeeID;
        this.employmentYear = employmentYear;
        this.monthlySalary = monthlySalary;
        this.taxLevel = taxLevel * 0.01;
    }
    
    //getters:
    public String getPersonalia() {
        return personalia.toString();
    }
    
    public String getEmployeeID() {
        return employeeID;
    }

    public int getEmploymentYear() {
        return employmentYear;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getTaxLevel() {
        return taxLevel;
    }

    //Setters:
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setTaxLevel(double taxLevel) {
        this.taxLevel = taxLevel;
    }

    public void setName(String firstName, String lastName) {
        this.personalia = new Person(firstName, lastName, personalia.getBirthYear());
    }

    //methods:
    public double monthlyTaxPayment(){
        return monthlySalary * taxLevel;
    }

    public double yearlyPayBeforeTaxes(){
        return monthlySalary * 12;
    }

    public double yearlyTaxes(){
        return monthlyTaxPayment() * 11.5;
    }

    public String name(){
        return personalia.getLastName() + ", " + personalia.getFirstName();
    }

    public int age(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - personalia.getBirthYear();
    }

    public int employmentTime(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - employmentYear;
    }

    public boolean employedLongerThan(int years){
        return employmentTime() >= years;
    }

    public void print(){
        String yesNo = "No";
        if(employedLongerThan(3)) yesNo = "yes";
        String s = String.format("%s \nAge: %d \nID: %s \nYears employed: %d \nYearly pay before taxes: %.2f kr \nYearly taxes: %.2f kr \nYearly pay after taxes: %.2f kr \nHas been employed for longer than 3 years: %s", name(), age(), employeeID, employmentTime(), yearlyPayBeforeTaxes(), yearlyTaxes(), (yearlyPayBeforeTaxes() - yearlyTaxes()), yesNo);
        System.out.println(s);
    }

    public String toString(){
        String s = "Personalia: \n" + personalia.toString() + "\nEmployee ID: " + employeeID + "\nYear of employment: " + employmentYear + "\nMonthly salary: " + monthlySalary + " kr \nTaxation level: " + (taxLevel * 100) + " %";
        return s;
    }
}
