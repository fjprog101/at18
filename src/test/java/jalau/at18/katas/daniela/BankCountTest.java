package jalau.at18.katas.daniela;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

//import jalau.at18.katas.bankocr.daniela.BankAccount;
import jalau.at18.katas.bankocr.daniela.Digit;

public class BankCountTest {

    @Test(expected = IllegalArgumentException.class)
    public void FirstLineShouldBeThree() {
        new Digit("", " ", " ");
    }

    @Test
    public void ShouldValidTheDigits() {
        String line1 = "  ";
        String line2 = " |";
        String line3 = " |";
        Digit digit = new Digit(line1, line2, line3);
        assertTrue(digit.isValid());

    }
}
