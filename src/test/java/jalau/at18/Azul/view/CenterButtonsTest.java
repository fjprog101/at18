package jalau.at18.azul.view;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import jalau.at18.azul.model.CenterTileBoard;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
public class CenterButtonsTest {

    @Test
    public void shouldUpdateLabelAndColorOfCenterButtons() {

        CenterButtons centergroup = new CenterButtons(new CenterTileBoard(), new StackButtonGroup(4), null, null, null);
        CenterTileBoard centertilesTest = new CenterTileBoard();
        centertilesTest.add(new Tile(TileColor.YELLOW));
        centertilesTest.add(new Tile(TileColor.RED));
        centertilesTest.add(new Tile(TileColor.DARK));
        centertilesTest.add(new Tile(TileColor.YELLOW));

        centergroup.updateCenterButtons(centertilesTest);

        assertEquals(TileColor.YELLOW.getName(), ((CenterTileButton)centergroup.getComponent(0)).getTileValue());
        assertEquals(TileColor.RED.getName(), ((CenterTileButton)centergroup.getComponent(1)).getTileValue());
        assertEquals(TileColor.DARK.getName(), ((CenterTileButton)centergroup.getComponent(2)).getTileValue());
        assertEquals(TileColor.YELLOW.getName(), ((CenterTileButton)centergroup.getComponent(3)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(4)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(5)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(6)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(7)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(8)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(9)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(10)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(11)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(12)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(13)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(14)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((CenterTileButton)centergroup.getComponent(15)).getTileValue());
    }
}
