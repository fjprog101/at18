package jalau.at18.architects.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BuildStageTest {
    @Test
    public void shouldReturnQuantityStagesCompleted() {
        BuildStage buildStage = new BuildStage();
        buildStage.buildStage();
        assertEquals(1, buildStage.getStagesCompleted());
    }
    @Test
    public void shouldSetQuantityStagesCompleted() {
        BuildStage buildStage = new BuildStage();
        buildStage.setStagesCompleted(4);
        assertEquals(4, buildStage.getStagesCompleted());
    }
    @Test
    public void shouldCheckWhenTheWonderIsComplete() {
        BuildStage buildStage = new BuildStage();
        buildStage.setStagesCompleted(4);
        assertFalse(buildStage.isCompleted());
        buildStage.buildStage();
        assertTrue(buildStage.isCompleted());
    }
}
