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

        StackButtonGroup stackGroup = new StackButtonGroup(4);
        List<Tile> testTiles = new ArrayList<Tile>();
        testTiles.add(new Tile(TileColor.WHITE));
        testTiles.add(new Tile(TileColor.WHITE));
        testTiles.add(new Tile(TileColor.RED));
        testTiles.add(new Tile(TileColor.YELLOW));

        stackGroup.updateStackButtons(testTiles);

        assertEquals(TileColor.WHITE.getName(), ((StackTileButton)stackGroup.getComponent(0)).getTileValue());
        assertEquals(TileColor.WHITE.getName(), ((StackTileButton)stackGroup.getComponent(1)).getTileValue());
        assertEquals(TileColor.RED.getName(), ((StackTileButton)stackGroup.getComponent(2)).getTileValue());
        assertEquals(TileColor.YELLOW.getName(), ((StackTileButton)stackGroup.getComponent(3)).getTileValue());
    }
}
