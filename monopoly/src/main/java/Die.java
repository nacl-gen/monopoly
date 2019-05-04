import java.util.Random;

/**
 * Class Die
 *
 * Represents a 6 faces Die
 *
 * @author Christoph Rouff soit Rueff, Alexandre Gabrielli, Tiago Povoa
 * @version 1.0
 */
public class Die {
    // upper face of the Die (the one we see on top when it has been rolled)
    protected int faceValue;

    // Random generator
    private final static Random rand = new Random(System.currentTimeMillis());

    /**
     * Constructor
     *
     * Rolls the Die on creation
     */
    Die() {
        roll();
    }

    /**
     * Rolls the Die, sets a new random face value (int between 1 and 6)
     */
    public void roll() {
        faceValue = rand.nextInt(6) + 1;
    }

    /**
     * @return the face value
     */
    public int getFaceValue() {
        return faceValue;
    }
}
