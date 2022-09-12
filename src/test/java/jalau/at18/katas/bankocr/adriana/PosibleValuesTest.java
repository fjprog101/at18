package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class PosibleValuesTest {
    @Test
    public void shouldSayHowManyChangesThereAre() {

        String strin1 = " _ ";
        String strin2 = "| |";
        String strin3 = "|_|";
        String[] stringInput = {strin1, strin2, strin3};
        Input input = new Input(stringInput);
        PosibleValues posibleValues2 = new PosibleValues();
        assertEquals(1 ,posibleValues2.getChanges(input.getDigits()[0], DigitType.EIGHT));
        assertEquals(0 ,posibleValues2.getChanges(input.getDigits()[0], DigitType.ZERO));
        assertEquals(4 ,posibleValues2.getChanges(input.getDigits()[0], DigitType.ONE));
    }

    @Test
    public void shouldGiveArrayOfPossiblesValues() {
        String[][] stringDigit = {{" ", "_", " "}, {"|", " ", "|"}, {"|", "_", "|"}};
        Digit digit = new Digit(stringDigit);
        PosibleValues posibleValues = new PosibleValues();
        ArrayList<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(0);
        expectedList.add(8);
        assertEquals(expectedList, posibleValues.getValues(digit));

        String[][] stringDigit1 = {{" ", " ", " "}, {" ", " ", "|"}, {" ", " ", "|"}};
        Digit digit1 = new Digit(stringDigit1);
        PosibleValues posibleValues1 = new PosibleValues();
        ArrayList<Integer> expectedList1 = new ArrayList<Integer>();
        expectedList1.add(1);
        expectedList1.add(7);
        assertEquals(expectedList1, posibleValues1.getValues(digit1));

        String[][] stringDigit2 = {{" ", "_", " "}, {"|", "_", " "}, {" ", "_", "|"}};
        Digit digit2 = new Digit(stringDigit2);
        PosibleValues posibleValues2 = new PosibleValues();
        ArrayList<Integer> expectedList2 = new ArrayList<Integer>();
        expectedList2.add(5);
        expectedList2.add(6);
        expectedList2.add(9);
        assertEquals(expectedList2, posibleValues2.getValues(digit2));
    }
}
