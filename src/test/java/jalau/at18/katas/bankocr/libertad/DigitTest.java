package jalau.at18.katas.bankocr.libertad;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitTest {
    @Test
    public void getRepresentationDigit() {
        String[] expected = {" _ ",
                             "| |",
                             "|_|"};
        assertArrayEquals(expected,Digit.ZERO.getRepresentation());
    }
    @Test
    public void hasNextDigit() {
        assertEquals(false,Digit.NINE.hasNext());
        assertEquals(true,Digit.ZERO.hasNext());
    }
    @Test
    public void getNextDigit() {
        assertEquals(null,Digit.NINE.getNext());
        assertEquals(Digit.ONE,Digit.ZERO.getNext());
        assertEquals(Digit.TWO,Digit.ONE.getNext());
        assertEquals(Digit.SEVEN,Digit.SIX.getNext());
        assertEquals(Digit.EIGTH,Digit.SEVEN.getNext());
    }
}
