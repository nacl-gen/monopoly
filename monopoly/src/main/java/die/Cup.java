package die;

/**
 * Class die.Cup
 *
 * Represents a die.Cup of 2 Dice
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class Cup {
    // dice array
    private Die[] dice;
    private static Cup instance;

    /**
     * Constructor
     */
    private Cup() {
        int sizeOfCup = 2;
        dice = new Die[sizeOfCup];
        for (int i = 0; i < sizeOfCup; i++) {
            dice[i] = new Die();
        }
    }

    /**
     * @return the die.Cup instance
     */
    static public Cup getInstance() {
        if (instance == null) {
            instance = new Cup();
        }
        return instance;
    }

    /**
     * Roll both dice
     */
    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    /**
     * @return the sum of the dice
     */
    public int getTotal() {
        int result = 0;
        for (Die die : dice) {
            result += die.getFaceValue();
        }
        return result;
    }

    /**
     * @return the dice
     */
    public Die[] getDice() {
        return dice;
    }
}
