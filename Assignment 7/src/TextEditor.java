public class TextEditor {

    String txt;
    String[] txtWordsOnly;

    // constructor
    public TextEditor(String txt) {
        this.txt = txt;
        this.txtWordsOnly = txt.split("[\\p{Punct}\\s]+");
    }
    
    // getters
    public String getTxt() {
        return txt;
    }
    public String[] getTxtWordsOnly() {
        return txtWordsOnly;
    }
    public String getUpper() {
        return txt.toUpperCase();
    }

    // methods
    public int totalNumberOfWords() {
        return txtWordsOnly.length;
    }

    public double averageWordLength() {
        int sum = 0;
        for(int i = 0; i < totalNumberOfWords(); i++) {
            sum += txtWordsOnly[i].length();
        }
        return (double) sum / (double) totalNumberOfWords();
    }

    public double averageWordPerSentence() {
        String[] sentences = txt.split("[\\.\\?\\!]");
        if(sentences.length == 0) {
            return totalNumberOfWords();
        }
        int sum = 0;
        for(int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].split(" ");
            sum += words.length;
        }
        return (double) sum / (double) sentences.length;
    }

    public void searchAndReplace(String searchWord, String replacementWord) {
        String newTxt = txt.replaceAll(searchWord, replacementWord);
        this.txt = newTxt;
    }

    //Testklient
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("The whiskey stink of rot has settled in the garden, and a burst of fruit flies rises when I touch the dying tomato plants. Still, the claws of tiny yellow blossoms flail in the air as I pull.");
        System.out.println(textEditor.totalNumberOfWords());
        System.out.println(textEditor.averageWordLength());
        System.out.println(textEditor.averageWordPerSentence());
        textEditor.searchAndReplace("whiskey", "nasty");
        System.out.println(textEditor.getTxt());
        System.out.println(textEditor.getUpper());
    }   
}
