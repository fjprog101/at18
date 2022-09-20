package jalau.at18.azul.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CenterListTest {

    @Test
    public void dieShouldShowDashByDefault(){
        CenterList center = new CenterList();
        assertEquals(CenterList.DEFAULT_POSX, center.getBounds().getX(), 0);
        assertEquals(CenterList.DEFAULT_POSY, center.getBounds().getY(), 0);
        assertEquals(CenterList.DEFAULT_WIDTH, center.getBounds().getWidth(), 0);
        assertEquals(CenterList.DEFAULT_HEIGHT, center.getBounds().getHeight(), 0);
    }
}
