public class Person {
    private final String FIRSTNAME;
    private final String LASTNAME;
    private final int BIRTHYEAR;

    public Person(String FIRSTNAME, String LASTNAME, int BIRTHYEAR){
        this.FIRSTNAME = FIRSTNAME;
        this.LASTNAME = LASTNAME;
        this.BIRTHYEAR = BIRTHYEAR;
    }

    public String getFirstName(){
        return FIRSTNAME;
    }

    public String getLastName(){
        return LASTNAME;
    }

    public int getBirthYear(){
        return BIRTHYEAR;
    }

    public String getName(){
        return FIRSTNAME + " " + LASTNAME;
    }

    public String toString(){
        String s = "Firstname: " + FIRSTNAME + "\nLastname: " + LASTNAME + "\nBirth year: " + BIRTHYEAR;
        return s;
    }

}
