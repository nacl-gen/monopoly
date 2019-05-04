/**
 * Class Square (abstract)
 *
 * Represents an abstract Square of the Board
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
     * @param name the name of the Square
     * @param number the number of the Square
     */
    public Square(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * @return the name of the Square
     */
    public String getName() {
        return name;
    }

    /**
     * @return the number of the Square
     */
    public int getNumber() {
        return number;
    }

    /**
     * Define the action to take when a player lands on the Square
     * @param player the player to take action on
     */
    public abstract void landedOn(Player player);
}

