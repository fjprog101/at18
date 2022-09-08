package jalau.at18.katas.rodrigov;
import org.junit.Test;

import jalau.at18.katas.bankocr.rodrigov.AccountVerification;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
public class AccountVerificationTest {
    
    @Test
    public void shouldVerificateCheckSum() throws FileNotFoundException{

        AccountVerification accountVerification = new AccountVerification();
        String[] input = {"0","0","0","0","0","0","0","5","1"};
        int expected = 11;
        accountVerification.setAccountNumber(input);
        int result = accountVerification.checkSum();
        assertEquals(expected, result);
    }
}
