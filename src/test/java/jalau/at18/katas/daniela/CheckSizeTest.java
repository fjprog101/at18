package jalau.at18.katas.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import jalau.at18.katas.bankocr.daniela.CheckValue;

public class CheckSizeTest {

    @Test
    public void ShouldReturnTheValuesofNineDigits() {
        String line1 = "    _  _     _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|";
        String line3 = "  ||_  _|  | _||_|  ||_|  |";
        CheckValue account = new CheckValue(line1, line2, line3);
        assertTrue(account.checkThatLinehas27(line1));
        String line11 = "                          ";
        String line22 = "  | _| _||_||_ |_   ||_||_|";
        String line33 = "  ||_  _|  | _||_|  ||_|  |";
        CheckValue account1 = new CheckValue(line11, line22, line33);
        assertFalse(account1.checkThatLinehas27(line11));
    }

}
