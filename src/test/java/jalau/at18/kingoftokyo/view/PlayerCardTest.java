package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import jalau.at18.kingoftokyo.model.Monster;
import jalau.at18.kingoftokyo.model.Player;
import jalau.at18.kingoftokyo.view.playercard.PlayerCard;

import org.junit.Test;

public class PlayerCardTest {
    @Test
    public void shouldShowACard() {
        Player player = new Player();
        player.addMonster(Monster.ALIENOID);
        PlayerCard PlayerPanel1 = new PlayerCard(player);
        assertEquals(5, PlayerPanel1.getComponentCount());
        assertEquals(300, PlayerPanel1.getBounds().getWidth(), 0);
        assertEquals(150, PlayerPanel1.getBounds().getHeight(), 0);
        assertFalse(PlayerPanel1.isVisible());
    }
}
