package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.kingoftokyo.view.rolldicesection.RollDiceSectionUI;
import jalau.at18.kingoftokyo.view.whostart.ShowDicesPanel;

public class ShowDicesPanelTest {
    @Test
    public void positionShouldResultsPanel() {

        ShowDicesPanel showDicesPanel = new ShowDicesPanel();
        assertEquals(100, showDicesPanel.getBounds().getX(), 0);
        assertEquals(90, showDicesPanel.getBounds().getY(), 0);

        assertEquals(500, showDicesPanel.getBounds().getWidth(), 0);
        assertEquals(200, showDicesPanel.getBounds().getHeight(), 0);

    }
}
