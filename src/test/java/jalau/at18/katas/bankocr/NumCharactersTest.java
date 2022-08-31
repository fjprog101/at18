package jalau.at18.katas.bankocr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.bankocr.mauricio.BuildNumber;
import jalau.at18.katas.bankocr.mauricio.CharValue;
import jalau.at18.katas.bankocr.mauricio.CharacterNumbers;
import jalau.at18.katas.bankocr.mauricio.CreateCharacter;

public class NumCharactersTest {
    @Test
    public void shouldObtainTwo() {
        
        String[][] two = {{" ", "_"}, {" ", "_|"}, {" ", "|_"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.TWO, number);
        CreateCharacter character = new CreateCharacter(CharValue.TWO, build);
        assertEquals(two, character.makeNumber());
    }

}
