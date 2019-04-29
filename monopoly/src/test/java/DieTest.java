import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    /**
     * this test can possibly fail (REALLY UNLIKELY) and return a "false
     * assert failure" if a face (1..6) is not return in it's 1000 tries because of randomness
     */
    @Test
    void resultMustBeBetween() {
        Die die = new Die();

        int i = 1;
        while (i <= 6) {
            for (int j = 0; j < 1000; j++) {
                die.roll();
                if (die.getFaceValue() == i) {
                    break;
                }
            }
            assertEquals(die.getFaceValue(), i);
            ++i;
        }
    }

    /**
     * this test can possibly fail (REALLY UNLIKELY) if the two series of 100 values are the same
     * by randomness
     */
    @Test
    void twoDieMustHaveDifferentSeed() {
        Die die1 = new Die();
        Die die2 = new Die();

        for (int i = 0; i < 100; i++) {
            die1.roll();
            die2.roll();

            if(die1.getFaceValue() != die2.getFaceValue()) {
                return;
            }
        }

        fail();
    }

    /**
     * A Rigged Die to perform tests
     */
    class RiggedDie extends Die {

        /**
         * This method allows to change the value of the face manually to rig the die
         * @param faceValue
         */
        void setFaceValue (int faceValue) {
            this.faceValue = faceValue;
        }
    }
}