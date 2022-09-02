package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.print.DocFlavor.STRING;

import org.junit.Test;

public class VerifyAccountTest {

    @Test
    public void shouldVerifyAccountNumber() {
        String accountValid = "123456789";
        VerifyAccount validAccount = new VerifyAccount();
        boolean valid = validAccount.isAccountValid(accountValid);
        assertTrue(valid);

        String accountInvalid = "123456788";
        VerifyAccount invalidAccount = new VerifyAccount();
        boolean invalid = invalidAccount.isAccountValid(accountInvalid);
        assertFalse(invalid);

    }
    @Test
    public void shouldConvertAccountNumber() {
        String account = "123456789";
        int[] accountNumberExpected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        VerifyAccount convertAccount = new VerifyAccount();
        int[] accountNumber = convertAccount.convertAccountNumber(account);
        assertArrayEquals(accountNumberExpected, accountNumber);
    }
    @Test
    public void shouldGetCheckResult() {
        int[] accountNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        VerifyAccount getCheckResult = new VerifyAccount();
        getCheckResult.checkResult(accountNumber);
        int checkResultExpected = 165;
        assertEquals(checkResultExpected, getCheckResult.getCheckResult());
    }

}
