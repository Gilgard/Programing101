public class Currency {
    private final String NAME;
    private final String CODE;
    private double conversion;

    //konstruktør:
    public Currency(String name, String code, double conversion){
        this.NAME = name;
        this.CODE = code;
        this.conversion = conversion;
    }

    //gettere:
    public String getName(){ 
        return this.NAME;
    }
    public String getCode(){ 
        return this.CODE;
    }
    public double getConversion(){
        return this.conversion;
    }

    //settere
    public void setConversion(double conversion){
        this.conversion = conversion;
    }

    //omgjørings metoder:
    public double toNOK(double value){
        return (value * this.conversion);
    }
    public double fromNOK(double value){
        return (value / this.conversion);
    }
    
    //to string
    public String toString(){
        String s = this.NAME + ": " + this.CODE + "\nConversion rate: " + this.conversion;
        return s;
    }
}
