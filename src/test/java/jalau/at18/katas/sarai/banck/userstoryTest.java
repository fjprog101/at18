package jalau.at18.katas.sarai.banck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import jalau.at18.katas.bankocr.sarai.Userstory1;

public class userstoryTest {

    @Test
    public void acrossNumbersEnumZerro() {
        String[][] numzero = {
            {" ","_"," "},
            {"|"," ","|"},
            {"|","_","|"} };
            Userstory1 storyzero = new Userstory1(numzero);// envio numzero
        assertEquals(0, storyzero.getrecorrer());
    }
    @Test
    public void acrossNumbersEnumThree() {
        String[][] numthree = {
            {" ","_"," "},
            {" ","_","|"},
            {" ","_","|"} };
            Userstory1 storythree = new Userstory1(numthree);// envio numthree
        assertEquals(3,storythree.getrecorrer());
    }

}
