package jalau.at18.katas.bankocr.mauricio;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jalau.at18.katas.bankocr.mauricio.AssiginigNumber;

public class AssigningNumbersTest {
    final int one = 1;
    final int two = 2;
    final int three = 3;
    final int four = 4;
    final int five = 5;
    final int six = 6;
    final int seven = 7;
    final int eight = 8;
    final int nine = 9;
    @Test
    public void assigningOne(){
        String[][] charOne = {{" ", "|", " "}, {" ", "|", " "}, {" ", "|", " "}};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.ONE, new CharacterOne());
        assertEquals(charOne, assignation.chooseChar());
    }

    @Test
    public void assigningTwo(){
        String[][] charTwo = {{" ", "_", " " }, {" ", "_", "|" }, {"|", "_", " " }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.TWO, new CharacterTwo());
        assertEquals(charTwo, assignation.chooseChar());
    }

    @Test
    public void assigningThree(){
        String[][] charThree = {{" ", "_", " " }, {" ", "_", "|" }, {" ", "_", "|" }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.THREE, new CharacterThree());
        assertEquals(charThree, assignation.chooseChar());
    }

    @Test
    public void assigningFour(){
        String[][] charFour = {{" ", " ", " " }, {"|", "_", "|" }, {" ", " ", "|" }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.FOUR, new CharacterFour());
        assertEquals(charFour, assignation.chooseChar());
    }

    @Test
    public void assigningFive(){
        String[][] charFive = {{" ", "_", " " }, {"|", "_", " " }, {" ", "_", "|" }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.FIVE, new CharacterFive());
        assertEquals(charFive, assignation.chooseChar());
    }

    @Test
    public void assigningSix(){
        String[][] charFive = {{" ", "_", " " }, {"|", "_", " " }, {"|", "_", "|" }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.SIX, new CharacterSix());
        assertEquals(charFive, assignation.chooseChar());
    }

    @Test
    public void assigningSeven(){
        String[][] charFive = {{" ", "_", " " }, {" ", " ", "|" }, {" ", " ", "|" }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.SEVEN, new CharacterSeven());
        assertEquals(charFive, assignation.chooseChar());
    }

    @Test
    public void assigningEight(){
        String[][] charFive = {{" ", "_", " " }, {"|", "_", "|" }, {"|", "_", "|" }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.EIGHT, new CharacterEight());
        assertEquals(charFive, assignation.chooseChar());
    }

    @Test
    public void assigningNine(){
        String[][] charNine = {{" ", "_", " " }, {"|", "_", "|" }, {" ", "_", "|" }};
        AssiginigNumber assignation = new AssiginigNumber(CharValue.NINE, new CharacterNine());
        assertEquals(charNine, assignation.chooseChar());
    }
}
