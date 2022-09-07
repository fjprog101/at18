package jalau.at18.katas.bankocr.alvaro;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;
public class SplitNumberTest {

    @Test
    public void itShouldReturnNumbers() {
        String[] inputData = {"                           ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "|  |  |  |  |  |  |  |  |  ",
                         "                           "};
        SplitNumber split = new SplitNumber(inputData);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        numbers.add(1);
        assertEquals(numbers, split.getNumbers());
    }

}
