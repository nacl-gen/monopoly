import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getSquareNumber39() {
        Board board = new Board();

        assertEquals("Square 39", board.getSquare(39).getName());
    }

    @Test
    void getSquareGo() {
        Board board = new Board();

        assertEquals("Go", board.getSquare(0).getName());
    }
}