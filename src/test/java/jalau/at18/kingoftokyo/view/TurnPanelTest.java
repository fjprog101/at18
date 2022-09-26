package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.swing.JLabel;

import org.junit.Test;

import jalau.at18.kingoftokyo.Player;
import jalau.at18.kingoftokyo.Monster;

public class TurnPanelTest {
    @Test
    public void shouldShowAElements() {
        TurnPanel turnPanel = new TurnPanel();
        assertEquals(2, turnPanel.getComponentCount());
        assertEquals(5, turnPanel.getBounds().getX(), 0);
        assertEquals(600, turnPanel.getBounds().getY(), 0);
        assertEquals(1150, turnPanel.getBounds().getWidth(), 0);
        assertEquals(40, turnPanel.getBounds().getHeight(), 0);
        assertTrue(turnPanel.isVisible());
    }

    @Test
    public void shouldSetPlayerWithTurnLabel() {
        TurnPanel turnPanel = new TurnPanel();
        assertEquals("Turn of: ", ((JLabel)turnPanel.getComponent(0)).getText());

        Player player1 = new Player();
        player1.addMonster(Monster.ALIENOID);
    }
}
