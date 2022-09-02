package jalau.at18.katas.daniela;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.bankocr.daniela.CheckSum;

public class CheckSumTest {

    @Test
    public void ShouldValidTheCheckMod() {
        int totaldigits = 10;
        int value = 0;
        int total = 0;
        int finalresult = 0;
        String line1 = "    _  _  _  _  _  _  _  _ ";
        String line2 = "|_||_   ||_ | ||_|| || || |";
        String line3 = "  | _|  | _||_||_||_||_||_|";
        CheckSum sumatory = new CheckSum(line1, line2, line3, totaldigits);
        assertTrue(sumatory.checkSum(value, total, finalresult));
    }
}
