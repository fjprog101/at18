package jalau.at18.katas.bankocr.sarai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitCharacterTest {
    @Test
    public void entryNumbers(){
        //String [] firstEntry = {" ", "_", " "," ", "|", " "," ", "_", " "," ", "_", " "," ", " ", " "," ", "_", " "," ", "_", " "," ", "_", " "," ", "_", " "," ", "_", " "};
        String [] firstEntry = {"    _  _     _  _  _  _  _ ",
                                "  | _| _||_||_ |_   ||_||_|",
                                "  ||_  _|  ||_||_|  ||_| _|"};
        DigitCharacter firstNumber = new DigitCharacter(firstEntry);
        assertEquals("123466789",firstNumber.getfinalAcount(""));
    }
}
