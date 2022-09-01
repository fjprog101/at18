package jalau.at18.katas.bankocr;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jalau.at18.katas.bankocr.mauricio.AssiginigNumberOnetoThree;
import jalau.at18.katas.bankocr.mauricio.AssigningNumberFourToSix;
import jalau.at18.katas.bankocr.mauricio.AssigningNumberSevenToNine;

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
        String[][] charOne = {{" ", " " }, {" ", "  |" }, {" ", "  |"}};
        AssiginigNumberOnetoThree assignation = new AssiginigNumberOnetoThree();
        assertEquals(charOne, assignation.chooseChar(one));
    }

    @Test
    public void assigningTwo(){
        String[][] charTwo = {{" ", "___" }, {" ", "___|" }, {" ", "|___"}};
        AssiginigNumberOnetoThree assignation = new AssiginigNumberOnetoThree();
        assertEquals(charTwo, assignation.chooseChar(two));
    }

    @Test
    public void assigningThree(){
        String[][] charThree = {{" ", "___"}, {" ", "___|" }, {" ", "___|"}};
        AssiginigNumberOnetoThree assignation = new AssiginigNumberOnetoThree();
        assertEquals(charThree, assignation.chooseChar(three));
    }

    @Test
    public void assigningFour(){
        String[][] charFour = {{" ", " "}, {" ", "|___|" }, {" ", "   |"}};
        AssigningNumberFourToSix assignation = new AssigningNumberFourToSix();
        assertEquals(charFour, assignation.chooseChar(four));
    }

    @Test
    public void assigningFive(){
        String[][] charFive = {{" ", "___"}, {" ", "|___"}, {" ", "___|"}};
        AssigningNumberFourToSix assignation = new AssigningNumberFourToSix();
        assertEquals(charFive, assignation.chooseChar(five));
    }

    @Test
    public void assigningSix(){
        String[][] charFive = {{" ", "___"}, {" ", "|___"}, {" ", "|___|"}};
        AssigningNumberFourToSix assignation = new AssigningNumberFourToSix();
        assertEquals(charFive, assignation.chooseChar(six));
    }

    @Test
    public void assigningSeven(){
        String[][] charFive = {{" ", "___"}, {" ", "  |" }, {" ", "  |"}};
        AssigningNumberSevenToNine assignation = new AssigningNumberSevenToNine();
        assertEquals(charFive, assignation.chooseChar(seven));
    }

    @Test
    public void assigningEight(){
        String[][] charFive = {{" ", "___"}, {" ", "|___|"}, {" ", "|___|"}};
        AssigningNumberSevenToNine assignation = new AssigningNumberSevenToNine();
        assertEquals(charFive, assignation.chooseChar(eight));
    }

    @Test
    public void assigningNine(){
        String[][] charNine = {{" ", " ___"}, {" ", "|___|"}, {" ", "  __|"}};
        AssigningNumberSevenToNine assignation = new AssigningNumberSevenToNine();
        assertEquals(charNine, assignation.chooseChar(nine));
    }
}
