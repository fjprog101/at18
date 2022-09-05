package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SplitInputTest {

    @Test
    public void shouldReturnOneDigit() {
        SplitInput splitInput = new SplitInput();
        char[][] out1 = splitInput.splitOneDigit(inputConverted());
        assertArrayEquals(DigitValue.ONE.getValue(), out1);
        char[][] out2 = splitInput.splitOneDigit(inputConverted());
        assertArrayEquals(DigitValue.TWO.getValue(), out2);

    }

    public char[][] inputConverted(){
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";
        ConvertInput convertInput = new ConvertInput(line1, line2, line3);
        char[][] actual = convertInput.getInputConverted(line1, line2, line3);
        return actual;
    }
}
