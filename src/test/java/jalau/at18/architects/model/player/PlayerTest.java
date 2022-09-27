package jalau.at18.architects.model.player;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.architects.model.wonders.Wonders;

public class PlayerTest {
    @Test
    public void createNewPlayer() {
        Player player = new Player("Jose", Wonders.FOUR);
        assertEquals("Jose", player.getName());
        assertEquals(4, player.getWonder().getNumberWonder());
    }
}
