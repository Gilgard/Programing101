public class TestMyRandom {
    public static void main(String[] args) {
        MyRandom rand = new MyRandom();
        int numerOfTests = 100_000;
        String result = "All of the "+ numerOfTests +" random numbers were within the given bounds!";

        for (int i = 0; i <= numerOfTests; i++){
            double randomDouble = rand.nextDouble(2,5);
            double randomInt = rand.nextInteger(1,7);
            if(randomDouble < 2 || randomDouble >= 5){
                throw new IndexOutOfBoundsException("Random double is faulty!");
            }
            if(randomInt < 1 || randomInt >= 7){
                throw new IndexOutOfBoundsException("Random integer is faulty!");
            }
        }
        System.out.println(result);

        System.out.println("PresentationClient for MyRandom:");

        for(int i = 0; i <= 10; i++){
            System.out.println(rand.nextInteger(2, 5));
        }
        for(int i = 0; i <= 10; i++){
            System.out.println(rand.nextDouble(1, 3));
        }
    }
}
