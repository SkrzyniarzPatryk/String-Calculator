import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void add() {
        Assertions.assertEquals(0, Main.Add(""));
        Assertions.assertEquals(2, Main.Add("2"));
        Assertions.assertEquals(6, Main.Add("2,4"));
    }
}