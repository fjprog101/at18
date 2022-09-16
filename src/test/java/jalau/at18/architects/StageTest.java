package jalau.at18.architects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StageTest {
    @Test
    public void createStage() {
        Stage stage = new Stage(2, true, 3);
        assertEquals(2, stage.getCountOfResources());
        assertEquals(true, stage.isEquals());
        assertEquals(3, stage.getPoints());
        assertEquals(false, stage.isBuilt());
    }
    @Test
    public void finishStage() {
        Stage stage = new Stage(2, true, 3);
        stage.finishBuilt();
        assertEquals(2, stage.getCountOfResources());
        assertEquals(true, stage.isEquals());
        assertEquals(3, stage.getPoints());
        assertEquals(true, stage.isBuilt());
    }
}
