package jalau.at18.architects.wonders;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jalau.at18.architects.wonders.Giza;
import jalau.at18.architects.wonders.Stage;

public class GizaTest {
    @Test
    public void shouldReturnStages() {
        Giza giza = new Giza();
        giza.fillStages();
        Stage[] stagegiza = new Stage[5];
        stagegiza =  giza.getStages();
        assertEquals(4, stagegiza[4].getCountOfResources());
        assertEquals(false, stagegiza[4].isEquals());
        assertEquals(8, stagegiza[4].getPoints());
    }
}
