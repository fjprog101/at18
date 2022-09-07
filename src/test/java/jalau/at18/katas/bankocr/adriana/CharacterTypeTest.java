package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterTypeTest {

     @Test
     public void shouldShowItsImage() {
        CharacterType character1 = CharacterType.PIPE;
        assertEquals("|", character1.getImage());
        CharacterType character2 = CharacterType.UNDERSCORE;
        assertEquals("_", character2.getImage());
        CharacterType character3 = CharacterType.EMPTY;
        assertEquals(" ", character3.getImage());
     }
}
