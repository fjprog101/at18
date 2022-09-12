package jalau.at18.katas.bankocr.sarai;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidChecksumTest {
    @Test
    public void if_is_a_valid_number() {
        String [] firstEntry = {"    _  _     _  _  _  _  _ ",
                                "  | _| _||_||_ |_   ||_||_|",
                                "  ||_  _|  | _||_|  ||_| _|"};
        DigitCharacter firstNumber = new DigitCharacter(firstEntry);
        String accountNum = firstNumber.getfinalAcount(""); //"123456789"
        ValidChecksum nn = new ValidChecksum(accountNum);
        assertEquals(0, nn.valid());
        assertTrue(nn.validnumber());
    }
    @Test
    public void if_is_a_valid_number2() {
        String [] firstEntry = {" _     _  _  _  _  _  _  _ ",
                                " _||_||_ |_||_| _||_||_ |_ ",
                                " _|  | _||_||_||_ |_||_| _|"};
        DigitCharacter firstNumber = new DigitCharacter(firstEntry);
        String accountNum = firstNumber.getfinalAcount(""); //"345882865"
        ValidChecksum nn = new ValidChecksum(accountNum);
        assertEquals(0, nn.valid());
        assertTrue(nn.validnumber());
    }
}
