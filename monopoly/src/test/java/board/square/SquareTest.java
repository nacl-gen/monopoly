package board.square;

import org.junit.jupiter.api.Test;
import board.square.RegularSquare;
import board.square.Square;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void getNameWorks() {
        Square s = new RegularSquare("board.square.Square 1", 1);
        assertEquals(s.getName(), "board.square.Square 1");
    }

    @Test
    void getNumberWorks() {
        Square s = new RegularSquare("board.square.Square 10", 10);
        assertEquals(10, s.getNumber());
    }
}
