package jalau.at18.katas.bankocr.libertadTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.NumberRange;

public class NumberRangeTest {
    @Test
    public void isIntheRank() {
        String[][] input = {{" _ "},
                            {"| |"},
                            {"|_|"}};
        NumberRange numberRange = new NumberRange();
        assertEquals(true, numberRange.existInTheRank(input));
    }
    @Test
    public void compareNumberThatExist() {
        String[][] numberString = {{" _ "},
                                   {"| |"},
                                   {"|_|"}};
        String[][] input = {{" _ "},
                            {"| |"},
                            {"|_|"}};
        NumberRange numberRange = new NumberRange();
        assertEquals(true, numberRange.compare(numberString, input));
    }
    @Test
    public void compareNumberThatNotExist() {
        String[][] numberString = {{" _ "},
                                   {"| |"},
                                   {"|_|"}};
        String[][] input = {{" _ "},
                            {"|  "},
                            {"|_ "}};
        NumberRange numberRange = new NumberRange();
        assertEquals(false, numberRange.compare(numberString, input));
    }
}
