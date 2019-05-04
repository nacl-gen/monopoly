package board.squares;

/**
 * Class board.squares.JailSquare
 * <p>
 * Represents the Jail board.squares.Square of the board.Board
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class JailSquare extends RegularSquare {
    private static JailSquare instance;

    /**
     * Constructor
     *
     * @param number the Jail board.squares.Square number on the board.Board
     */
    private JailSquare(int number) {
        super("Jail", number);
    }

    /**
     * @return the board.squares.JailSquare instance
     */
    public static JailSquare getInstance() {
        if (instance == null) {
            throw new NullPointerException("square number not initialise for Jail");
        } else {
            return instance;
        }
    }

    /**
     * @param number the Jail board.squares.Square number on the board.Board
     * @return a new board.squares.JailSquare instance
     */
    public static Square createJailSquare(int number) {
        instance = new JailSquare(number);

        return instance;
    }
}
