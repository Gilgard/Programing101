import java.util.Scanner;

public class Seconds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int in = input.nextInt();
        input.close();

        int h = in/3600;
        int m = (in%3600)/60;
        int s = in%60;

        System.out.println(in+" seconds is: " + h + " hours " + m + " minutes and " + s + " seconds.");
    }
}