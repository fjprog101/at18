package jalau.at18.katas.rodrigov;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.io.FileNotFoundException;
import org.junit.Test;
import jalau.at18.katas.bankocr.rodrigov.CheckSum;
public class CheckSumTest {
    @Test
    public void shouldVerificateCheckSum() throws FileNotFoundException{
        CheckSum checkSum = new CheckSum();
        checkSum.setNumberSum(11);
        assertTrue(checkSum.verificateCheckSum());
    }

    @Test
    public void shouldVerificateNegativeCheckSum() throws FileNotFoundException{
        CheckSum checkSum = new CheckSum();
        checkSum.setNumberSum(7);
        assertFalse(checkSum.verificateCheckSum());
    }
    /*@Test
    public void shouldVerificateNegativeCheckSum() throws FileNotFoundException{
        CheckSum checkSum = new CheckSum();
        AccountVerification accountVerification = new AccountVerification();
        String[] input = {"0","0","0","0","0","0","0","2","1"};
        accountVerification.setAccountNumber(input);
        
        System.out.println(accountVerification.checkSum());
        System.out.println(checkSum.verificateCheckSum());
        //assertTrue(checkSum.verificateCheckSum());
    }*/
}
