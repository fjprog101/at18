package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class DigitTest {

    @Test
    public void itShouldExtractFirstDigit() {
        String[] inputData = {" _  _  _     _  _  _  _  _ ",
                              "| | _| _||_||_ |_   ||_||_|",
                              "|_||_  _|  | _||_|  ||_||_|",
                              "                           "};
        Digit digit = new Digit(inputData);
        int index = 0; //itshould extract number 0
        char[][]zero = new char[][]{{' ', '_', ' '}, {'|', ' ', '|'}, {'|', '_', '|'}};
        assertArrayEquals(zero, digit.extractDigit(index));
    }
    @Test
    public void itShouldExtractSecondDigit() {
        String[] inputData = {" _  _  _     _  _  _  _  _ ",
                              "| | _| _||_||_ |_   ||_||_|",
                              "|_||_  _|  | _||_|  ||_||_|",
                              "                           "};
        Digit digit = new Digit(inputData);
        int index = 3; //itshould extract number 2
        char[][]two = new char[][]{{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        assertArrayEquals(two, digit.extractDigit(index));
    }

}
