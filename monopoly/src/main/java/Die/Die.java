package Die;

import java.util.Random;

public class Die {
    protected int faceValue;

    //simule un aléatoire
    private final static Random rand = new Random(System.currentTimeMillis());

    Die (){
        roll();
    }

    public void roll() {
        faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
