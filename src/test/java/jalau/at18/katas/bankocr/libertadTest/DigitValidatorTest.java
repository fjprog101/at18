package jalau.at18.katas.bankocr.libertadTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.DigitValidator;

public class DigitValidatorTest {
    @Test
    public void isIntheRank() {
        String[] input = {" _ ",
                          "| |",
                          "|_|"};
        DigitValidator DigitValidator = new DigitValidator();
        assertEquals(true, DigitValidator.existInTheRank(input));
    }
    @Test
    public void compareNumberThatExist() {
        String[] numberString = {" _ ",
                                 "| |",
                                 "|_|"};
        String[] input = {" _ ",
                          "| |",
                          "|_|"};
        DigitValidator DigitValidator = new DigitValidator();
        assertEquals(true, DigitValidator.compare(numberString, input));
    }
    @Test
    public void compareNumberThatNotExist() {
        String[] numberString = {" _ ",
                                 "| |",
                                 "|_|"};
        String[] input = {" _ ",
                          "|  ",
                          "|_ "};
        DigitValidator DigitValidator = new DigitValidator();
        assertEquals(false, DigitValidator.compare(numberString, input));
    }
}