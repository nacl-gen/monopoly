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
    void cannotTakeAPieceIfAlreadyTaken() {
        createSomePlayer();
        for (int i = 0; i < 8; i++) {
            assertNotNull(players[i].piece);
        }
        Player player = new Player("playerOverflow");
        assertNull(player.piece);
    }

    @Test
    void pieceShouldStartOnGo () {

        Piece p = Piece.takePiece();

        assertEquals(p.getLocation().getName(), "Go");
    }


}