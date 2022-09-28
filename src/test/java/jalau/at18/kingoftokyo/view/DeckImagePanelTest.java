package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class DeckImagePanelTest {
    @Test
    public void shouldShowACard() {
        DeckImagePanel deckImage = new DeckImagePanel();
        assertEquals(1, deckImage.getComponentCount());
        assertEquals(1100, deckImage.getBounds().getX(), 0);
        assertEquals(20, deckImage.getBounds().getY(), 0);
        assertEquals(220, deckImage.getBounds().getWidth(), 0);
        assertEquals(150, deckImage.getBounds().getHeight(), 0);
        assertTrue(deckImage.isVisible());
    }
}
