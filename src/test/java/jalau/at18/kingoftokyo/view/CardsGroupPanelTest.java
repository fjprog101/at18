package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import org.junit.Test;
import jalau.at18.kingoftokyo.controller.PlayerStatusController;
import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;

public class CardsGroupPanelTest {
    @Test
    public void shouldShowACard() {
        CardsGroupPanel cardsGroup = new CardsGroupPanel(null, null);
        assertEquals(5, cardsGroup.getComponentCount());
        assertEquals(950, cardsGroup.getBounds().getX(), 0);
        assertEquals(185, cardsGroup.getBounds().getY(), 0);
        assertEquals(550, cardsGroup.getBounds().getWidth(), 0);
        assertEquals(250, cardsGroup.getBounds().getHeight(), 0);
        assertTrue(cardsGroup.isVisible());
    }

    @Test
    public void shoulSendTheCardEffect() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        assertEquals(10, player1.getLifePoints());
        assertEquals(10, player2.getLifePoints());
        assertEquals(0, player1.getVictoryPoints());
        assertEquals(0, player1.getEnergy());
        ArrayList<Player> playerList = new ArrayList<Player>();

        playerList.add(player1);
        playerList.add(player2);
        Turn turn = new Turn(playerList);
        GameFrame gameFrame = new GameFrame(turn);
        int[] effectsSetter = {2, 2, 1, 4 };
        PlayerStatusController playerController = gameFrame.getPlayerController();
        CardsGroupPanel cardsGroup = new CardsGroupPanel(null, playerController);
        cardsGroup.sendEffect(effectsSetter);
        assertEquals(10, player1.getLifePoints());
        assertEquals(10, player2.getLifePoints());
        assertEquals(1, player1.getVictoryPoints());
        assertEquals(4, player1.getEnergy());
    }
}
