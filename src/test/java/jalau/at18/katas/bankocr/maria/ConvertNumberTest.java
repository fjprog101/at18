package jalau.at18.katas.bankocr.maria;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertNumberTest {
    @Test
    public void convertZero() {
        ConvertNumber convertNumber = new ConvertNumber();
        String firsColumn   = " _ ";
        String secondColumn = "| |";
        String thirdColumn  = "|_|";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(0, number);
    }

    @Test
    public void convertOne() {
        ConvertNumber convertNumber = new ConvertNumber();
        String firsColumn   = "   ";
        String secondColumn = "  |";
        String thirdColumn  = "  |";
        int number = convertNumber.convert(firsColumn, secondColumn, thirdColumn);
        assertEquals(1, number);
    }

}
