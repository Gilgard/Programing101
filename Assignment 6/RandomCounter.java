import java.util.Random;

public class RandomCounter {
    private static Random random = new Random();

    private int[] occurancesZeroToNine(final int itterations) {
        int[] occurances = new int[10];
        for (int i = 0; i < itterations; i++) {
            occurances[random.nextInt(10)]++;
        }
        return occurances;
    }

    public String toString(int[] occurances) {
        String string = "";
        for (int i = 0; i < 10; i++) {
            string += (i + 1) + ": " + occurances[i] + "\n";
        }
        return string;
    }

    public static void main(final String[] args) {
        RandomCounter randomCounter = new RandomCounter();
        System.out.println("List of number occuranses for 1000 itterations: \n" + randomCounter.toString(randomCounter.occurancesZeroToNine(1000)));
        System.out.println("List of number occuranses for 5000 itterations: \n" + randomCounter.toString(randomCounter.occurancesZeroToNine(5000)));
        System.out.println("List of number occuranses for 10 000 itterations: \n" + randomCounter.toString(randomCounter.occurancesZeroToNine(10_000)));
    }
    
}
