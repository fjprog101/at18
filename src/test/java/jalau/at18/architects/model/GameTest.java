package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test 
    public void createGameWith2Players() {
        Game game = Game.getInstance();
        game.initGame(2);
        assertEquals(2, game.getPlayers().size());
    }
    @Test 
    public void createGameWith3Players() {
        Game game = Game.getInstance();
        game.initGame(3);
        assertEquals(3, game.getPlayers().size());
    }
}
