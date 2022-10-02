package jalau.at18.kingoftokyo;
import org.junit.Test;

import static org.junit.Assert.*;
public class GameTest {
    @Test
    public void shouldCreateAmountOfPlayers() {
        Game.getInstance().setPlayers(3);
        assertEquals(3, Game.getInstance().getPlayers());

        assertNotNull(Game.getInstance().getPlayersList());
    }
}
