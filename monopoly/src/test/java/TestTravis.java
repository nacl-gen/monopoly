import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestTravis {

    public void simpleTest() {
        Travis t = new Travis();
        Assertions.assertTrue(t.returTrue());
    }
}
