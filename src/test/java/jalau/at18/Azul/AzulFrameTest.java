package jalau.at18.azul;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class AzulFrameTest {
    @Test
    public void playerPanelShouldShowDashByDefault() {
        PlayerPanel panel = new PlayerPanel(0, 0, 0, 0);
        assertEquals(PlayerPanel.DEFAULT_POSX, panel.getBounds().getX(), 0);
        assertEquals(PlayerPanel.DEFAULT_POSY, panel.getBounds().getY(), 0);
        assertEquals(PlayerPanel.DEFAULT_WIDTH, panel.getBounds().getWidth(), 0);
        assertEquals(PlayerPanel.DEFAULT_HEIGHT, panel.getBounds().getHeight(), 0);
    }

    @Test
    public void AzulFrameShouldShowByDefault() {
        AzulFrame azulframe = new AzulFrame();
        assertEquals(PlayerPanel.DEFAULT_POSX, azulframe.getBounds().getX(), 0);
        assertEquals(PlayerPanel.DEFAULT_POSY, azulframe.getBounds().getY(), 0);
        assertEquals(PlayerPanel.DEFAULT_WIDTH, azulframe.getBounds().getWidth(), 0);
        assertEquals(PlayerPanel.DEFAULT_HEIGHT, azulframe.getBounds().getHeight(), 0);
    }
}
