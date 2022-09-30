package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlayerPanelTest {

    @Test
    public void shouldHaveRollerAndDice() {
        PlayerPanel playerPanel = new PlayerPanel();
        assertEquals(4, playerPanel.getComponentCount());
    }
}
