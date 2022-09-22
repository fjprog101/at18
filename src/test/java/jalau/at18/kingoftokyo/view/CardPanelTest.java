package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import jalau.at18.kingoftokyo.*;
import jalau.at18.kingoftokyo.view.card.CardPanel;

import org.junit.Test;

public class CardPanelTest {
    @Test
    public void shouldShowACard() {
        CardPanel cardPanel1 = new CardPanel(new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(6, cardPanel1.getComponentCount());
        assertEquals(150, cardPanel1.getBounds().getWidth(), 0);
        assertEquals(220, cardPanel1.getBounds().getHeight(), 0);
        assertTrue(cardPanel1.isVisible());

        CardPanel cardPanel2 = new CardPanel(new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(6, cardPanel2.getComponentCount());
        assertTrue(cardPanel2.isVisible());

        CardPanel cardPanel3 = new CardPanel(new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(6, cardPanel3.getComponentCount());
        assertTrue(cardPanel3.isVisible());
    }
}
