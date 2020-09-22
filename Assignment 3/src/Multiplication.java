import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn start nummer: ");
        int a = input.nextInt();
        System.out.println("Skriv inn slutt nummer: ");
        int b = input.nextInt();
        input.close();

        for(int i = a; i <= b; i++){
            System.out.printf("\n%d-gangen: \n\n",i);

            for(int j = 1; j <= 10; j++){
                int product = i * j;
                System.out.println(i + " x " + j + " = " + product);
            }
        }
    }
}