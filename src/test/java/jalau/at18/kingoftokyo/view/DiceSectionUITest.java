package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.view.rolldicesection.DiceSectionUI;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiceSectionUITest {
    @Test
    public void shouldHaveComponents() {
        DiceSectionUI diceSectionUI = new DiceSectionUI(null, null);
        assertEquals(2, diceSectionUI.getComponentCount());
        assertTrue(diceSectionUI.isVisible());
    }
}
