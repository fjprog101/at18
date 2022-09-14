package jalau.at18.architects;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class CardRedTest {
    @Test
    public void shouldReturnColorOfCard() {
        CardRed cardRed = new CardRed(0);
        assertEquals("Red", cardRed.getColor());
    }
    @Test
    public void shouldReturnNumberOfShields() {
        CardRed cardRed = new CardRed(0);
        assertEquals(1, cardRed.getShields());
    }
    @Test
    public void shouldReturnNumberOfHorns() {
        CardRed cardRed = new CardRed(2);
        assertEquals(2, cardRed.getHorns());
    }
}
