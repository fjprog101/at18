package jalau.at18.azul.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FactoryPanelTest {

    @Test
    public void factoryLabelShouldShowDashByDefault() {
        FactoryPanel factoryPanel = new FactoryPanel();
        assertEquals(FactoryPanel.X_INITIAL_POSITION, factoryPanel.getBounds().getX(), 0);
        assertEquals(FactoryPanel.Y_INITIAL_POSITION, factoryPanel.getBounds().getY(), 0);
        assertEquals(FactoryPanel.WIDTH, factoryPanel.getBounds().getWidth(), 0);
        assertEquals(FactoryPanel.HEIGHT, factoryPanel.getBounds().getHeight(), 0);
    }

}
