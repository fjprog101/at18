package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.model.DiceFace;
import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceFaceLabelTest {

    @Test
    public void shouldRecognizeSizeIcon() {
        DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
        assertNotNull(diceFaceLabel.getIcon());
    }

    @Test
    public void shouldPaintDiceFaceLabel() {
        DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
        diceFaceLabel.paintDiceFace(DiceFace.PUNCHING);
        assertTrue(diceFaceLabel.isInitialize());
        assertTrue(diceFaceLabel.isVisible());
    }
    @Test
    public void shouldPaintQuestionMark() {
        DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
        diceFaceLabel.painQuestionMark();
        assertFalse(diceFaceLabel.isInitialize());
        assertTrue(diceFaceLabel.isVisible());
    }

}
