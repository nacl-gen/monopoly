package Die;


import Player.*;

import Player.Player;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {


    @Test
    void playerShouldMoveOnBoard() {

        Player player = new Player("TestPlayer");

        Cup.getInstance().getDice()[0] = new RiggedDie();
        Cup.getInstance().getDice()[1] = new RiggedDie();

        ((RiggedDie) Cup.getInstance().getDice()[0]).setFaceValue(1);
        ((RiggedDie) Cup.getInstance().getDice()[1]).setFaceValue(2);

        player.takeTurn();

        assertEquals(player.getPiece().getLocation().getNumber(), 3);

        Piece.release(player.getPiece());

    }

    @AfterEach
    void resetTheCup() {
        Cup.getInstance().getDice()[0] = new Die();
        Cup.getInstance().getDice()[1] = new Die();
    }

    @Test
    void playerCanReceiveAndSpendMoney() {

        Player player = new Player("TestPlayer");

        player.addCash(200);
        assertEquals(player.getNetWorth(), 200);
        assertFalse(player.reduceCash(300));
        assertTrue(player.reduceCash(100));
        assertEquals(player.getNetWorth(), 100);

    }


    /**
     * A Rigged Die.Die to perform tests
     */
    class RiggedDie extends Die {

        /**
         * This method allows to change the value of the face manually to rig the die
         *
         * @param faceValue
         */
        void setFaceValue(int faceValue) {
            this.faceValue = faceValue;
        }

        @Override
        public void roll() {
        }
    }

}
