/**
 * Class RegularSquare
 *
 * Represents a Regular Square of the Board (does nothing on land)
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class RegularSquare extends Square {

    /**
     * Constructor
     *
     * @param name   the name of the Square
     * @param number the number of the Square
     */
    public RegularSquare(String name, int number) {
        super(name, number);
    }

    @Override
    public void landedOn(Player player) {
        // do nothing
    }
}
