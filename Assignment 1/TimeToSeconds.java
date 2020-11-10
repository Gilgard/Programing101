import java.util.Scanner;
public class TimeToSeconds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time (h,m,s): ");
        String in = input.next();
        String[] time = in.split(",", 5);
        input.close();

        int h = Integer.parseInt(time[0]);
        int m = Integer.parseInt(time[1]);
        int s = Integer.parseInt(time[2]);

        int S = h * 3600 + m * 60 + s;

        System.out.println(h + " hours " + m + " minutes and "+ s + " seconds is: " + S + " seconds.");
    }
}