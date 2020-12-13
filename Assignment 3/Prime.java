public class Prime {
    public static boolean isPrime(int n){
        for(int i = 2; i < n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
    public static void factorize(int n) {
        for(int i = 2; i < n; i++){
            if(n % i == 0) System.out.println(n + " / " + i + " = " + (n/i));
        }
    }
    
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // boolean carryon = true; 
        // while(carryon){
        //     System.out.println("Enter number (Exit with \"esc\"): ");
        //     String in = input.nextLine();
        //     if(in.equals("esc")){
        //         carryon = false;
        //         continue;
        //     }
        //     int n = Integer.parseInt(in);
        //     if(isPrime(n)){ 
        //         System.out.println(n + " is prime.");
        //     }else{
        //         System.out.println(n + " is not prime.");
        //     }
        // }
        // input.close();
        factorize(362);
        factorize(209);
    }
}