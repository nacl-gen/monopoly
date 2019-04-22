import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    /**
     * carfull this test have 1 chance on 10'000'000'0000 to return a "faulse
     * asset faillure" cause of unlyckiness
     */
    @Test
    void resultMustbebetwen() {
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
     * this test has little chance to product false positive
     */
    @Test
    void twoDieMustHaveDifferentSeed() {
        Die die1 = new Die();
        Die die2 = new Die();

        for (int i = 0; i < 100; i++) {
            die1.roll();
            die2.roll();
            if (die1.getFaceValue() != die2.getFaceValue()) {
                assertTrue(true);
                return;
            }
        }
        fail();
    }

}