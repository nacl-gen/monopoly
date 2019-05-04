package board.squares;

import player.Player;

/**
 * Class board.squares.Square (abstract)
 * <p>
 * Represents an abstract board.squares.Square of the board.Board
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public abstract class Square {
    private String name;
    private int number;

    /**
     * Constructor
     *
     * @param name   the name of the board.squares.Square
     * @param number the number of the board.squares.Square
     */
    public Square(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * @return the name of the board.squares.Square
     */
    public String getName() {
        return name;
    }

    /**
     * @return the number of the board.squares.Square
     */
    public int getNumber() {
        return number;
    }

    /**
     * Define the action to take when a player lands on the board.squares.Square
     *
     * @param player the player to take action on
     */
    public abstract void landedOn(Player player);
}

