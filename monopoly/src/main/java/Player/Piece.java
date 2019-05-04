package Player;

import board.Board;
import board.square.Square;

public enum Piece {
    DOG("Dog"),
    THIMBLE("Thimble"),
    HAT("Hat"),
    SHOES("Shoes"),
    CAR("Car"),
    IRON("Iron"),
    BOOT("Boot"),
    CAT("Cat");

    private String name;
    private Square location;
    private boolean availability = true;

    Piece(String name) {
        this.name = name;
        // Pieces start on Go which is 0
        this.location = Board.getInstance().getSquare(0);
    }

    public static Piece takePiece() {
        for (Piece piece : Piece.values()){
            if (piece.availability){
                piece.availability = false;
                return piece;
            }
        }
        return null;
    }

    public static void release(Piece piece) {
        if (piece != null) {
            piece.availability = true;
            // We have to reset the default place of the Player.Piece
            piece.setLocation(Board.getInstance().getSquare(0));
        }
    }

    public static void releaseAll() {
       for (Piece piece : Piece.values() ){
           release(piece);
       }
    }


    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name;
    }
}
