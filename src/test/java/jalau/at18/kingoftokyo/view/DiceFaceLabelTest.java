package jalau.at18.kingoftokyo.view;

import jalau.at18.kingoftokyo.view.rolldicesection.DiceFaceLabel;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class DiceFaceLabelTest {

    @Test
    public void shouldRecognizeSizeIcon() {
        DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
        assertNotNull(diceFaceLabel.getIcon());
    }
}
