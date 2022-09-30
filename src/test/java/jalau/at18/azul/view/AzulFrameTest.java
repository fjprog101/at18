package jalau.at18.azul.view;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class AzulFrameTest {
    @Test
    public void playerPanelShouldShowDashByDefault() {
        PlayerPanel panel = new PlayerPanel(0, 0, new StackButtonGroup(20));
        assertEquals(Dimensions.PlayerPanel.DEFAULT_POSX_PLAYER_PANEL, panel.getBounds().getX(), 0);
        assertEquals(Dimensions.PlayerPanel.DEFAULT_POSY_PLAYER_PANEL, panel.getBounds().getY(), 0);
        assertEquals(Dimensions.PlayerPanel.DEFAULT_WIDTH_PLAYER_PANEL, panel.getBounds().getWidth(), 0);
        assertEquals(Dimensions.PlayerPanel.DEFAULT_HEIGHT_PLAYER_PANEL, panel.getBounds().getHeight(), 0);
    }

    @Test
    public void AzulFrameShouldShowByDefault() {
        AzulFrame azulframe = new AzulFrame();
        assertEquals(Dimensions.AzulFrame.INITIAL_POSITION_AZUL_FRAME, azulframe.getBounds().getX(), 0);
        assertEquals(Dimensions.AzulFrame.INITIAL_POSITION_AZUL_FRAME, azulframe.getBounds().getY(), 0);
        assertEquals(Dimensions.AzulFrame.WIDTH_AZUL_FRAME, azulframe.getBounds().getWidth(), 0);
    }
}
