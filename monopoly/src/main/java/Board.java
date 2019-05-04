/**
 * Class Board
 *
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
        // Income Tax Square
        squares[4] = new IncomeTaxSquare();
        // Jail Square
        squares[9] = JailSquare.createJailSquare(9);
        // Go To Jail Square
        squares[29] = new GoToJailSquare();

        for (int i = 1; i < 40; ++i) {
            if (i != 4 && i != 9 && i != 29) {
                squares[i] = new RegularSquare("Square " + i, i);
            }
        }
    }

    /**
     * @return Board instance
     */
    public static Board getInstance() {

        if (instance == null) {
            instance = new Board();
        }

        return instance;
    }

    /**
     * @param number of the Square
     * @return the Square with the given number
     */
    public Square getSquare(int number) {
        return squares[number];
    }

    /**
     * @param oldLocation the old Square where the Piece was located
     * @param advancement the advancement of the Piece
     * @return the new Square computed from the old Square + advancement
     */
    public Square getSquare(Square oldLocation, int advancement) {
        return squares[(oldLocation.getNumber() + advancement) % 40];
    }
}
