package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CenterTileBoardTest {

    @Test
    public void testRemoveTiles() {
        CenterTileBoard center = new CenterTileBoard();
        center.add(new Tile(TileColor.FIRST_PLAYER));
        center.add(new Tile(TileColor.DARK));
        center.add(new Tile(TileColor.DARK));
        center.add(new Tile(TileColor.RED));
        center.add(new Tile(TileColor.YELLOW));
        center.removeTilesOfSpecificColor(new Tile(TileColor.RED));
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(new Tile(TileColor.FIRST_PLAYER));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.YELLOW));
        assertEquals(expected, center);
    }
    @Test
    public void testRemoveTiles1() {
        CenterTileBoard center = new CenterTileBoard();
        center.add(new Tile(TileColor.FIRST_PLAYER));
        center.add(new Tile(TileColor.DARK));
        center.add(new Tile(TileColor.RED));
        center.add(new Tile(TileColor.RED));
        center.add(new Tile(TileColor.YELLOW));
        center.add(new Tile(TileColor.DARK));
        center.removeTilesOfSpecificColor(new Tile(TileColor.DARK));
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(new Tile(TileColor.FIRST_PLAYER));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.YELLOW));
        assertEquals(expected, center);
    }

    @Test
    public void testRemoveTiles2() {
        CenterTileBoard center = new CenterTileBoard();
        center.add(new Tile(TileColor.FIRST_PLAYER));
        center.add(new Tile(TileColor.DARK));
        center.add(new Tile(TileColor.DARK));
        center.add(new Tile(TileColor.RED));
        center.add(new Tile(TileColor.YELLOW));
        center.removeTilesOfSpecificColor(new Tile(TileColor.DARK));
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(new Tile(TileColor.FIRST_PLAYER));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.YELLOW));
        assertEquals(expected, center);
    }
    @Test
    public void testaddTiles() {
        CenterTileBoard center = new CenterTileBoard();
        center.add(new Tile(TileColor.FIRST_PLAYER));
        center.add(new Tile(TileColor.RED));
        center.add(new Tile(TileColor.RED));
        List<Tile> newCenterTiles = new ArrayList<>(){
                {
                    add(new Tile(TileColor.DARK));
                    add(new Tile(TileColor.DARK));
                    add(new Tile(TileColor.DARK));
                }
            };
        center.addTilestoCenter(newCenterTiles);
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(new Tile(TileColor.FIRST_PLAYER));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.DARK));
        assertEquals(expected, center);
    }
    @Test
    public void testSelectedTilesList() {
        CenterTileBoard center = new CenterTileBoard();
        List<Tile> selectedtiles = new CenterTileBoard();
        center.add(new Tile(TileColor.RED));
        center.add(new Tile(TileColor.YELLOW));
        center.add(new Tile(TileColor.YELLOW));
        center.add(new Tile(TileColor.RED));
        center.add(new Tile(TileColor.DARK));
        center.add(new Tile(TileColor.DARK));
        selectedtiles = center.selectedTilesList(new Tile(TileColor.RED));
        List<Tile> expected = new ArrayList<>(){
            {
                add(new Tile(TileColor.RED));
                add(new Tile(TileColor.RED));
            }
        };
        assertEquals(expected, selectedtiles);
    }

}
