package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import jalau.at18.kingoftokyo.*;

import org.junit.Test;

public class CardPanelTest {
    @Test
    public void shouldShowACard() {
        CardPanel cardPanel1 = new CardPanel(0, new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(5, cardPanel1.getComponentCount());
        assertEquals(700, cardPanel1.getBounds().getX(), 0);
        assertEquals(200, cardPanel1.getBounds().getY(), 0);
        assertEquals(150, cardPanel1.getBounds().getWidth(), 0);
        assertEquals(220, cardPanel1.getBounds().getHeight(), 0);
        assertTrue(cardPanel1.isVisible());

        CardPanel cardPanel2 = new CardPanel(1, new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(5, cardPanel2.getComponentCount());
        assertEquals(860, cardPanel2.getBounds().getX(), 0);
        assertEquals(200, cardPanel2.getBounds().getY(), 0);
        assertEquals(150, cardPanel2.getBounds().getWidth(), 0);
        assertEquals(220, cardPanel2.getBounds().getHeight(), 0);
        assertTrue(cardPanel2.isVisible());

        CardPanel cardPanel3 = new CardPanel(2, new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(5, cardPanel3.getComponentCount());
        assertEquals(1020, cardPanel3.getBounds().getX(), 0);
        assertTrue(cardPanel2.isVisible());
    }
}
