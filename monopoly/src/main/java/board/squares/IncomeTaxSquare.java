package board.squares;

import player.Player;

/**
 * Class board.squares.IncomeTaxSquare
 * <p>
 * Represents the Income Tax board.squares.Square of the board.Board
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class IncomeTaxSquare extends Square {

    /**
     * Constructor (has number 4 by default)
     */
    public IncomeTaxSquare() {
        super("Income Tax", 4);
    }

    @Override
    public void landedOn(Player player) {
        // get actual player's money amount
        int money = player.getNetWorth();
        // compute the amount to withdraw
        money = (int) Math.min(200, Math.floor(0.1 * money));

        // withdraw the money amount
        player.reduceCash(money);

        System.out.println(player + " gives " + money + " to the bank");
    }
}
