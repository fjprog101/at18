package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import jalau.at18.war.model.Game;

public class PlayerPanelTest {

    @Test
    public void shouldHaveRollerAndDice() {
        PlayerPanel playerPanel = new PlayerPanel(new Game());
        assertEquals(4, playerPanel.getComponentCount());
    }
}
