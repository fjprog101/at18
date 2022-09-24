package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class YellowCardTest {
    @Test
    public void getColor(){
        YellowCard yellowcard = new YellowCard();
        assertEquals("Yellow", yellowcard.getColor());
    }
    @Test
    public void getWildcard(){
        YellowCard yellowcard = new YellowCard();
        assertEquals(1, yellowcard.getWildcard());
    }
}
