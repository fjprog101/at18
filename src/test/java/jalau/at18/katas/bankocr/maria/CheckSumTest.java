package jalau.at18.katas.bankocr.maria;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckSumTest {
    @Test
    public void isValidAccountNumber() {
        String account = "345882865";
        CheckSum checkSum = new CheckSum(account);
        checkSum.isValidAccountNumber();
        assertTrue(checkSum.isValidAccountNumber());
    }

    @Test
    public void isNotValidAccountNumber() {
        String account = "111111111";
        CheckSum checkSum = new CheckSum(account);
        checkSum.isValidAccountNumber();
        assertFalse(checkSum.isValidAccountNumber());
    }

}

