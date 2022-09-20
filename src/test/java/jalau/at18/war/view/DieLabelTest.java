package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DieLabelTest {

    @Test
    public void dieShouldShowDashByDefault() {
        DieLabel theDie = new DieLabel();
        assertEquals("0", theDie.getText());
        assertEquals(DieLabel.DEFAULT_POSX, theDie.getBounds().getX(), 0);
        assertEquals(DieLabel.DEFAULT_POSY, theDie.getBounds().getY(), 0);
        assertEquals(DieLabel.DEFAULT_WIDTH, theDie.getBounds().getWidth(), 0);
        assertEquals(DieLabel.DEFAULT_HEIGHT, theDie.getBounds().getHeight(), 0);
    }
}