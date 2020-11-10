import java.util.Calendar;

public class Employee {
    private Person personalia;
    private final String EMPLOYEEID;
    private final int EMPLOYMENTYEAR;
    private double monthlySalary;
    private double taxLevel;

    //constructor:
    public Employee(String firstName, String lastName, int birthYear, String EMPLOYEEID, int EMPLOYMENTYEAR, double monthlySalary, double taxLevel) {
        this.personalia = new Person(firstName, lastName, birthYear);
        this.EMPLOYEEID = EMPLOYEEID;
        this.EMPLOYMENTYEAR = EMPLOYMENTYEAR;
        this.monthlySalary = monthlySalary;
        this.taxLevel = taxLevel * 0.01;
    }
    
    //getters:
    public Person getPersonalia() {
        Person person = new Person(personalia.getFirstName(), personalia.getLastName(), personalia.getBirthYear());
        return person;
    }
    
    public String getEmployeeID() {
        return EMPLOYEEID;
    }

    public int getEmploymentYear() {
        return EMPLOYMENTYEAR;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getTaxLevel() {
        return taxLevel * 100;
    }

    //Setters:
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setTaxLevel(double taxLevel) {
        this.taxLevel = taxLevel * 0.01;
    }

    public void setName(String firstName, String lastName) {
        this.personalia = new Person(firstName, lastName, personalia.getBirthYear());
    }

    //methods:
    public double monthlyTaxPayment() {
        return monthlySalary * taxLevel;
    }

    public double yearlyPayBeforeTaxes() {
        return monthlySalary * 12;
    }

    public double yearlyTaxes() {
        return monthlyTaxPayment() * 10.5;
    }

    public String name() {
        return personalia.getLastName() + ", " + personalia.getFirstName();
    }

    public int age() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - personalia.getBirthYear();
    }

    public int employmentTime() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - EMPLOYMENTYEAR;
    }

    public boolean employedLongerThan(int years) {
        return employmentTime() >= years;
    }

    public String toPrint() {
        String yesNo = "No";
        if(employedLongerThan(3)) yesNo = "yes";
        String s = String.format("%s \nAge: %d \nID: %s \nYears employed: %d \nYearly pay before taxes: %.2f kr \nYearly taxes: %.2f kr \nYearly pay after taxes: %.2f kr \nHas been employed for longer than 3 years: %s", name(), age(), EMPLOYEEID, employmentTime(), yearlyPayBeforeTaxes(), yearlyTaxes(), (yearlyPayBeforeTaxes() - yearlyTaxes()), yesNo);
        return s;
    }

    public String toString() {
        String s = "Personalia: \n" + getPersonalia() + "\nEmployee ID: " + EMPLOYEEID + "\nYear of employment: " + EMPLOYMENTYEAR + "\nMonthly salary: " + monthlySalary + " kr \nTaxation level: " + (taxLevel * 100) + " %";
        return s;
    }
}
