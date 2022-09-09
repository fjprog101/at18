package jalau.at18.katas.bankocr.libertadTest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.Digit;

public class DigitTest {
    @Test
    public void getRepresentationDigit() {
        String[] expected = {" _ ",
                             "| |",
                             "|_|"};
        assertArrayEquals(expected,Digit.ZERO.getRepresentation());
    }
    @Test
    public void getIntValueDigit() {
        int expected = 0;
        assertEquals(expected,Digit.ZERO.getValue());
    }
    @Test
    public void hasNextDigit() {
        assertEquals(false,Digit.NINE.hasNext());
        assertEquals(true,Digit.ZERO.hasNext());
    }
    @Test
    public void getNextDigit() {
        assertEquals(null,Digit.NINE.getNextDigit());
        assertEquals(Digit.ONE,Digit.ZERO.getNextDigit());
        assertEquals(Digit.TWO,Digit.ONE.getNextDigit());
        assertEquals(Digit.SEVEN,Digit.SIX.getNextDigit());
        assertEquals(Digit.EIGTH,Digit.SEVEN.getNextDigit());
    }
}
