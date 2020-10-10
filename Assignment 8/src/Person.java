public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getBirthYear(){
        return birthYear;
    }

    public String getName(){
        return firstName + " " + lastName;
    }

    public String toString(){
        String s = "Firstname: " + firstName + "\nLastname: " + lastName + "\nBirth year: " + birthYear;
        return s;
    }

}
