import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class MonopolyGameTest {

    @Test
    void lessThanTwoPlayersThrowsException() {

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class, () -> new MonopolyGame(1)
        );

        assertEquals(ex.getMessage(), "The number of players must be between 2 and 8");
    }

    @Test
    void moreThanEightPlayersThrowsException() {

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class, () -> new MonopolyGame(9)
        );

        assertEquals(ex.getMessage(), "The number of players must be between 2 and 8");
    }
}
