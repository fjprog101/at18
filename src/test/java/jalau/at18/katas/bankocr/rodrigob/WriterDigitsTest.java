package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WriterDigitsTest {

    @Test
    public void shouldReturnOne() {
        char[][] one = {{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        WriterDigits writerOne = new WriterDigits(one);
        String expected = writerOne.compareDigits(DigitValue.ONE.getValue() , one);
        assertEquals("1", expected);
    }
}
