package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VerifyCheckSumTest {
    @Test
    public void shouldVerifyCheckSumNumber() {
        String checkSumValid = "123456789";
        VerifyCheckSum validCheckSum = new VerifyCheckSum();
        String valid = validCheckSum.checkSumValid(checkSumValid);
        assertEquals("",valid);

        String checkSumInvalid = "123456788";
        VerifyCheckSum invalidCheckSum = new VerifyCheckSum();
        String invalid = invalidCheckSum.checkSumValid(checkSumInvalid);
        assertEquals("ERR",invalid);

    }
    @Test
    public void shouldConvertCheckSumNumber() {
        String CheckSum = "123456789";
        int[] CheckSumNumberExpected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        VerifyCheckSum convertCheckSum = new VerifyCheckSum();
        int[] CheckSumNumber = convertCheckSum.convertCheckSumNumber(CheckSum);
        assertArrayEquals(CheckSumNumberExpected, CheckSumNumber);
    }
    @Test
    public void shouldGetCheckResult() {
        int[] CheckSumNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        VerifyCheckSum getCheckResult = new VerifyCheckSum();
        getCheckResult.checkSumResult(CheckSumNumber);
        int checkResultExpected = 165;
        assertEquals(checkResultExpected, getCheckResult.getCheckResult());
    }
}
