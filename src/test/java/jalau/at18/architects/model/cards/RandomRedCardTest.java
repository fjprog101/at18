package jalau.at18.architects.model.cards;

import static org.junit.Assert.*;
import org.junit.Test;

public class RandomRedCardTest {
    @Test
    public void testGetRedCard() {
        RandomRedCard randomRedCard = new RandomRedCard();
        RedCard cardRed = randomRedCard.getRedCard();
        assertEquals("Red", cardRed.getColor());
        assertTrue(verifyHorn(cardRed.getHorns()));
        assertEquals(1, cardRed.getShields());

    }

    @Test
    public void testGetRedCard1() {
        RandomRedCard randomRedCard = new RandomRedCard();
        RedCard cardRed = randomRedCard.getRedCard();
        assertEquals("Red", cardRed.getColor());
        assertTrue(verifyHorn(cardRed.getHorns()));
        assertEquals(1, cardRed.getShields());

    }


    public boolean verifyHorn(int horn) {
        return (horn == 0 || horn == 1 || horn == 2);
    }
}
