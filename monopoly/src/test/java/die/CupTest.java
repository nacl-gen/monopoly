package die;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {


    @Test
    void CupCanReturnAllValueBetweenTwoAndTwelve() {
        Cup cup = Cup.getInstance();
        boolean[] hasBeenReturn = new boolean[11];
        for (int i = 0; i < 1000000; i++) {
            cup.roll();
            if (cup.getTotal() > 12) {
                fail("cup has return a values > 12");
            } else {
                hasBeenReturn[cup.getTotal() - 2] = true;
            }
        }

        for (int i = 0; i < 10; i++) {
            assertTrue(hasBeenReturn[i], "cup never return value" + (i + 2));
        }
    }
}