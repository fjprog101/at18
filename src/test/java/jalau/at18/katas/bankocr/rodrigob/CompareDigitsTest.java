package jalau.at18.katas.bankocr.rodrigob;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CompareDigitsTest {

    @Test
    public void digitShouldChange() {
        char[][] one = {{' ', ' ', ' '}, {' ', ' ', '|'}, {' ', ' ', '|'}};
        CompareDigits compareOne = new CompareDigits();
        String getOne = compareOne.getDigitString(one);
        assertEquals("1", getOne);

        char[][] two = {{' ', '_', ' '}, {' ', '_', '|'}, {'|', '_', ' '}};
        CompareDigits compareTwo = new CompareDigits();
        String getTwo = compareTwo.getDigitString(two);
        assertEquals("2", getTwo);

        char[][] invalid = {{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', ' '}};
        CompareDigits compareInvalid = new CompareDigits();
        String getQuestionMark = compareInvalid.getDigitString(invalid);
        assertEquals("?", getQuestionMark);


    }

}
