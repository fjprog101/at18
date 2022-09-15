package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class DeskCardsTest {

    @Test
    public void deskShouldHaveCards() {
        DeskCards deskCards = new DeskCards();
        assertEquals(11, deskCards.getDesk().size());

    }

    @Test
    public void deskShouldReturnARandomCard() {
        DeskCards deskCards = new DeskCards();
        assertNotNull(deskCards.getRandomCard());

    }
}