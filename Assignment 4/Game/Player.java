import java.util.Random;

public class Player {
    private final String NAME;
    private int score;
    private final Random DICE;

    //Constructor:
    public Player(String name){
        this.NAME = name;
        this.score = 0;
        this.DICE = new Random();
    }

    //Getters:
    public String getName(){
        return this.NAME;
    }
    public int getScore(){
        return this.score;
    }
    public Random getDice(){
        return this.DICE;
    }
    //Setters
    public void setScore(int score){
        this.score = score;
    }

    //Player throws the dice
    public void throwDice(){
        int value = DICE.nextInt(6) + 1;
        if(value == 1){
            this.score = 0;
        }else {
            this.score += value;
        }
    }

    //Checks if a player is finished:
    public boolean isFinished(){
        return this.score >= 100;
    }
}
