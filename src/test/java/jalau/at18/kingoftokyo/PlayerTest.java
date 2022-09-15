package jalau.at18.kingoftokyo;

import org.junit.Test;

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
        Monster monster = new Monster("Gigazaur");
        player.addMonster(monster);
        assertEquals("Gigazaur", player.getMonster().getName());
        assertEquals(0, player.getEnergy());
    }
}
