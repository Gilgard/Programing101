public class Game {
    public static void main(String[] args) {
        Player player1 = new Player("Alida");
        Player player2 = new Player("Kristoffer");
        int rounds = 0;

        while (!player1.isFinished() && !player2.isFinished()){
            rounds ++;
            player1.throwDice();
            player2.throwDice();
            System.out.println("Round: " + rounds + "\n" + player1.getName() + ": " + player1.getScore() + "\n" + player2.getName() + ": " + player2.getScore());
        }
        String winner = "Nobody";
        if (player1.isFinished()){
            winner = player1.getName();
        }else {
            winner = player2.getName();
        }
        System.out.println("\n\n" + winner + " has won the game!");
    }
}
