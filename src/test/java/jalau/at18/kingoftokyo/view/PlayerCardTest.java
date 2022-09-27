package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import jalau.at18.kingoftokyo.*;
import jalau.at18.kingoftokyo.view.playercards.*;

import org.junit.Test;

public class PlayerCardTest {
    @Test
    public void shouldShowACard() {
        Player player = new Player();
        player.addMonster(Monster.ALIENOID);
        PlayerCard PlayerPanel1 = new PlayerCard(0, player);
        assertEquals(5, PlayerPanel1.getComponentCount());
        assertEquals(20, PlayerPanel1.getBounds().getX(), 0);
        assertEquals(20, PlayerPanel1.getBounds().getY(), 0);
        assertEquals(300, PlayerPanel1.getBounds().getWidth(), 0);
        assertEquals(150, PlayerPanel1.getBounds().getHeight(), 0);
        assertTrue(PlayerPanel1.isVisible());

        PlayerCard PlayerPanel2 = new PlayerCard(1, player);
        assertEquals(5, PlayerPanel2.getComponentCount());
        assertEquals(20, PlayerPanel2.getBounds().getX(), 0);
        assertEquals(190, PlayerPanel2.getBounds().getY(), 0);
        assertEquals(300, PlayerPanel2.getBounds().getWidth(), 0);
        assertEquals(150, PlayerPanel2.getBounds().getHeight(), 0);
        assertTrue(PlayerPanel2.isVisible());
    }
}
