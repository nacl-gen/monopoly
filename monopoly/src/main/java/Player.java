public class Player {
    private String name;
    protected Piece piece;

    public Player(String name) {
        this.name = name;
        this.piece = Piece.takePiece();
    }

    public void takeTurn(Die[] dice, Board board) {
        int total = 0;
        for (Die die : dice) {
            die.roll();
            total += die.faceValue;
        }

    }

}
