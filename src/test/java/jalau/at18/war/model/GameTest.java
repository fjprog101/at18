package jalau.at18.war.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import org.junit.Test;

public class GameTest {

    @Test
    public void shouldRollADice() {
        Game game = new Game();
        List<Die> diceRolled = game.rollDice();
        assertEquals(3, diceRolled.size());
        assertNotNull(diceRolled.get(0).getFace());
        assertNotNull(diceRolled.get(1).getFace());
        assertNotNull(diceRolled.get(2).getFace());
    }
}
