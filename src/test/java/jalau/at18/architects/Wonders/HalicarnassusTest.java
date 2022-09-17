package jalau.at18.architects.Wonders;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HalicarnassusTest {
    @Test
    public void shouldReturnStages() {
        Halicarnassus halicarnassus = new Halicarnassus();
        halicarnassus.fillStages();
        Stage[] stageHal = new Stage[5];
        stageHal =  halicarnassus.getStages();
        assertEquals(2, stageHal[0].getCountOfResources());
        assertEquals(false, stageHal[0].isEquals());
        assertEquals(3, stageHal[0].getPoints());
    }
}
