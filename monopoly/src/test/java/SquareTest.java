import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    void getNameWorks() {
        Square s = new Square("Square 1", 1);
        assertEquals(s.getName(), "Square 1");
    }

    @Test
    void getNumberWorks() {
        Square s = new Square("Square 10", 10);
        assertEquals(10, s.getNumber());
    }
}
