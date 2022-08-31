package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitTest {

    @Test
    public void shouldReturnValue() {
        Digit digitOne = new Digit();
        char[][] one = {{' ', ' ', ' '},
                        {' ', ' ', '|'},
                        {' ', ' ', '|'}};
        char expectedOne = digitOne.getNumberOne(one);
        assertEquals('1', expectedOne);
    }

}
