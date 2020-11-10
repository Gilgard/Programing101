import java.util.Random;

public class MyRandom{
    private static Random random = new Random();

    public int nextInteger(int min, int max){
        return random.nextInt(max - min) + min;
    }
    public double nextDouble(double min,double max){
        return random.nextDouble() * (max - min) + min;
    }
}