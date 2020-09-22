import java.util.Scanner;

public class Circle {

    private final double R;

    public Circle(double r) {
        R = r;
    }
    
    public double getRadius(){
        return R;
    }

    public double findCercomference(){
        return Math.PI * 2 * R;
    }

    public double findArea(){
        return Math.PI * Math.pow(R, 2);
    }

    public double findDiameter(){
        return 2*R;
    }

    public String toString(){
        return String.format("\nCircle: \nRadius: %.2f \nCercomference: %.2f \nArea: %.2f", this.R, findCercomference(), findArea()); 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double in = input.nextDouble();
        input.close();
        
        Circle sirkel = new Circle(in);

        System.out.println(sirkel.toString());
    }


}