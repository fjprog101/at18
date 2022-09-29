package jalau.at18.kingoftokyo;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void shouldCreateAmountOfPlayers() {
        Game game = new Game();
        game.setPlayers(3);
        assertEquals(3, game.getPlayers());
    }
}
