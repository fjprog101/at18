package jalau.at18.kingoftokyo.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.model.TokyoCity;

public class TokyoCityTest {
    @Test
    public void shouldSayIfThereAreAMonster() {
        TokyoCity tokyoCity = new TokyoCity();
        assertFalse(tokyoCity.thereIsMonsterInside());

        Player player = new Player();
        player.addMonster(Monster.ALIENOID);
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
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.SPACE_PENGUIN);
        tokyoCity.addMonster(player1);
        assertEquals("Alienoid", tokyoCity.getMonster().getName());
        tokyoCity.removeMonster();
        assertNull(tokyoCity.getMonster());
        tokyoCity.addMonster(player2);
        assertEquals("Space Penguin", tokyoCity.getMonster().getName());
        tokyoCity.addMonster(player1);
        assertNotEquals("Alienoid", tokyoCity.getMonster().getName());
    }
}
