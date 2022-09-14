package jalau.at18.kingoftokyo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceRollerTest {
    @Test
    public void shouldShowListDices() {
        DiceRoller diceRoller = new DiceRoller();
        assertTrue(diceRoller.verifyShowListDices());
    }
}
