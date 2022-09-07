package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PosibleDigitTest {
    @Test
    public void sholdReturnAllThePosibleDigits(){
        String strin1 = " _ ";
        String strin2 = "| |";
        String strin3 = "|_|";
        String[] stringInput = {strin1, strin2, strin3};
        Input input = new Input(stringInput);
        PosibleDigits posibles = new PosibleDigits();
        ArrayList<Integer> expectedDigit1 = new ArrayList<Integer>();
        expectedDigit1.add(0);
        expectedDigit1.add(8);
        ArrayList<ArrayList> expectedPosiblesDigits = new ArrayList<ArrayList>();
        expectedPosiblesDigits.add(expectedDigit1);
        assertEquals(expectedPosiblesDigits, posibles.getList(input.getDigits()));
    }
}
