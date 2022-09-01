package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class InputTest {
    @Test
    public void shouldGetDigits() {
        String[] strin1 = {" ", "_", " ", " ", " ", " ", " ", "_", " "};
        String[] strin2 = {"|", " ", "|", " ", " ", "|", " ", "_", "|"};
        String[] strin3 = {"|", "_", "|", " ", " ", "|", "|", "_", " "};
        String[][] stringInput = {strin1, strin2, strin3};
        Input input = new Input(stringInput);
        String[][] digitExpect = DigitType.ZERO.getArrayCharacters();
        Digit[] expecteds = {new Digit(digitExpect), new Digit(DigitType.ONE.getArrayCharacters()), new Digit(DigitType.TWO.getArrayCharacters())};
        assertEquals(expecteds[0].getValue(), input.getDigits()[0].getValue());
        assertEquals(expecteds[1].getValue(), input.getDigits()[1].getValue());
        assertEquals(expecteds[2].getValue(), input.getDigits()[2].getValue());
    }

    @Test
    public void shouldGenerateString() {
        String[] strin1 = {" ", "_", " ", " ", " ", " ", " ", "_", " "};
        String[] strin2 = {"|", " ", "|", " ", " ", "|", " ", "_", "|"};
        String[] strin3 = {"|", "_", "|", " ", " ", "|", "|", "_", " "};
        String[][] stringInput = {strin1, strin2, strin3};
        Input input = new Input(stringInput);
        String[][] digitExpect = DigitType.ZERO.getArrayCharacters();
        String[][] digitIntput = input.generateString(0);
        assertArrayEquals(digitExpect, digitIntput);
        String[][] digitExpect1 = DigitType.ONE.getArrayCharacters();
        String[][] digitIntput1 = input.generateString(1);
        assertArrayEquals(digitExpect1, digitIntput1);
        String[][] digitExpect2 = DigitType.TWO.getArrayCharacters();
        String[][] digitIntput2 = input.generateString(2);
        assertArrayEquals(digitExpect2, digitIntput2);
    }

}
