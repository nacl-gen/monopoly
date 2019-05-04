public class MonopolyGame {

    private Player[] players;
    private int roundCount;

    private Board board;


    public MonopolyGame(int numberOfPlayers) throws IllegalArgumentException {
        if(numberOfPlayers < 2 || numberOfPlayers > 8) {
            throw new IllegalArgumentException("The number of players must be between 2 and 8");
        }

        this.players = new Player[numberOfPlayers];
        for(int i = 1; i <= numberOfPlayers; ++i) {
            players[i - 1] = new Player("player " + i);
        }
        this.board = Board.getInstance();
        this.roundCount = 1;
    }

    public void playGame() {
        while(roundCount <= 20) {

            System.out.println("======== Round " + roundCount + " ========\n");
            playRound();
            ++roundCount;
        }
    }

    private void playRound() {
        for (Player player: players) {
            player.takeTurn();
        }
    }

    public static void main(String[] args) {

        int numberOfPlayers = 4;

        if(args.length == 0) {

            try {
                MonopolyGame mg = new MonopolyGame(numberOfPlayers);
                mg.playGame();
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }

        } else if(args.length == 1) {
            try {
                numberOfPlayers = Integer.valueOf(args[0]);
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
