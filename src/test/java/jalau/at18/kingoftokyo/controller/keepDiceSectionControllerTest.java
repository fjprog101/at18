package jalau.at18.kingoftokyo.controller;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import jalau.at18.kingoftokyo.view.rolldicesection.KeepDiceSectionUI;

public class KeepDiceSectionControllerTest {
    @Test
    public void forkeepDiceSectionController() {

        KeepDiceSectionUI keepDiceSectionUI = new KeepDiceSectionUI(null);
        KeepDiceSectionController keepDiceSectionController = new KeepDiceSectionController(keepDiceSectionUI);
        assertNotNull(keepDiceSectionController.getCountDiceFaceSet());
        assertNotNull(keepDiceSectionController.getKeepDiceSectionUI());
    }
}
