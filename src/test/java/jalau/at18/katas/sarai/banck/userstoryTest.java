package jalau.at18.katas.sarai.banck;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class userstoryTest {

    @Test
    public void acrossNumbersEnum() {
        String[][] numzero = {
            {" ","_"," "},
            {"|"," ","|"},
            {"|","_","|"}};
        assertEquals(0,getenum());


    }

}
