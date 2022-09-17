package jalau.at18.architects.Wonders;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class BabylonTest {
    @Test
    public void shouldReturnStages() {
        Babylon babylon = new Babylon();
        babylon.fillStages();
        Stage[] stageBabylon = new Stage[5];
        stageBabylon =  babylon.getStages();
        assertEquals(2, stageBabylon[1].getCountOfResources());
        assertEquals(true, stageBabylon[1].isEquals());
        assertEquals(0, stageBabylon[1].getPoints());
    }

}
