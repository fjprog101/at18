package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class PosibleDigitTest {
    @Test
    public void sholdReturnAllThePosibleDigits(){
        String strin1 = " _          ";
        String strin2 = "| |  |    _|";
        String strin3 = "|_|  |  |  |";
        String[] stringInput = {strin1, strin2, strin3};
        Input input = new Input(stringInput);
        PossibleDigits posibles = new PossibleDigits();

        ArrayList<Integer> expectedDigit1 = new ArrayList<Integer>();
        expectedDigit1.add(0);
        expectedDigit1.add(8);

        ArrayList<Integer> expectedDigit2 = new ArrayList<Integer>();
        expectedDigit2.add(1);
        expectedDigit2.add(7);

        ArrayList<Integer> expectedDigit3 = new ArrayList<Integer>();
        expectedDigit3.add(1);

        ArrayList<Integer> expectedDigit4 = new ArrayList<Integer>();
        expectedDigit4.add(1);
        expectedDigit4.add(4);

        ArrayList<ArrayList> expectedPosiblesDigits = new ArrayList<ArrayList>();
        expectedPosiblesDigits.add(expectedDigit1);
        expectedPosiblesDigits.add(expectedDigit2);
        expectedPosiblesDigits.add(expectedDigit3);
        expectedPosiblesDigits.add(expectedDigit4);
        assertEquals(expectedPosiblesDigits, posibles.getList(input.getDigits()));
    }
}
