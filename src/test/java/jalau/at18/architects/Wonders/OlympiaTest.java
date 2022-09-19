package jalau.at18.architects.wonders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import jalau.at18.architects.wonders.Olympia;
import jalau.at18.architects.wonders.Stage;

public class OlympiaTest {
    @Test
    public void shouldReturnStages() {
        Olympia olympia = new Olympia();
        olympia.fillStages();
        Stage[] stageOlympia = new Stage[5];
        stageOlympia =  olympia.getStages();
        assertEquals(2, stageOlympia[0].getCountOfResources());
        assertEquals(false, stageOlympia[0].isEquals());
        assertEquals(3, stageOlympia[0].getPoints());
    }
}
