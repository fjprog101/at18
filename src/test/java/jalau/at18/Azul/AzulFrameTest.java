package jalau.at18.azul;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AzulFrameTest {
    @Test
    public void dieShouldShowDashByDefault() {
        PlayerPanel theDie = new PlayerPanel(0, 0, 0, 0);
        assertEquals(PlayerPanel.DEFAULT_POSX, theDie.getBounds().getX(), 0);
        assertEquals(PlayerPanel.DEFAULT_POSY, theDie.getBounds().getY(), 0);
        assertEquals(PlayerPanel.DEFAULT_WIDTH, theDie.getBounds().getWidth(), 0);
        assertEquals(PlayerPanel.DEFAULT_HEIGHT, theDie.getBounds().getHeight(), 0);
    }
}
