package Die;

import Player.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PieceTest {
    private Player[] players = new Player[8];


    void createSomePlayer() {
        for (int i = 0; i < 8; ++i) {
            players[i] = new Player("player" + i);
        }
    }

    @Test
    void takeAndReleasePiece() {

        Player p = new Player("test");
        p.releasePiece();

        assertNull(p.getPiece());
    }

    @Test
    void cannotTakeAPieceIfAlreadyTaken() {
        createSomePlayer();
        for (int i = 0; i < 8; i++) {
            assertNotNull(players[i].getPiece());
        }
        Player player = new Player("playerOverflow");
        assertNull(player.getPiece());

        for (int i = 0; i < 8; i++) {
            players[i].releasePiece();
        }
    }

    @Test
    void pieceShouldStartOnGo() {

        Piece p = Piece.takePiece();

        Assertions.assertEquals(p.getLocation().getName(), "Go");

        Piece.release(p);
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

    /*realease all piece after test*/
    @AfterEach
    void realeasePieces() {
        Piece.releaseAll();
    }
}