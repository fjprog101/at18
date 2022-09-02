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
        NextDigit nextDigit2 = new NextDigit();
        char[][] second = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                          {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', '|', '_', '|', '|', '_', ' ', '|', '_', '|'},
                          {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', '|', '_', '|'}};
        char[][] secDigitt = nextDigit2.getNextDigit(second, 3);
        char[][] expected2 = {{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        Arrays.deepEquals(expected2, secDigitt);
        NextDigit nextDigit3 = new NextDigit();
        char[][] third = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                          {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', '|', '_', '|', '|', '_', ' ', '|', '_', '|'},
                          {' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', '|', '_', '|'}};
        char[][] thirdDigitt = nextDigit3.getNextDigit(third, 6);
        char[][] expected3 = {{' ', '_', ' '}, {' ', '_', '|'}, {' ', '_', '|'}};
        Arrays.deepEquals(expected3, thirdDigitt);
    }
}
