package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.print.DocFlavor.STRING;

import org.junit.Test;

public class VerifyAccountTest {
    @Test
    public void shouldGetStatusAccount() {
        String valid = "123456789";
        VerifyAccount validAccount = new VerifyAccount();
        String inputValid = validAccount.getStatusAccount(valid);
        assertEquals("", inputValid);

        String invalid = "123?56789";
        VerifyAccount invalidAccount = new VerifyAccount();
        String inputInvalid = invalidAccount.getStatusAccount(invalid);
        assertEquals(" ILL", inputInvalid);

        String wrong = "723456789";
        VerifyAccount wrongAccount = new VerifyAccount();
        String inputWrong = wrongAccount.getStatusAccount(wrong);
        assertEquals(" ERR", inputWrong);
    }
}
