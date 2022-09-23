package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import jalau.at18.kingoftokyo.*;
import jalau.at18.kingoftokyo.view.card.*;

import org.junit.Test;

public class CardPanelTest {
    @Test
    public void shouldShowACard() {
        CardPanel cardPanel1 = new CardPanel(new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(6, cardPanel1.getComponentCount());
        assertEquals(150, cardPanel1.getBounds().getWidth(), 0);
        assertEquals(220, cardPanel1.getBounds().getHeight(), 0);
        assertTrue(cardPanel1.isVisible());

        assertEquals("8                         ", ((CardCostLabel)cardPanel1.getComponent(0)).getText());
        assertEquals("ENERGIZE", ((CardNameLabel)cardPanel1.getComponent(1)).getText());
        assertEquals("<html><p style=\"width:100px\" style=\"text-align:center\" >Healing: 0, Damage: 0, Score: 0, Energy: 9</p></html>", ((CardDescriptionLabel)cardPanel1.getComponent(4)).getText());
        cardPanel1.setCard(new CompleteCard(DiscardCards.APARTMENT_BULIDING));
        
        assertEquals("5                         ", ((CardCostLabel)cardPanel1.getComponent(0)).getText());
        assertEquals("APARTMENT_BULIDING", ((CardNameLabel)cardPanel1.getComponent(1)).getText());
        assertEquals("<html><p style=\"width:100px\" style=\"text-align:center\" >Healing: 0, Damage: 0, Score: 3, Energy: 0</p></html>", ((CardDescriptionLabel)cardPanel1.getComponent(4)).getText());
    }
}
