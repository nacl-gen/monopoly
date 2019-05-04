package player;

import die.Die;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;


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

        assertEquals(p.getLocation().getName(), "Go");

        Piece.release(p);
    }

    @ParameterizedTest
    @EnumSource(Piece.class)
// passing all piece
    void allPiecesCanBeRealease(Piece piece) {
        Piece.release(piece);
        assertTrue(piece.availability);
    }

    /**
     * A Rigged die.Die to perform tests
     */
    class RiggedDie extends Die {

        /**
         * This method allows to change the value of the face manually to rig the die
         *
         * @param faceValue the value we want have
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