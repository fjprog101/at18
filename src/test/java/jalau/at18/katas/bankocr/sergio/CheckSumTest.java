package jalau.at18.katas.bankocr.sergio;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CheckSumTest {
    @Test
    public void ShouldReturnIfValidAccount() throws FileNotFoundException {
        CheckSum checkSum = new CheckSum();
        List<Integer> listNumbers = new ArrayList<Integer>() {
            {
                add(3);
                add(4);
                add(5);
                add(8);
                add(8);
                add(2);
                add(8);
                add(6);
                add(5);
            }
        };
        assertTrue(checkSum.verifyCheckSum(listNumbers));
    }

    @Test
    public void ShouldReturnIfInvalidAccount() throws FileNotFoundException {
        CheckSum checkSum = new CheckSum();
        List<Integer> listNumbers = new ArrayList<Integer>() {
            {
                add(3);
                add(4);
                add(6);
                add(5);
                add(8);
                add(3);
                add(8);
                add(6);
                add(5);
            }
        };
        assertFalse(checkSum.verifyCheckSum(listNumbers));
    }
}
