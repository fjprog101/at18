package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class NumberTest {
    @Test
    public void itShouldGetNumber() {
        char[][]zero = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        Number number = new Number(zero, 0);
        assertEquals(0, number.getNumber());
        assertArrayEquals(zero, number.getData());
    }
}
