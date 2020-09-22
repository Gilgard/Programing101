package src;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv inn år: ");
        int in = input.nextInt();
        input.close();
        
        if(in % 4 == 0 && in % 100 != 0 || in % 400 == 0){
            System.out.println(in + " er et skuddår.");
        }else{
            System.out.println(in + " er ikke et skuddår."); 
        }
    }
}