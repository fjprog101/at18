package jalau.at18.architects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CardYellowTest {
    @Test
    public void getColor(){
        CardYellow cardYellow = new CardYellow();
        assertEquals("Yellow", cardYellow.getColor());
    }
    @Test
    public void getWildcard(){

    }
}
