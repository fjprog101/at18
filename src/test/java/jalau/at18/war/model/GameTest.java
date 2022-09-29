package jalau.at18.war.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class GameTest {

    @Test
    public void gameShouldAddPlayers() {
        Game game = Game.INSTANCE;
        game.addPlayer(new Player(new DieRoller()));
        game.addPlayer(new Player(new DieRoller()));
        game.addPlayer(new Player(new DieRoller()));
        assertNotNull(game.getPlayers());
        assertEquals(3, game.getPlayers().size());
    }
}
