import java.util.Scanner;

public class PriceComp {
    public static String comparePrice(double price1, double weight1, double price2, double weight2){
        double p1 = price1/weight1;
        double p2 = price2/weight2;

        if(p1<p2){
            return "A is cheaper than B.";
        }else{
            return "B is cheaper than A.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price A: ");
        double price1 = input.nextDouble();
        System.out.println("Enter weight A: ");
        double weight1 = input.nextDouble();
        System.out.println("Enter price B: ");
        double price2 = input.nextDouble();
        System.out.println("Enter weight B: ");
        double weight2 = input.nextDouble();
        
        System.out.println(comparePrice(price1, weight1, price2, weight2));

        input.close();
    }   
}