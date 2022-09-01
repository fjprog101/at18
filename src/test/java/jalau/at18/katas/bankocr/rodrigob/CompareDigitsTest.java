package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareDigitsTest {

    @Test
    public void digitShouldChange() {
        char[][] one = {{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        CompareDigits compareOne = new CompareDigits(one);
        compareOne.compareAllDigits(one);
        assertEquals("1", compareOne.getDigit());

        char[][] two = {{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        CompareDigits compareTwo = new CompareDigits(two);
        compareTwo.compareAllDigits(two);
        assertEquals("2", compareTwo.getDigit());
    }

}
