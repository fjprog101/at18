package jalau.at18.kingoftokyo.view;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DiceSectionUITest {
    @Test
    public void shouldHaveComponents() {
        DiceSectionUI diceSectionUI = new DiceSectionUI();
        assertEquals(2, diceSectionUI.getComponentCount());
        assertTrue(diceSectionUI.isVisible());
    }
}
