package jalau.at18.azul.view;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

public class StackButtonGroupTest {
    
    @Test
    public void shouldUpdateLabelAndColorOfStackButtons() {
        StackButtonGroup myButtonGroup = new StackButtonGroup(4);
        List<Tile> testTiles1 = new ArrayList<Tile>();
        testTiles1.add(new Tile(TileColor.BLUE));
        testTiles1.add(new Tile(TileColor.RED));
        testTiles1.add(new Tile(TileColor.DARK));
        testTiles1.add(new Tile(TileColor.YELLOW));

        myButtonGroup.updateStackButtons(testTiles1);

        assertEquals(TileColor.BLUE.getName(), ((StackTileButton)myButtonGroup.getComponent(0)).getTileValue());
        assertEquals(TileColor.RED.getName(), ((StackTileButton)myButtonGroup.getComponent(1)).getTileValue());
        assertEquals(TileColor.DARK.getName(), ((StackTileButton)myButtonGroup.getComponent(2)).getTileValue());
        assertEquals(TileColor.YELLOW.getName(), ((StackTileButton)myButtonGroup.getComponent(3)).getTileValue());
    }
}
