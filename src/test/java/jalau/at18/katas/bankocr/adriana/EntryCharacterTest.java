package jalau.at18.katas.bankocr.adriana;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntryCharacterTest {
    
    @Test
    public void shouldHaveCharacter() {
        EntryCharacter entryChar = new EntryCharacter(CharacterType.PIPE);
        assertEquals(CharacterType.PIPE, entryChar.getType());
    } 
}
