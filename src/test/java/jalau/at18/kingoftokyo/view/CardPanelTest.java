package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import jalau.at18.kingoftokyo.model.*;
import jalau.at18.kingoftokyo.view.card.*;

import org.junit.Test;

public class CardPanelTest {
    @Test
    public void shouldShowACard() {
        DeckCards deck = new DeckCards();
        CardPanel cardPanel1 = new CardPanel(new CompleteCard(DiscardCards.ENERGIZE));
        assertEquals(7, cardPanel1.getComponentCount());
        assertEquals(150, cardPanel1.getBounds().getWidth(), 0);
        assertEquals(250, cardPanel1.getBounds().getHeight(), 0);
        assertTrue(cardPanel1.isVisible());

        assertEquals("8                         ", ((CardCostLabel)cardPanel1.getComponent(0)).getText());
        assertEquals("ENERGIZE", ((CardNameLabel)cardPanel1.getComponent(1)).getText());
        assertEquals("<html><p style=\"width:100px\" style=\"text-align:center\" >Healing: 0, Damage: 0, Score: 0, Energy: 9</p></html>", ((CardDescriptionLabel)cardPanel1.getComponent(4)).getText());

        CompleteCard card =new CompleteCard(DiscardCards.APARTMENT_BULIDING);
        cardPanel1.setCard(card);
        assertEquals("5                         ", ((CardCostLabel)cardPanel1.getComponent(0)).getText());
        assertEquals("APARTMENT_BULIDING", ((CardNameLabel)cardPanel1.getComponent(1)).getText());
        assertEquals("<html><p style=\"width:100px\" style=\"text-align:center\" >Healing: 0, Damage: 0, Score: 3, Energy: 0</p></html>", ((CardDescriptionLabel)cardPanel1.getComponent(4)).getText());
    }
}
