import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getSquareNumber() {
        Board board = new Board();

        for (int i = 1; i < 40; ++i) {
            assertEquals("Square " + i, board.getSquare(i).getName());
        }
    }

    @Test
    void getSquareGo() {
        Board board = new Board();

        assertEquals("Go", board.getSquare(0).getName());
    }


}