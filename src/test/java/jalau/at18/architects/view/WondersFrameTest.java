package jalau.at18.architects.view;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static jalau.at18.architects.Constants.WonderFrame.*;

public class WondersFrameTest {
    @Test
    public void wondersFrameShouldShowByDefault() {
        WondersFrame wondersFrame = new WondersFrame();
        assertEquals(DEFAULT_POS_X, wondersFrame.getX());
        assertEquals(DEFAULT_POS_Y, wondersFrame.getY());
        assertEquals(DEFAULT_SIZE, wondersFrame.getWidth());
        assertEquals(DEFAULT_SIZE, wondersFrame.getHeight());
    }

}
