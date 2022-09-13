package jalau.at18.katas.bankocr.mauricio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jalau.at18.katas.bankocr.mauricio.IntroduceNumbers;

public class IntroduceNumbersTest {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private final int five = 5;
    private final int six = 6;
    private final int seven = 7;
    private final int eight = 8;
    private final int nine = 9;

    @Test
    public void validateNumbers(){
        IntroduceNumbers numbers = new IntroduceNumbers();
        int[] listNumbers = {one, two, three, one, two, three, one, two, three};
        String [][] oneCharacter = {{" ", "|", " "}, {" ", "|", " "}, {" ", "|", " "}};
        String [][] twoCharacter = {{" ", "_", " " }, {" ", "_", "|" }, {"|", "_", " " }};
        String [][] threeCharacter = {{" ", "_", " " }, {" ", "_", "|" }, {" ", "_", "|" }};
        String[][][] result = numbers.introduceYourNumbers(listNumbers);
        assertEquals(oneCharacter, result[0]);
        assertEquals(twoCharacter, result[one]);
        assertEquals(threeCharacter, result[two]);
        assertEquals(oneCharacter, result[three]);
        assertEquals(twoCharacter, result[four]);
        assertEquals(threeCharacter, result[five]);
        assertEquals(oneCharacter, result[six]);
        assertEquals(twoCharacter, result[seven]);
        assertEquals(threeCharacter, result[eight]);
    }
    
}
