package jalau.at18.katas.bankocr.mauricio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.katas.bankocr.mauricio.Checksum;

public class ChecksumTest {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int nine = 9;

    @Test
    public void checksumFulfilled(){
        Checksum checksum = new Checksum();
        int[] listNumbers = {three, four, five, eight, eight, two, eight, six, five};
        assertTrue(checksum.calculationChecksum(listNumbers));
    }

    @Test
    public void checksumNotFulfilled(){
        Checksum checksum = new Checksum();
        int[] listNumbers = {three, four, five, eight, eight, two, eight, six, six};
        assertFalse(checksum.calculationChecksum(listNumbers));
    }
}
