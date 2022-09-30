package jalau.at18.architects.model.cards;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RandomColorTest {
    @Test
    public void shouldReturnARandomColor() {
        RandomColor randomColor = new RandomColor();
        randomColor.setRandomNumber(1);
        assertEquals("Red", randomColor.getFinalColor());
    }
}
