package board;

import board.squares.*;

/**
 * Class board.Board
 * <p>
 * Represents a simplified monopoly board
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class Board {
    // board squares
    private Square[] squares = new Square[40];

    private static Board instance;

    /**
     * Constructor
     */
    private Board() {
        // Go square (start square)
        squares[0] = new GoSquare();
        // Income Tax board.squares.Square
        squares[4] = new IncomeTaxSquare();
        // Jail board.squares.Square
        squares[9] = JailSquare.createJailSquare(9);
        // Go To Jail board.squares.Square
        squares[29] = new GoToJailSquare();

        for (int i = 1; i < 40; ++i) {
            if (i != 4 && i != 9 && i != 29) {
                squares[i] = new RegularSquare("board.squares.Square " + i, i);
            }
        }
    }

    /**
     * @return board.Board instance
     */
    public static Board getInstance() {

        if (instance == null) {
            instance = new Board();
        }

        return instance;
    }

    /**
     * @param number of the board.squares.Square
     * @return the board.squares.Square with the given number
     */
    public Square getSquare(int number) {
        return squares[number];
    }

    /**
     * @param oldLocation the old board.squares.Square where the player.Piece was located
     * @param advancement the advancement of the player.Piece
     * @return the new board.squares.Square computed from the old board.squares.Square + advancement
     */
    public Square getSquare(Square oldLocation, int advancement) {
        return squares[(oldLocation.getNumber() + advancement) % 40];
    }
}
