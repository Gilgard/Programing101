public class TextEditor {

    String txt;

    // constructor
    public TextEditor(String txt) {
        this.txt = txt;
    }
    
    // getters
    public String getTxt() {
        return txt;
    }
    public String getUpper() {
        return txt.toUpperCase();
    }

    // methods
    public int totalNumberOfWords() {
        //TODO: Split the txt by spaces split(" ") and use the length to determin the word count
        //      remember that there may be symbols in the array since split only removes (and separates the string) on spaces
        return 0;
    }

    public double averageWordLength() {
        //TODO: again split the txt by space
        //      for each word in the array count the number of letters (remember there might be symbols)
        //      calculate the average and return
        return 0;
    }

    public double averageWordPerSentence() {
        //TODO: split the txt by period split(".")
        //      for each sentence split by space and use lenght to find word count
        //      calculate the average and return
        return 0;
    }

    public void searchAndReplace(String searchWord, String replacementWord) {
        //TODO: split the text by space
        //      find each occurence of searchWord and replace it with replacementWord (remember to not remove symbols, and that "hei." != "hei")
        //      finaly make the array into a string and replace txt with the new (and improved string)
    }

    
}
