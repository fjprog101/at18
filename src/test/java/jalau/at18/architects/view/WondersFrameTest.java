package jalau.at18.architects.view;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static jalau.at18.architects.view.Constants.WonderFrame.*;

public class WondersFrameTest {
    @Test
    public void wondersFrameShouldShowByDefault() {
        WondersFrame wondersFrame = new WondersFrame();
        assertEquals(DEFAULT_SIZE, wondersFrame.getWidth());
        assertEquals(DEFAULT_SIZE2, wondersFrame.getHeight());
    }

}
