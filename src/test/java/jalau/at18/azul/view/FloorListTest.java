package jalau.at18.azul.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FloorListTest {

    @Test
    public void dieShouldShowDashByDefault(){
        FloorList floor = new FloorList();
        assertEquals(FloorList.DEFAULT_POSX, floor.getBounds().getX(), 0);
        assertEquals(FloorList.DEFAULT_POSY, floor.getBounds().getY(), 0);
        assertEquals(FloorList.DEFAULT_WIDTH, floor.getBounds().getWidth(), 0);
        assertEquals(FloorList.DEFAULT_HEIGHT, floor.getBounds().getHeight(), 0);
    }
}

