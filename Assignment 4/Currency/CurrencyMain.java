import java.util.Scanner;
public class CurrencyMain {
    public static void main(String[] args) {
        Currency currencyList[] = new Currency[3];
        currencyList[0] = new Currency("Dollars", "USD", 8.94);
        currencyList[1] = new Currency("Euro", "EUR", 10.57);
        currencyList[2] = new Currency("Swedish krones", "SEK", 1.02);
        
        //meny:
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a currencyList:\n1: Dollars\n2: Euro\n3: Swedish krones\n4: Exit program");
        int in = input.nextInt();

        if(in < 4){
            boolean carryon = true;
            Currency c = currencyList[in-1];

            //loop for conversions:
            while(carryon){
                System.out.println("Choose a conversion operation:\n1: To NOK\n2: From NOK\n3: Exit program");
                in = input.nextInt();
                
                switch(in){
                    case 1:
                        System.out.println("What value ("+ c.getCode() +") do you want to convert");
                        double d = input.nextDouble();
                        System.out.printf("%.2f %s = %.2f NOK\n", d, c.getCode(), c.toNOK(d));
                        break;
                    case 2:
                        System.out.println("What value (NOK) do you want to convert");
                        d = input.nextDouble();
                        System.out.printf("%.2f NOK = %.2f %s\n", d, c.fromNOK(d), c.getCode());
                        break;
                    default:
                        carryon = false;
                        break;
                }
            }
        }
        input.close();
    }
}
