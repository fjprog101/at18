package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitTypeTest {

    @Test
    public void shouldGetValue() {
        DigitType number = DigitType.ONE;
        assertEquals(1, number.ordinal());
        number = DigitType.TWO;
        assertEquals(2, number.ordinal());
        number = DigitType.THREE;
        assertEquals(3, number.ordinal());
        number = DigitType.FOUR;
        assertEquals(4, number.ordinal());
        number = DigitType.FIVE;
        assertEquals(5, number.ordinal());
        number = DigitType.SIX;
        assertEquals(6, number.ordinal());
    }
    
}
