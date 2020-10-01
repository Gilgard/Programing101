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
        String [] txt = string.split("[\\p{Punct}\\s]+");
        String acronym = "";
        for(int i = 0; i < txt.length; i++) {
            acronym += txt[i].charAt(0);
        }
        return acronym.toUpperCase();
    }

    public String removeChar(char letter) {
        String newTxt = string.replaceAll(letter+"", "");
        return newTxt;
    }

    //Testclient 
    public static void main(String[] args) {
        MyString myString = new MyString("Dans meg gjennom kropp og ånd");
        System.out.println(myString.firstLetterAcronym());
        System.out.println(myString.removeChar('n'));
    }
}
