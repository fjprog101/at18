package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ConvertInputTest {
    char[][] output = {{' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', ' ', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' ', ' ', '_', ' '},
                      {' ', ' ', '|', ' ', '_', '|', ' ', '_', '|', '|', '_', '|', '|', '_', ' ', '|', '_', ' ', ' ', ' ', '|', '|', '_', '|', '|', '_', '|'},
                      {' ', ' ', '|', '|', '_', ' ', ' ', '_', '|', ' ', ' ', '|', ' ', '_', '|', '|', '_', '|', ' ', ' ', '|', '|', '_', '|', ' ', '_', '|'}
                     };

    @Test
    public void shouldReturnInputConvertedToChar() {
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_| _|";
        ConvertInput convertInput = new ConvertInput(line1, line2, line3);
        convertInput.convertFirstLine(line1);
        convertInput.convertSecondtLine(line2);
        convertInput.convertThirdLine(line3);
        char[][] actual = convertInput.getInputConverted();
        assertArrayEquals(output, actual);
    }
}
