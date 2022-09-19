package jalau.at18.architects.wonders;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EphesusTest {
    @Test
    public void shouldReturnStages() {
        Ephesus ephesus = new Ephesus();
        ephesus.fillStages();
        Stage[] stageEphesus = new Stage[5];
        stageEphesus =  ephesus.getStages();
        assertEquals(4, stageEphesus[4].getCountOfResources());
        assertEquals(false, stageEphesus[4].isEquals());
        assertEquals(7, stageEphesus[4].getPoints());
    }
}
