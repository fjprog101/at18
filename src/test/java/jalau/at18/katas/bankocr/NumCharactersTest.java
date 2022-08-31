package jalau.at18.katas.bankocr;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.katas.bankocr.mauricio.BuildNumber;
import jalau.at18.katas.bankocr.mauricio.CharValue;
import jalau.at18.katas.bankocr.mauricio.CharacterNumbers;
import jalau.at18.katas.bankocr.mauricio.CreateCharacter;

public class NumCharactersTest {
    @Test
    public void shouldObtainOne() {
        
        String[][] one = {{" ", " "}, {" ", "|"}, {" ", "|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.ONE, number);
        CreateCharacter character = new CreateCharacter(CharValue.ONE, build);
        assertEquals(one, character.makeNumber());
    }

    @Test
    public void shouldObtainTwo() {
        
        String[][] two = {{" ", "_"}, {" ", "_|"}, {" ", "|_"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.TWO, number);
        CreateCharacter character = new CreateCharacter(CharValue.TWO, build);
        assertEquals(two, character.makeNumber());
    }

    @Test
    public void shouldObtainThree() {
        
        String[][] three = {{" ", "_"}, {" ", "_|"}, {" ", "_|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.THREE, number);
        CreateCharacter character = new CreateCharacter(CharValue.THREE, build);
        assertEquals(three, character.makeNumber());
    }

    @Test
    public void shouldObtainFour() {
        
        String[][] four = {{" ", " "}, {" ", "|_|"}, {" ", "|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.FOUR, number);
        CreateCharacter character = new CreateCharacter(CharValue.FOUR, build);
        assertEquals(four, character.makeNumber());
    }

    @Test
    public void shouldObtainFive() {
        
        String[][] five = {{" ", "_"}, {" ", "|_"}, {" ", "_|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.FIVE, number);
        CreateCharacter character = new CreateCharacter(CharValue.FIVE, build);
        assertEquals(five, character.makeNumber());
    }

    @Test
    public void shouldObtainSix() {
        
        String[][] six = {{" ", "_"}, {" ", "|_ "}, {" ", "|_|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.SIX, number);
        CreateCharacter character = new CreateCharacter(CharValue.SIX, build);
        assertEquals(six, character.makeNumber());
    }

    @Test
    public void shouldObtainSeven() {
        
        String[][] seven = {{" ", "_"}, {" ", "|"}, {" ", "|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.SEVEN, number);
        CreateCharacter character = new CreateCharacter(CharValue.SEVEN, build);
        assertEquals(seven, character.makeNumber());
    }

    @Test
    public void shouldObtainEight() {
        
        String[][] eight = {{" ", "_"}, {" ", "|_|"}, {" ", "|_|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.EIGHT, number);
        CreateCharacter character = new CreateCharacter(CharValue.EIGHT, build);
        assertEquals(eight, character.makeNumber());
    }

    @Test
    public void shouldObtainNine() {
        
        String[][] nine = {{" ", "_"}, {" ", "|_|"}, {" ", "_|"}};
        CharacterNumbers number = new CharacterNumbers();
        BuildNumber build = new BuildNumber(CharValue.NINE, number);
        CreateCharacter character = new CreateCharacter(CharValue.NINE, build);
        assertEquals(nine, character.makeNumber());
    }
}
