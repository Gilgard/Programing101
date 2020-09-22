public class Fraction {
    private int numerator;
    private int denominator;

    //konstruktører
    public Fraction(int n, int d){
        this.numerator = n;
        if (d == 0){
            throw new IllegalArgumentException("Demoniator can't be 0!");
        }
        this.denominator = d;
    }
    public Fraction(int n){
        this.numerator = n;
        this.denominator = 1;
    }

    //gettere:
    public int getNumerator() {
        return this.numerator;
    }
    public int getDenominator() {
        return this.denominator;
    }

    //interne metoder:
    private int gcm() {
        for(int i = java.lang.Math.min(this.denominator, this.numerator);i > 1; i--){
            if((this.numerator % i == 0) && (this.denominator % i == 0)){
                return i;
            }
        }
        return 1;
    }

    //regnemetoder:
    public void factorize() {
        this.numerator /= gcm();
        this.denominator /= gcm();
    }
    
    public void add(Fraction in) {
        if (this.denominator == in.getDenominator()) {
            this.numerator += in.getNumerator();
        }else{
            this.numerator = (this.numerator * in.getDenominator()) + (in.getNumerator() * this.denominator);
            this.denominator = this.denominator * in.getDenominator();
        }
        factorize();
    }

    public void subtact(Fraction in) {
        if (this.denominator == in.getDenominator()) {
            this.numerator -= in.getNumerator();
        }else{
            this.numerator = (this.numerator * in.getDenominator()) - (in.getNumerator() * this.denominator);
            this.denominator = this.denominator * in.getDenominator();
        }
        factorize();
    }

    public void divide(Fraction in) {
        if (in.getNumerator() == 0) {
            throw new IllegalArgumentException("You can't devide by 0!");
        }
        this.numerator *= in.getDenominator();
        this.denominator *= in.getNumerator();
        factorize();
    }

    public void multiply(Fraction in) {
        this.numerator *= in.numerator;
        this.denominator *= in.denominator;
        factorize();
    }

    //toString:
    public String toString() {
        return (this.numerator + " / " + this.denominator);
    }
}
