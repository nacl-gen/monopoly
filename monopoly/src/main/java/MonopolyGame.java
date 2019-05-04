import player.Player;

/**
 * Class MonopolyGame
 *
 * Represents the Monopoly Game
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class MonopolyGame {

    // array of players
    private Player[] players;
    // round count
    private int roundCount;

    /**
     * Constructor
     * @param numberOfPlayers the number of players
     * @throws IllegalArgumentException if the number of players is invalid
     */
    public MonopolyGame(int numberOfPlayers) throws IllegalArgumentException {
        // check number of players
        if (numberOfPlayers < 2 || numberOfPlayers > 8) {
            throw new IllegalArgumentException("The number of players must be between 2 and 8");
        }

        // create new players
        this.players = new Player[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; ++i) {
            players[i] = new Player("player " + (i + 1));
            // add start money
            players[i].addCash(1500);
        }
        this.roundCount = 1;
    }

    /**
     * start the game and play 20 rounds
     */
    public void playGame() {
        while (roundCount <= 20) {
            System.out.println("======== Round " + roundCount + " ========\n");
            // play a round
            playRound();
            ++roundCount;
        }
    }

    /**
     * play a round (each player takes turn)
     */
    private void playRound() {
        for (Player player : players) {
            player.takeTurn();
        }
    }

    /**
     * main
     * @param args number of players (optional)
     */
    public static void main(String[] args) {

        // number of players (4 by default)
        int numberOfPlayers = 4;

        if (args.length == 0) {

            try {
                // start a new game with 4 players
                MonopolyGame mg = new MonopolyGame(numberOfPlayers);
                mg.playGame();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

        } else if (args.length == 1) {
            try {
                numberOfPlayers = Integer.valueOf(args[0]);
                // start a new game with number of players in argument
                MonopolyGame mg = new MonopolyGame(numberOfPlayers);
                mg.playGame();

            } catch (NumberFormatException ex) {
                System.out.println("The number of players must be an integer between 2 and 8");
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.println("Wrong number of arguments: 1 argument (number of players) or 0 (default number)");
        }
    }
}
