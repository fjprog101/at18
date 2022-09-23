package jalau.at18.kingoftokyo.view;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DiceFaceLabelTest {

    @Test
    public void shouldRecognizeSizeIcon() {
        DiceFaceLabel diceFaceLabel = new DiceFaceLabel();
        assertNotNull(diceFaceLabel.getIcon());
    }

}
