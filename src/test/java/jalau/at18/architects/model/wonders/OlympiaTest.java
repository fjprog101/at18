package jalau.at18.architects.model.wonders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


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
