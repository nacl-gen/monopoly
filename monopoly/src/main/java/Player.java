public class Player {
    private String name;
    protected Piece piece;

    public Player(String name) {
        this.name = name;
       this.piece = Piece.takePiece();
    }

    public void takeTurn(){

    }

}
