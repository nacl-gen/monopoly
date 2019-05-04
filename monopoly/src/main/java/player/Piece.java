package player;

import board.Board;
import board.squares.Square;

/**
 * Enum player.Piece
 *
 * Represents the playable pieces
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
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
    // piece availability
    private boolean availability = true;

    /**
     * Constructor
     * @param name the name of the player.Piece
     */
    Piece(String name) {
        this.name = name;
        // Pieces start on Go which is 0
        this.location = Board.getInstance().getSquare(0);
    }

    /**
     * @return the next available player.Piece, or null if they are all taken
     */
    public static Piece takePiece() {
        for (Piece piece : Piece.values()) {
            if (piece.availability) {
                piece.availability = false;
                return piece;
            }
        }
        return null;
    }

    /**
     * release the piece to set it available again
     * @param piece the piece to set available
     */
    public static void release(Piece piece) {
        if (piece != null) {
            piece.availability = true;
            // we have to reset the default place of the player.Piece
            piece.setLocation(Board.getInstance().getSquare(0));
        }
    }

    /**
     * release all Pieces
     */
    public static void releaseAll() {
        for (Piece piece : Piece.values()) {
            release(piece);
        }
    }

    /**
     * set the location of the player.Piece on the board.Board
     * @param location the location to set the player.Piece
     */
    public void setLocation(Square location) {
        this.location = location;
    }

    /**
     * @return the player.Piece's current location (board.squares.Square)
     */
    public Square getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name;
    }
}
