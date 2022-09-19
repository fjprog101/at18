package jalau.at18.architects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class GreenCardTest {
    @Test
    public void shouldBeAGreenCard(){
        GreenCard greenCard = new GreenCard(ScientificSymbol.COMPASS);
        assertEquals("Green", greenCard.getColor());
        assertEquals("Compass", greenCard.getSymbol());
    }

    @Test
    public void shouldNotBeAGreenCard(){
        GreenCard greenCard = new GreenCard(ScientificSymbol.OLDTABLE);
        assertNotEquals("Red", greenCard.getColor());
        assertNotEquals("Compass", greenCard.getSymbol());
    }
    
}
