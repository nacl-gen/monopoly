/**
 * Class JailSquare
 *
 * Represents the Jail Square of the Board
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class JailSquare extends RegularSquare {
    private static JailSquare instance;

    /**
     * Constructor
     * @param number the Jail Square number on the Board
     */
    private JailSquare(int number) {
        super("Jail", number);
    }

    /**
     * @return the JailSquare instance
     */
    public static JailSquare getInstance() {
        if (instance == null) {
            throw new NullPointerException("square number not initialise for Jail");
        } else {
            return instance;
        }
    }

    /**
     * @param number the Jail Square number on the Board
     * @return a new JailSquare instance
     */
    public static Square createJailSquare(int number) {
        instance = new JailSquare(number);

        return instance;
    }
}
