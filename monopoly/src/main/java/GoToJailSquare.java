/**
 * Class GoToJailSquare
 *
 * Represents the Go to Jail Square of the Board
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class GoToJailSquare extends Square {

    /**
     * Constructor (has number 29 by default)
     */
    public GoToJailSquare() {
        super("Go To Jail", 29);
    }

    @Override
    public void landedOn(Player player) {
        // relocates the player to Jail
        player.getPiece().setLocation(JailSquare.getInstance());

        System.out.println(player + " goes to Jail");
    }
}
