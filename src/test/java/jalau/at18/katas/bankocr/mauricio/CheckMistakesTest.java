package jalau.at18.katas.bankocr.mauricio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CheckMistakesTest {
    final int one = 1;
    final int two = 2;
    final int three = 3;
    final int four = 4;
    final int five = 5;
    final int six = 6;
    final int seven = 7;
    final int eight = 8;
    final int nine = 9;
    private int[] listNumbers = {one, two, three, four, five, six, seven, eight, four};

    @Test
    public void checkChecksumAndIllegibleMistakes(){
        IllegibleOrNotChecksumAccount checkIll = new IllegibleOrNotChecksumAccount();
        String listNumbersStr = String.valueOf(listNumbers[0]) + "" 
        + String.valueOf(listNumbers[one])+ "" 
        + String.valueOf(listNumbers[two]) + "" 
        + String.valueOf(listNumbers[three])+ "" 
        + String.valueOf(listNumbers[four]) + ""
        + String.valueOf(listNumbers[five]) + ""
        + String.valueOf(listNumbers[six]) + ""
        + String.valueOf(listNumbers[seven]) + ""
        + String.valueOf(listNumbers[eight]) + " ERR";
        assertEquals(checkIll.checkMistakes(listNumbers), listNumbersStr);

    }
}
