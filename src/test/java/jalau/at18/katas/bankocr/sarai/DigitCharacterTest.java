package jalau.at18.katas.bankocr.sarai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitCharacterTest {
    @Test
    public void entryNumbers(){
        String [] firstEntry = {"    _  _     _  _  _  _  _ ",
                                "  | _| _||_||_ |_   ||_||_|",
                                "  ||_  _|  | _||_|  ||_| _|"};
        DigitCharacter firstNumber = new DigitCharacter(firstEntry);
        assertEquals("123456789",firstNumber.getfinalAcount(""));
    }
    @Test
    public void NumbersZero(){
        String [] firstEntry = {" _  _  _  _  _  _  _  _  _ ",
                                "| || || || || || || || || |",
                                "|_||_||_||_||_||_||_||_||_|"};
        DigitCharacter firstNumber = new DigitCharacter(firstEntry);
        assertEquals("000000000",firstNumber.getfinalAcount(""));
    }        String [] firstEntry = {" _  _  _  _  _  _  _  _  _ ",
    "|_||_||_||_||_||_||_||_||_|",
    "|_||_||_||_||_||_||_||_||_|"};
    @Test
    public void NumbersEigth(){
        String [] firstEntry = {" _  _  _  _  _  _  _  _  _ ",
                                "|_||_||_||_||_||_||_||_||_|",
                                "|_||_||_||_||_||_||_||_||_|"};
        DigitCharacter firstNumber = new DigitCharacter(firstEntry);
        assertEquals("888888888",firstNumber.getfinalAcount(""));
    }
}
