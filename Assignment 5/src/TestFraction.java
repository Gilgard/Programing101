public class TestFraction {
    public static void main(String[] args) {
        Fraction fi = new Fraction(5, 6);
        Fraction f1 = new Fraction(4);
        Fraction f2 = new Fraction(6, 3);
        Fraction f3 = new Fraction(1, 4);
        Fraction f4 = new Fraction(3, 2);
        //Fraction f5 = new Fraction(0);

        System.out.println("TestClient for Fraction:");

        System.out.println("Initial Fraction:\n"+ fi.toString());

        fi.add(f1);
        System.out.println("After addition:\n" + fi.toString());

        fi.subtact(f2);
        System.out.println("After subtraction:\n" + fi.toString());

        fi.divide(f3);
        System.out.println("After division:\n" + fi.toString());

        fi.multiply(f4);
        System.out.println("After multiplication:\n" + fi.toString() + "\n\n");

        //fi.divide(f5);


       
    }

}
