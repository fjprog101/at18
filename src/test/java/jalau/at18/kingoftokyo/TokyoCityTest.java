package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TokyoCityTest {
    @Test
    public void shouldSayIfThereAreAMonster() {
        TokyoCity tokyoCity = new TokyoCity();
        assertFalse(tokyoCity.thereIsMonsterInside());

        Player player = new Player();
        player.addMonster(new Monster("CyberBunny"));
        tokyoCity.addMonster(player);
        assertTrue(tokyoCity.thereIsMonsterInside());

        tokyoCity.removeMonster();
        assertFalse(tokyoCity.thereIsMonsterInside());
    }

    @Test
    public void shouldGiveTheMonsterInside() {
        TokyoCity tokyoCity = new TokyoCity();
        tokyoCity.removeMonster();
        assertNull(tokyoCity.getMonster());

        Player player1 = new Player();
        player1.addMonster(new Monster("CyberBunny"));
        Player player2 = new Player();
        player2.addMonster(new Monster("Gigazaur"));
        tokyoCity.addMonster(player1);
        assertEquals("CyberBunny", tokyoCity.getMonster().getName());
        tokyoCity.removeMonster();
        assertNull(tokyoCity.getMonster());
        tokyoCity.addMonster(player2);
        assertEquals("Gigazaur", tokyoCity.getMonster().getName());
        tokyoCity.addMonster(player1);
        assertNotEquals("CyberBunny", tokyoCity.getMonster().getName());
    }
}
