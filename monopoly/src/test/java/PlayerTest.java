import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {



    @Test
    void playerShouldMoveOnBoard () {

        Player player = new Player("TestPlayer");

        RiggedDie d1 = new RiggedDie();
        RiggedDie d2 = new RiggedDie();

        d1.setFaceValue(1);
        d2.setFaceValue(2);

        Die[] dice = new Die[]{d1, d2};

        player.takeTurn(dice);

        assertEquals(player.getPiece().getLocation().getNumber(), 3);

        Piece.release(player.getPiece());

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

        @Override
        public void roll() {

        }
    }
}
