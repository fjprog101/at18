package jalau.at18.architects.model;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RedCardTest {
    @Test
    public void shouldReturnColorOfCard() {
        RedCard cardRed = new RedCard(0);
        assertEquals("Red", cardRed.getColor());
    }
    @Test
    public void shouldReturnNumberOfShields() {
        RedCard cardRed = new RedCard(0);
        assertEquals(1, cardRed.getShields());
    }
    @Test
    public void shouldReturnNumberOfHorns() {
        RedCard cardRed = new RedCard(2);
        assertEquals(2, cardRed.getHorns());
    }
}
