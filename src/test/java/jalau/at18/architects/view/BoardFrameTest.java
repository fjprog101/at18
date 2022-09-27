package jalau.at18.architects.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoardFrameTest {
    @Test
    public void boardFrameShouldShowByDefault() {
        BoardFrame boardFrame = new BoardFrame("3");
        assertEquals(1000, boardFrame.getWidth());
        assertEquals(600, boardFrame.getHeight());
    }
}
