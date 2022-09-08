package jalau.at18.katas.bankocr.libertad;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitValidatorTest {
    @Test
    public void isIntheRank() {
        String[] input = {" _ ",
                          "| |",
                          "|_|"};
        DigitValidator DigitValidator = new DigitValidator();
        assertEquals(true, DigitValidator.existInTheRank(input));
    }
}
