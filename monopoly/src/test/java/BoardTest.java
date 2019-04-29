import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getSquareNumberAndName() {
        Board board = Board.getInstance();

        for (int i = 1; i < 40; ++i) {
            assertEquals("Square " + i, board.getSquare(i).getName());
            assertEquals(i, board.getSquare(i).getNumber());
        }
    }

    @Test
    void getSquareGo() {
        Board board = Board.getInstance();

        assertEquals("Go", board.getSquare(0).getName());
        assertEquals(0, board.getSquare(0).getNumber());
    }

    @Test
    void getSquareNumberWithAdvancement() {
        Board board = Board.getInstance();

        Square old0 = new Square("Square 0", 0);
        Square old38 = new Square("Square 38", 38);

        // normal case
        assertEquals(board.getSquare(old0, 10).getName(), "Square 10");
        // (38 + 2) % 40 = 0 (Go)
        assertEquals(board.getSquare(old38, 2).getName(), "Go");
        // (38 + 3) % 40 = 1
        assertEquals(board.getSquare(old38, 3).getName(), "Square 1");
    }
}