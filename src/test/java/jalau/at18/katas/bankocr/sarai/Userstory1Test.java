package jalau.at18.katas.bankocr.sarai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Userstory1Test {
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
