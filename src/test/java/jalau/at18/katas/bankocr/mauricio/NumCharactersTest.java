package jalau.at18.katas.bankocr.mauricio;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumCharactersTest {
    @Test
    public void shouldObtainOne() {
        
        String[][] one = {{" ", "|", " "}, {" ", "|", " "}, {" ", "|", " "}};
        CharacterOne characterOne = new CharacterOne();
        BuildNumber build = new BuildNumber(CharValue.ONE, characterOne);
        CreateCharacter character = new CreateCharacter(CharValue.ONE, build);
        assertEquals(one, character.makeNumber());
    }

    @Test
    public void shouldObtainTwo() {
        
        String[][] two = {{" ", "_", " " }, {" ", "_", "|" }, {"|", "_", " " }};
        CharacterTwo characterTwo = new CharacterTwo();
        BuildNumber build = new BuildNumber(CharValue.TWO, characterTwo);
        CreateCharacter character = new CreateCharacter(CharValue.TWO, build);
        assertEquals(two, character.makeNumber());
    }

    @Test
    public void shouldObtainThree() {
        
        String[][] three = {{" ", "_", " " }, {" ", "_", "|" }, {" ", "_", "|" }};
        CharacterThree characterThree = new CharacterThree();
        BuildNumber build = new BuildNumber(CharValue.THREE, characterThree);
        CreateCharacter character = new CreateCharacter(CharValue.THREE, build);
        assertEquals(three, character.makeNumber());
    }

    @Test
    public void shouldObtainFour() {
        
        String[][] four = {{" ", " ", " " }, {"|", "_", "|" }, {" ", " ", "|" }};
        CharacterFour characterFour = new CharacterFour();
        BuildNumber build = new BuildNumber(CharValue.FOUR, characterFour);
        CreateCharacter character = new CreateCharacter(CharValue.FOUR, build);
        assertEquals(four, character.makeNumber());
    }

    @Test
    public void shouldObtainFive() {
        
        String[][] five = {{" ", "_", " " }, {"|", "_", " " }, {" ", "_", "|" }};
        CharacterFive characterFive = new CharacterFive();
        BuildNumber build = new BuildNumber(CharValue.FIVE, characterFive);
        CreateCharacter character = new CreateCharacter(CharValue.FIVE, build);
        assertEquals(five, character.makeNumber());
    }

    @Test
    public void shouldObtainSix() {
        
        String[][] six = {{" ", "_", " " }, {"|", "_", " " }, {"|", "_", "|" }};
        CharacterSix characterSix = new CharacterSix();
        BuildNumber build = new BuildNumber(CharValue.SIX, characterSix);
        CreateCharacter character = new CreateCharacter(CharValue.SIX, build);
        assertEquals(six, character.makeNumber());
    }

    @Test
    public void shouldObtainSeven() {
        
        String[][] seven = {{" ", "_", " " }, {" ", " ", "|" }, {" ", " ", "|" }};
        CharacterSeven characterSeven = new CharacterSeven();
        BuildNumber build = new BuildNumber(CharValue.SEVEN, characterSeven);
        CreateCharacter character = new CreateCharacter(CharValue.SEVEN, build);
        assertEquals(seven, character.makeNumber());
    }

    @Test
    public void shouldObtainEight() {
        
        String[][] eight = {{" ", "_", " " }, {"|", "_", "|" }, {"|", "_", "|" }};
        CharacterEight characterEight = new CharacterEight();
        BuildNumber build = new BuildNumber(CharValue.EIGHT, characterEight);
        CreateCharacter character = new CreateCharacter(CharValue.EIGHT, build);
        assertEquals(eight, character.makeNumber());
    }

    @Test
    public void shouldObtainNine() {
        
        String[][] nine = {{" ", "_", " " }, {"|", "_", "|" }, {" ", "_", "|" }};
        CharacterNine characterNine = new CharacterNine();
        BuildNumber build = new BuildNumber(CharValue.NINE, characterNine );
        CreateCharacter character = new CreateCharacter(CharValue.NINE, build);
        assertEquals(nine, character.makeNumber());
    }
}
