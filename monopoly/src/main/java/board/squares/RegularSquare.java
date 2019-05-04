package board.squares;

import player.Player;

/**
 * Class board.squares.RegularSquare
 * <p>
 * Represents a Regular board.squares.Square of the board.Board (does nothing on land)
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class RegularSquare extends Square {

    /**
     * Constructor
     *
     * @param name   the name of the board.squares.Square
     * @param number the number of the board.squares.Square
     */
    public RegularSquare(String name, int number) {
        super(name, number);
    }

    @Override
    public void landedOn(Player player) {
        // do nothing
    }
}
