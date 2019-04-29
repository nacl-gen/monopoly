public class MonopolyGame {

    private Player[] players;
    private int roundCount;

    private Die[] dice;
    private Board board;


    public MonopolyGame(int numberOfPlayers) throws IllegalArgumentException {
        if(numberOfPlayers < 2 || numberOfPlayers > 8) {
            throw new IllegalArgumentException("The number of players must be between 2 and 8");
        }

        this.players = new Player[numberOfPlayers];
        for(int i = 0; i < numberOfPlayers; ++i) {
            players[i] = new Player("player " + i);
        }

        this.dice = new Die[]{new Die(), new Die()};
        this.board = Board.getInstance();
        this.roundCount = 0;
    }

    public void playGame() {
        while(roundCount < 20) {
            playRound();
            ++roundCount;
        }
    }

    private void playRound() {
        for (Player player: players) {
            player.takeTurn(dice, board);
        }
    }
}
