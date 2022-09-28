package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import javax.swing.JLabel;
import org.junit.Test;
import jalau.at18.kingoftokyo.model.*;

public class TurnPanelTest {
    @Test
    public void shouldShowAElements() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        Player player3 = new Player();
        player3.addMonster(Monster.SPACE_PENGUIN);

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player3);
        playerList.add(player1);
        playerList.add(player2);
        Turn turn = new Turn(playerList);
        TurnPanel turnPanel = new TurnPanel(turn);
        assertEquals(2, turnPanel.getComponentCount());
        assertEquals(310, turnPanel.getBounds().getX(), 0);
        assertEquals(600, turnPanel.getBounds().getY(), 0);
        assertEquals(1000, turnPanel.getBounds().getWidth(), 0);
        assertEquals(40, turnPanel.getBounds().getHeight(), 0);
        assertTrue(turnPanel.isVisible());
    }

    @Test
    public void shouldSetPlayerWithTurnLabel() {
        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
        Player player2 = new Player();
        player2.addMonster(Monster.CYBER_KITTY);
        Player player3 = new Player();
        player3.addMonster(Monster.SPACE_PENGUIN);

        ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(player3);
        playerList.add(player1);
        playerList.add(player2);
        Turn turn = new Turn(playerList);
        TurnPanel turnPanel = new TurnPanel(turn);
        assertEquals("Turn of: Space Penguin", ((JLabel)turnPanel.getComponent(0)).getText());
        turn.changePlayerWithTheTurn();
        turnPanel.setPlayerWithTurnLabel();
        assertEquals("Turn of: Alienoid", ((JLabel)turnPanel.getComponent(0)).getText());
        turn.changePlayerWithTheTurn();
        turnPanel.setPlayerWithTurnLabel();
        assertEquals("Turn of: Cyber Kitty", ((JLabel)turnPanel.getComponent(0)).getText());
    }
}
