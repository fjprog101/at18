package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class DigitTest {
    
    @Test
    public void shouldReturnValue() {
        String[][] imageNumber = {{" ", "_", " "}, {"|", " ", "|"}, {"|", "_", "|"}};
        Digit digit = new Digit(imageNumber);
        assertEquals(0, digit.getValue());
        String[][] imageNumber1 = {{" ", " ", " "}, {" ", " ", "|"}, {" ", " ", "|"}};
        Digit digit1 = new Digit(imageNumber1);
        assertEquals(1, digit1.getValue());
        String[][] imageNumber2 = {{" ", "_", " "}, {" ", "_", "|"}, {"|", "_", " "}};
        Digit digit2 = new Digit(imageNumber2);
        assertEquals(2, digit2.getValue());
        String[][] imageNumber3 = {{" ", "_", " "}, {" ", "_", "|"}, {" ", "_", "|"}};
        Digit digit3 = new Digit(imageNumber3);
        assertEquals(3, digit3.getValue());
        String[][] imageNumber4 = {{" ", " ", " "}, {"|", "_", "|"}, {" ", " ", "|"}};
        Digit digit4 = new Digit(imageNumber4);
        assertEquals(4, digit4.getValue());
        String[][] imageNumber5 = {{" ", "_", " "}, {"|", "_", " "}, {" ", "_", "|"}};
        Digit digit5 = new Digit(imageNumber5);
        assertEquals(5, digit5.getValue());
        String[][] imageNumber6 = {{" ", "_", " "}, {"|", "_", " "}, {"|", "_", "|"}};
        Digit digit6 = new Digit(imageNumber6);
        assertEquals(6, digit6.getValue());
    }
}
