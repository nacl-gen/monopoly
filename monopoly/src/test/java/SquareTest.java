import board.squares.RegularSquare;
import board.squares.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void getNameWorks() {
        Square s = new RegularSquare("board.squares.Square 1", 1);
        assertEquals(s.getName(), "board.squares.Square 1");
    }

    @Test
    void getNumberWorks() {
        Square s = new RegularSquare("board.squares.Square 10", 10);
        assertEquals(10, s.getNumber());
    }
}
