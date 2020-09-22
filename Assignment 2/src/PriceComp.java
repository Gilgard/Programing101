package src;
import java.util.Scanner;

public class PriceComp {
    private double price1;
    private double weight1;
    private double price2;
    private double weight2;

    private void inputVariables(Scanner input){
        System.out.println("Enter price A: ");
        this.price1 = input.nextDouble();
        System.out.println("Enter weight A: ");
        this.weight1 = input.nextDouble();
        System.out.println("Enter price B: ");
        this.price2 = input.nextDouble();
        System.out.println("Enter weight B: ");
        this.weight2 = input.nextDouble();
    }

    private String priceComp(){
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
        PriceComp priceComp = new PriceComp();
        priceComp.inputVariables(input);
        
        System.out.println(priceComp.priceComp());

        input.close();
    }   
}