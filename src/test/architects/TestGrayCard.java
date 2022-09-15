package jalau.at18.architects;

import org.junit.Test;
import org.junit.Assert;
public class TestGrayCard {
    
    @Test
    public void cardShouldBeGray() {
        GrayCard grayCard = new GrayCard(Resource.WATER);
        assertEquals("Gray",grayCard.getColor());
        assertNotNull(grayCard.getResource());
    }

}
