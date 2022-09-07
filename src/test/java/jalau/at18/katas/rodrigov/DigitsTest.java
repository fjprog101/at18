package jalau.at18.katas.rodrigov;
import org.junit.Test;

import jalau.at18.katas.bankocr.rodrigov.Digits;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

public class DigitsTest {
    
    @Test
    public void shouldAddDigitsFirstPart(){
        List<String> expected = new ArrayList<>();
        expected.add(" _ | ||_|");
        expected.add("     |  |");
        expected.add(" _  _||_ ");
        expected.add(" _  _| _|");
        expected.add("   |_|  |");
        expected.add(" _ |_  _|");
        expected.add(" _ |_ |_|");
        expected.add(" _   |  |");
        expected.add(" _ |_||_|");
        expected.add(" _ |_| _|");
        Digits digits = new Digits();
        digits.addDigitsFirstPart();
        digits.addDigitsSecondPart();
        assertEquals(expected.toString(), digits.getListOfNumbers().toString());
    }

    @Test
    public void shouldSetListOfNumbers(){
        Digits digits = new Digits();
        List<String> expected = new ArrayList<>();
        expected.add(" _ | ||_|");
        expected.add("     |  |");
        expected.add(" _  _||_ ");
        expected.add(" _  _| _|");
        expected.add("   |_|  |");
        expected.add(" _ |_  _|");
        expected.add(" _ |_ |_|");
        expected.add(" _   |  |");
        expected.add(" _ |_||_|");
        expected.add(" _ |_| _|");
        digits.setListOfNumbers(expected);
    }
}
