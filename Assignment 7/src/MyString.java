public class MyString {
    String string;

    //constructor
    public MyString(String string) {
        this.string = string;
    }

    //getters
    public String getString() {
        return string;
    }

    //methods
    public String firstLetterAcronym() {
        //TODO: split string into an array using split()
        //      for each string in the array get the first letter (could use charAt(0))
        //      add these letters to a string and return
        return "";
    }

    public String removeChar(char letter) {
        //TODO: split on letter using split(letter)
        //      put all the strings in the array back into a string and return
        return "";
    }

    //Testclient 
    public static void main(String[] args) {
        MyString myString = new MyString("String not found :P");
        System.out.println(myString.firstLetterAcronym());
        System.out.println(myString.removeChar('n'));
    }
}
