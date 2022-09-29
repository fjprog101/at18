package jalau.at18.azul.view;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.azul.CenterTileBoard;
import jalau.at18.azul.Tile;
import jalau.at18.azul.TileColor;

public class FactoryButtonGroupTest {
    

    @Test
    public void shouldUpdateLabelAndColorOfButtons() {

        FactoryButtonGroup myButtonGroup = new FactoryButtonGroup(new CenterButtons(null, null, null, null, null), new CenterTileBoard(), new StackButtonGroup(4));
        List<Tile> testTiles1 = new ArrayList<Tile>();
        testTiles1.add(new Tile(TileColor.BLUE));
        testTiles1.add(new Tile(TileColor.RED));
        testTiles1.add(new Tile(TileColor.DARK));
        testTiles1.add(new Tile(TileColor.YELLOW));

        myButtonGroup.updateButtonGroup(testTiles1);

        assertEquals(TileColor.BLUE.getName(), ((TilesButton)myButtonGroup.getComponent(0)).getTileValue());
        assertEquals(TileColor.RED.getName(), ((TilesButton)myButtonGroup.getComponent(1)).getTileValue());
        assertEquals(TileColor.DARK.getName(), ((TilesButton)myButtonGroup.getComponent(2)).getTileValue());
        assertEquals(TileColor.YELLOW.getName(), ((TilesButton)myButtonGroup.getComponent(3)).getTileValue());

        List<Tile> testTiles2 = new ArrayList<Tile>();
        testTiles2.add(new Tile(TileColor.BLUE));
        testTiles2.add(new Tile(TileColor.RED));
        testTiles2.add(new Tile(TileColor.DARK));
        testTiles2.add(new Tile(TileColor.YELLOW));

        assertEquals(testTiles1, myButtonGroup.fillArrayList());  

        myButtonGroup.clearFactoryTiles();

        assertEquals(TileColor.EMPTY.getName(), ((TilesButton)myButtonGroup.getComponent(0)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((TilesButton)myButtonGroup.getComponent(1)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((TilesButton)myButtonGroup.getComponent(2)).getTileValue());
        assertEquals(TileColor.EMPTY.getName(), ((TilesButton)myButtonGroup.getComponent(3)).getTileValue());
    }
}