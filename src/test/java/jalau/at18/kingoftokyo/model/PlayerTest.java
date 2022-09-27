package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PlayerTest {

    @Test
    public void ShouldCreatePlayerWithOutMonster() {
        Player player = new Player();
        assertNull(player.getMonster());
        assertEquals(0, player.getEnergy());
    }

    @Test
    public void ShouldCreatePlayerWithAttributes() {
        Player player = new Player();
        player.addMonster(Monster.ALIENOID);
        assertEquals("Alienoid", player.getMonster().getName());
        assertEquals(0, player.getEnergy());
    }
}
