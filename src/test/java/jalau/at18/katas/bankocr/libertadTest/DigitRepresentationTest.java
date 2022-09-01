package jalau.at18.katas.bankocr.libertadTest;
import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.katas.bankocr.libertad.DigitRepresentation;

public class DigitRepresentationTest {
    @Test
    public void getListofDigits() {
        String[][] inputZero = {{" _ "},
                                {"| |"},
                                {"|_|"}};
        String[][] inputOne = {{"   "},
                               {"  |"},
                               {"  |"}};
        String[][] inputTwo = {{" _ "},
                               {" _|"},
                               {"|_ "}};
        String[][] inputThree = {{" _ "},
                                 {" _|"},
                                 {" _|"}}; 
        String[][] inputFour = {{"   "},
                           {"|_|"},
                           {"  |"}};
        String[][] inputFive = {{" _ "},
                           {"|_ "},
                           {" _|"}};                      
        List<String[][]> expects = new ArrayList<>();
        expects.add(inputZero);
        expects.add(inputOne);
        expects.add(inputTwo);
        expects.add(inputThree);
        expects.add(inputFour);
        expects.add(inputFive);
        DigitRepresentation digitRepresentation = new DigitRepresentation();
        assertArrayEquals(expects.toArray(), digitRepresentation.getDigitsRepresentation().toArray());
    }
}
