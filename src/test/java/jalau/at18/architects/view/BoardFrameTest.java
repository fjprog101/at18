package jalau.at18.architects.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardFrameTest {
    @Test
    public void boardFrameShouldShowByDefault() {
        BoardFrame boardFrame = new BoardFrame("3");
        assertEquals(840, boardFrame.getWidth());
        assertEquals(780, boardFrame.getHeight());
    }
}
