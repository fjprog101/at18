package jalau.at18.architects;

import static org.junit.Assert.*;
import org.junit.Test;

public class RandomGreenCardTest {
    @Test
    public void testGetGreenCard() {
        RandomGreenCard randomGreenCard = new RandomGreenCard();
        GreenCard cardGreen = randomGreenCard.getGreenCard();
        assertEquals("Green", cardGreen.getColor());
        assertTrue(verifySymbol(cardGreen.getSymbol()));
    }
    @Test
    public void testGetGreenCard1() {
        RandomGreenCard randomGreenCard = new RandomGreenCard();
        GreenCard cardGreen = randomGreenCard.getGreenCard();
        assertEquals("Green", cardGreen.getColor());
        assertTrue(verifySymbol(cardGreen.getSymbol()));
    }

    public boolean verifySymbol(String symbol) {
        return (symbol.equals(ScientificSymbol.COMPASS.getSymbol()) || symbol.equals(ScientificSymbol.OLDTABLE.getSymbol())
                || symbol.equals(ScientificSymbol.SCREW.getSymbol()));
    }
}