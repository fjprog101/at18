package jalau.at18.katas.bankocr.sarai;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharactersTest {
    @Test
    public void testGetValue() {
        Character oneDigit;

        String[] eightcharacter = new String[] {" _ ", "|_|", "|_|" };
        oneDigit = new Character(eightcharacter);
        assertEquals("8", oneDigit.getValue());

        String[] characterIllegible = new String[] {"  |", "  |", "  |" };
        oneDigit = new Character(characterIllegible);
        assertEquals("?", oneDigit.getValue());

        String[] characterIllegible2 = new String[] {" _ ", "|  ", "|_|" };
        oneDigit = new Character(characterIllegible2);
        assertEquals("?", oneDigit.getValue());
    }
}
