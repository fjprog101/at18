package jalau.at18.katas.rodrigov;
import org.junit.Test;

import jalau.at18.katas.bankocr.rodrigov.CompareNumbers;
import jalau.at18.katas.bankocr.rodrigov.Digits;
import jalau.at18.katas.bankocr.rodrigov.SplitDigit;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

public class CompareNumbersTest {
    
    @Test
    public void shouldShowAccountNumber() throws FileNotFoundException{
        Digits digits = new Digits();
        SplitDigit splitDigit = new SplitDigit();
        CompareNumbers compareNumbers = new CompareNumbers(digits.getListOfNumbers(), splitDigit.getDigits());
        splitDigit.splitNumbers();
        digits.addDigitsFirstPart();
        digits.addDigitsSecondPart();
        String expeted = "490067715";
        assertEquals(expeted, compareNumbers.showAccountNumber());
    }
}
