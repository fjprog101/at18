package jalau.at18.katas.daniela;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.bankocr.daniela.CheckSum;
import jalau.at18.katas.bankocr.daniela.CheckSumResult;

public class CheckSumTest {

    @Test
    public void ShouldValidTheCheckModTrue() {
        int totaldigits = 9;
        int total = 0;
        int finalresult = 0;
        int sizenumbers = 27;
        String line1 = "    _  _  _  _  _  _  _  _ ";
        String line2 = "|_||_   ||_ | ||_|| || || |";
        String line3 = "  | _|  | _||_||_||_||_||_|";
        CheckSumResult sumatory = new CheckSumResult(line1, line2, line3, totaldigits, sizenumbers);
        assertTrue(sumatory.checkSum(total, finalresult));
    }

    @Test
    public void ShouldValidTheCheckModFalse() {
        ////// 664371495
        int totaldigits = 9;
        int total = 0;
        int finalresult = 0;
        int sizenumbers = 27;
        String line1 = " _  _     _  _        _  _ ";
        String line2 = "|_ |_ |_| _|  |  ||_||_||_ ";
        String line3 = "|_||_|  | _|  |  |  |  | _|";
        CheckSumResult sumatory = new CheckSumResult(line1, line2, line3, totaldigits, sizenumbers);
        assertFalse(sumatory.checkSum(total, finalresult));
    }
}
