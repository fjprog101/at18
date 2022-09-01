package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class NumberTest {
    @Test
    public void itShouldReturnNumberZero() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        Number number = new Number(matrix);
        number.compareNumber();
        assertEquals(0, number.getNumber());
    }
}
