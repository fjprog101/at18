package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.kingoftokyo.view.card.CardsGroupPanel;

public class CardsGroupPanelTest {
    @Test
    public void shouldShowACard() {
        CardsGroupPanel cardsGroup = new CardsGroupPanel();
        assertEquals(5, cardsGroup.getComponentCount());
        assertEquals(700, cardsGroup.getBounds().getX(), 0);
        assertEquals(185, cardsGroup.getBounds().getY(), 0);
        assertEquals(470, cardsGroup.getBounds().getWidth(), 0);
        assertEquals(280, cardsGroup.getBounds().getHeight(), 0);
        assertTrue(cardsGroup.isVisible());
    }
}
