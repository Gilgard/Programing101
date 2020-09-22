import java.util.Scanner;

public class TxtAnalyzor{
    private int[] charArray;

    //constructor
    public TxtAnalyzor(String txt) {
        this.charArray = new int[30];
        for (int i = 0; i < txt.length(); i++) {
            char letter = txt.charAt(i);
            charArray[findIndex(letter)] ++;
        }
    }

    //getters:
    public int[] getCharArray(){
        return charArray;
    }

    //internal metodes:
    private int findIndex(char letter) {
        int code = (int) letter;
        int index = 29;

        if (code >= 65 && code <= 90) index = code - 65;
        if (code >= 97 && code <= 122) index = code - 97;
        if (code == 230 || code == 198) index = 26;
        if (code == 248 || code == 216) index = 27;
        if (code == 229 || code == 197) index = 28;

        return index;
    }
    private int findTotal() {
        int sum = 0;
        for (int i = 0; i < 30; i++){
            sum += charArray[i];
        }
        return sum;
    }
    private char findCharacter(int index) {
        if(index < 25) return (char) (index + 65);
        if(index == 26) return 'æ';
        if(index == 27) return 'ø';
        if(index == 28) return 'å';
        return '/';
    }

    //metodes:
    public int numberOfDifferentLetters() {
        int counter = 0;
        for(int i = 0; i < 29; i++) {
            if(charArray[i] > 0) {
                counter++;
            }
        }
        return counter;
    }

    public int numberOfLetters() {
        int sum = 0;
        for(int i = 0; i < 29; i++) {
            sum += charArray[i];
        }
        return sum;
    }

    public double percentOfSybols() {
        return ((double) charArray[29] * 100 / (double) findTotal());
    }

    public int numberOfLetter(char letter) {
        return charArray[findIndex(letter)];
    }

    public String mostUsedLetters() {
        int max = 0;
        for(int i = 0; i < 29; i ++) {
            if(charArray[i] > max) max = charArray[i];
        }
        String list = "";
        for(int i = 0; i < 25; i ++) {
            if(charArray[i] == max) list += findCharacter(i) + " ";
        }

        return list;
    }

    public void print(char letter){
        System.out.println("There are " + numberOfDifferentLetters() + " different letters.");
        System.out.println("There are " + numberOfLetters() + " letters total.");
        System.out.printf("There are %.2f %% symbols in this text.\n", percentOfSybols());
        System.out.println("There are " + numberOfLetter(letter) + " occurances of "+ letter +".");
        System.out.println("The most common letter is " + mostUsedLetters() + ".");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        boolean carryOn = true;
        while(carryOn){
            System.out.println("Input new text:");
            String txt = scanner.nextLine();

            if(txt.equals("esc")) {
                System.out.println("Process exited, with 0 errors.");
                carryOn = false;
                continue;
            }

            System.out.println("What letter would you like to check the occurrences of?");
            char letter = scanner.nextLine().charAt(0);

            TxtAnalyzor analyzor = new TxtAnalyzor(txt);
            analyzor.print(letter);
        }
        scanner.close();
    }
}