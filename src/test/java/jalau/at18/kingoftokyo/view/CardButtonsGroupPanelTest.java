package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.kingoftokyo.view.card.CardButtonsGroupPanel;

public class CardButtonsGroupPanelTest {
    @Test
    public void shouldHaveButtons() {
        CardButtonsGroupPanel cardButtonsGroup = new CardButtonsGroupPanel();
        assertEquals(5, cardButtonsGroup.getComponentCount());
        assertEquals(750, cardButtonsGroup.getBounds().getX(), 0);
        assertEquals(410, cardButtonsGroup.getBounds().getY(), 0);
        assertEquals(700, cardButtonsGroup.getBounds().getWidth(), 0);
        assertEquals(30, cardButtonsGroup.getBounds().getHeight(), 0);
        assertTrue(cardButtonsGroup.isVisible());
    }
}
