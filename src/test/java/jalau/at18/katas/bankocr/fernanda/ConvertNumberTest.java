package jalau.at18.katas.bankocr.fernanda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConvertNumberTest {
    @Test
    public void testConvertedNumber() {
        ConvertNumber convertNumber = new ConvertNumber();
        char[][] testNum = {
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
            {'|', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', '|', '_', '|', '|', '_', ' ', '|', '_', '|'},
            {' ', ' ', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', ' ', ' ', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', '|', '_', '|'}};
        int actual = convertNumber.convertedNumber(testNum);
        int expected = 411377968;
        assertEquals(expected,actual);
    }
}
