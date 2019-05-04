/**
 * Class GoSquare
 *
 * Represents the Go Square of the Board
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class GoSquare extends Square {

    /**
     * Constructor (has number 0 by default)
     */
    public GoSquare() {
        super("Go", 0);
    }

    @Override
    public void landedOn(Player player) {
        int income = 200;
        // add 200 to the player money amount
        player.addCash(income);
        System.out.println(player + " receives " + income + " from the bank");
    }
}
