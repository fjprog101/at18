package jalau.at18.kingoftokyo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DeskCardsTest {

    @Test
    public void deskShouldHaveCards() {
        DeskCards deskCards = new DeskCards();
        assertEquals(11, deskCards.getDesk().size());

    }
}