package jalau.at18.katas.bankocr.sarai;

import org.junit.Test;

public class DigitCharacterTest {
    @Test
    public void entryNumbers(){
        //String [][] firstEntry = {{" ", "_", " "," ", "|", " "," ", "_", " "," ", "_", " "," ", " ", " "," ", "_", " "," ", "_", " "," ", "_", " "," ", "_", " "," ", "_", " "}};
        //String [] firstEntry = {" ", "_", " "," ", "|", " "," ", "_", " "," ", "_", " "," ", " ", " "," ", "_", " "," ", "_", " "," ", "_", " "," ", "_", " "," ", "_", " "};
        String [] firstEntry = {"    _  _     _  _  _  _  _ ",
                                "  | _| _||_||_ |_   ||_||_|",
                                "  ||_  _|  | _||_|  ||_| _|"};
        
        DigitCharacter firstNumber = new DigitCharacter(firstEntry);
        
        assertArrayEquals(123456789,firstNumber);

        //DigitReader secondNumber = new DigitReader(firstEntry);
        //assertEquals(0,firstLine.getcompareCharacter());
    }
}
