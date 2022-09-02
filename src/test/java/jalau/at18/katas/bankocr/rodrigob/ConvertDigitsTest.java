package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertDigitsTest {
    char[][] input = {{' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                         {' ', ' ', '|', ' ', '_', '|', ' ', '_', '|', '|', '_', '|', '|', '_', ' ', '|', '_', ' ', ' ', ' ', '|', '|', '_', '|', '|', '_', '|'},
                         {' ', ' ', '|', '|', '_', ' ', ' ', '_', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', ' ', ' ', '|', '|', '_', '|', ' ', '_', '|'}
                        };

    @Test
    public void shouldWriteDigits() {
        ConvertDigits writterDigits = new ConvertDigits();
        String output = writterDigits.writeDigits(input);
        assertEquals("123456789", output);
    }
    @Test
    public void shouldParse() {
        char[][] out = new char[3][27];
        String accountNumbers = "";
        ConvertDigits convertDigitsParse = new ConvertDigits();
        String accountExpected = convertDigitsParse.parserDigit(out, accountNumbers, input);
        assertEquals("123456789", accountExpected);
    }
}
