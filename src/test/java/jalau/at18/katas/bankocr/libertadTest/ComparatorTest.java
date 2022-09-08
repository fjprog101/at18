package jalau.at18.katas.bankocr.libertadTest;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.Comparator;

public class ComparatorTest {
    @Test
    public void compareNumberThatExist() {
        String[] numberString = {" _ ",
                                 "| |",
                                 "|_|"};
        String[] input = {" _ ",
                          "| |",
                          "|_|"};
        Comparator comparator = new Comparator();
        assertEquals(true, comparator.compare(numberString, input));
    }
    @Test
    public void compareNumberThatNotExist() {
        String[] numberString = {" _ ",
                                 "| |",
                                 "|_|"};
        String[] input = {" _ ",
                          "|  ",
                          "|_ "};
        Comparator comparator = new Comparator();
        assertEquals(false, comparator.compare(numberString, input));
    }
}
