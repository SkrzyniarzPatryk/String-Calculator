import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {
    @Test
    void expectedResultTesting() throws Exception {
        Assertions.assertEquals(0, Main.Add(""));
        Assertions.assertEquals(2, Main.Add("2"));
        Assertions.assertEquals(6, Main.Add("2,4"));    //step 1
        Assertions.assertEquals(35, Main.Add("2,4,10,19")); //step 2
        Assertions.assertEquals(32, Main.Add("//;\n2;1;10;19"));
        Assertions.assertEquals(13, Main.Add("//plus\n2plus1plus10"));  //step 4
        Assertions.assertEquals(1000, Main.Add("1000,10001"));
        Assertions.assertEquals(0, Main.Add("1001,1002")); //step 6
    }

    @Test
    void expectedExceptionTesting() {   //step 5
        assertThrows(Exception.class, () -> Main.Add("5,1,-1,9,-81"));
    }
}