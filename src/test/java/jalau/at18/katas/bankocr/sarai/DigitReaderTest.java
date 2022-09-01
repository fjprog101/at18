package jalau.at18.katas.bankocr.sarai;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitReaderTest {
    @Test
    public void acrossNumbersEnumZerro() {
        String[][] numzero = {
            {" ","_"," "},
            {"|"," ","|"},
            {"|","_","|"} };
            DigitReader storyzero = new DigitReader(numzero); // envio numzero
        assertEquals(0, storyzero.getrecorrer());
    }
    @Test
    public void acrossNumbersEnumThree() {
        String[][] numthree = {
            {" ","_"," "},
            {" ","_","|"},
            {" ","_","|"} };
            DigitReader storythree = new DigitReader(numthree); // envio numthree
        assertEquals(3,storythree.getrecorrer());
    }
}
