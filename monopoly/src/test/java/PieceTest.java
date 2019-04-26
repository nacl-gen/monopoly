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
            assertNotEquals(players[i].piece, null);
        }
        Player player = new Player("playerOverflow");
        assertEquals(player.piece, null);
    }


}