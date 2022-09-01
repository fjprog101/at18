package jalau.at18.katas.bankocr.libertadTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.Digit;

public class DigitTest {
    @Test
    public void createDigit() {
        String[][] input = {{" _ "},
                            {"| |"},
                            {"|_|"}};
        char value = '0';
        Digit digit = new Digit(value,input);
        assertEquals('0', digit.getValue());
    }
}
