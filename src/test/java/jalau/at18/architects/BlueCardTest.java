package jalau.at18.architects;

import static org.junit.Assert.*;
import org.junit.Test;

public class BlueCardTest {
    @Test
    public void testIsCat() {
        BlueCard blueCard = new BlueCard(true, 0);
        assertTrue(blueCard.isCat());
    }
    public void testNotIsCat() {
        BlueCard blueCard = new BlueCard(false, 0);
        assertFalse(blueCard.isCat());
    }
}
