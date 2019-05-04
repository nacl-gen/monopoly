package player;

import board.Board;
import board.squares.Square;
import die.Cup;

/**
 * Class player.Player
 *
 * Represents a player.Player in the Monopoly Game
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class Player {
    private String name;
    protected Piece piece;
    private int cash;

    /**
     * Constructor
     *
     * @param name the player's name
     */
    public Player(String name) {
        this.name = name;
        this.piece = Piece.takePiece();
    }

    @Override
    public String toString() {
        return name;
    }

    /**
     * take a turn in the game, throw both dice with the cup and move the player.Player's player.Piece to the right destination
     */
    public void takeTurn() {
        // get the cup instance
        Cup cup = Cup.getInstance();
        // roll the dice
        cup.roll();
        // take the total
        int total = cup.getTotal();

        System.out.println(name + " got a " + cup.getDice()[0].getFaceValue() + " and a " + cup.getDice()[1].getFaceValue());

        Square oldLocation = piece.getLocation();
        // get new location
        Square newLocation = Board.getInstance().getSquare(oldLocation, total);

        // set new location
        piece.setLocation(newLocation);

        // perform action "landedOn" on the new square
        newLocation.landedOn(this);

        System.out.println(name + " is now on : " + piece.getLocation().getName() + "\n");
    }

    /**
     * release the player.Player's player.Piece (make it available)
     */
    public void releasePiece() {
        Piece.release(this.piece);

        piece = null;
    }

    /**
     * @return the player.Player's player.Piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Give cash to the player.Player
     *
     * @param cash the amount to give
     */
    public void addCash(int cash) {
        this.cash += cash;
    }

    /**
     * Take cash from the player.Player
     *
     * @param cash the amount we want to take
     * @return true if the player's amount was enough to pay
     */
    public boolean reduceCash(int cash) {
        if (this.cash > cash) {
            this.cash -= cash;
            return true;
        } else {
            return false;
        }

    }

    /**
     * @return the player's cash amount
     */
    public int getNetWorth() {
        return cash;
    }
}
