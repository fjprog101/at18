package jalau.at18.architects.wonders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.architects.wonders.Rhodes;
import jalau.at18.architects.wonders.Stage;

public class RhodesTest {
    @Test
    public void shouldReturnStages() {
        Rhodes rhodes = new Rhodes();
        rhodes.fillStages();
        Stage[] stagerhodes = new Stage[5];
        stagerhodes =  rhodes.getStages();
        assertEquals(2, stagerhodes[1].getCountOfResources());
        assertEquals(true, stagerhodes[1].isEquals());
        assertEquals(4, stagerhodes[1].getPoints());
    }
}
