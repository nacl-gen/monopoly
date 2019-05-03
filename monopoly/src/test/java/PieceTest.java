import org.junit.jupiter.api.AfterEach;
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
            assertNotNull(players[i].piece);
        }
        Player player = new Player("playerOverflow");
        assertNull(player.piece);

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

    /*realease all piece after test*/
    @AfterEach
     void realeasePieces() {
        Piece.releaseAll();
    }
}