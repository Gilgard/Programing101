import java.util.Scanner;

public class Inches {
    public static void main(final String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.println("Enter inches: ");
        double in = INPUT.nextDouble();
        
        final double C = 2.54;
        double cm = in *C ;
        System.out.printf(in+" inches = %8.2f cm", cm);

        INPUT.close();
    }
}