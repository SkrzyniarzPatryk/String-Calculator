import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void expectedResultTesting() {
        Assertions.assertEquals(0, Main.Add(""));
        Assertions.assertEquals(2, Main.Add("2"));
        Assertions.assertEquals(6, Main.Add("2,4"));
        Assertions.assertEquals(35, Main.Add("2,4,10,19"));
        Assertions.assertEquals(32, Main.Add("//;\n2;1;10;19"));
        Assertions.assertEquals(13, Main.Add("//plus\n2plus1plus10"));
    }

//    @Test
//    void expectedExceptionTesting() {
//        assertThrows(NumberFormatException.class, () -> Main.Add("3,\n"));
//    }


}