package jalau.at18.kingoftokyo.view;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import jalau.at18.kingoftokyo.view.gameover.GameOverFrame;

public class GameOverFrameTest {
    @Test
    public void shouldShowACard() {
        GameOverFrame gameOverFrame = new GameOverFrame();
        assertEquals(200, gameOverFrame.getBounds().getX(), 0);
        assertEquals(200, gameOverFrame.getBounds().getY(), 0);
        assertEquals(500, gameOverFrame.getBounds().getWidth(), 0);
        assertEquals(300, gameOverFrame.getBounds().getHeight(), 0);
        assertTrue(gameOverFrame.isVisible());
    }
}
