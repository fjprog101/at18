package jalau.at18.architects;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GrayCardTest {
    @Test
    public void cardShouldBeGray() {
        GrayCard grayCard = new GrayCard(Resource.WATER);
        assertEquals("Gray",grayCard.getColor());
        assertNotNull(grayCard.getResource());
    }
}