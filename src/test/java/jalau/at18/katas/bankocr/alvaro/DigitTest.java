package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DigitTest {
    @Test
    public void itShouldReturnNumberZero() {
        char[][]matrix = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        Digit digit = new Digit(matrix);
        assertEquals(0, digit.convertToNumber());
    }

}
