package jalau.at18.katas.bankocr.fernanda;

import java.util.Arrays;

import org.junit.Test;

public class NextDigitTest {
    @Test
    public void testGetNextDigit() {
        NextDigit nextDigit = new NextDigit();
        char[][] first = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                          {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', '|', '_', '|', '|', '_', ' ', '|', '_', '|'},
                          {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', '|', '_', '|'}};
        char[][] nextDigitt = nextDigit.getNextDigit(first, 0);
        char[][] expected = {{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        Arrays.deepEquals(expected, nextDigitt);
    }
}
