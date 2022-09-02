package jalau.at18.katas.bankocr.fernanda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChecksumTest {
    @Test
    public void testCheckNumberIsValid() {
        Checksum checksum = new Checksum();
        int numberToValidate = 412039384; 
        assertTrue(checksum.checkNumberIsValid(numberToValidate));
        Checksum checksumF = new Checksum();
        int numberToValidateF = 411377968; 
        assertFalse(checksumF.checkNumberIsValid(numberToValidateF));

    }

    @Test
    public void testGetMultiplicationOfNumber() {
        Checksum checksum = new Checksum();
        int numberToValidate = 412039384; 
        int expected = 162993600;
        int actual = checksum.getMultiplicationOfNumber(numberToValidate);
        assertEquals(expected, actual);
    }
}
