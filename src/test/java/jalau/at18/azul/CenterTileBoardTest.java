package jalau.at18.azul;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CenterTileBoardTest {

    @Test
    public void testRemoveTiles() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add(Tile.FIRST_PLAYER);
        center.add(Tile.DARK);
        center.add(Tile.DARK);
        center.add(Tile.RED);
        center.add(Tile.YELLOW);
        center.removeTilesOfSpecificColor(Tile.RED);
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(Tile.FIRST_PLAYER);
        expected.add(Tile.DARK);
        expected.add(Tile.DARK);
        expected.add(Tile.YELLOW);
        assertEquals(expected, center);
    }
    @Test
    public void testRemoveTiles1() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add(Tile.FIRST_PLAYER);
        center.add(Tile.DARK);
        center.add(Tile.RED);
        center.add(Tile.RED);
        center.add(Tile.YELLOW);
        center.add(Tile.DARK);
        center.removeTilesOfSpecificColor(Tile.DARK);
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(Tile.FIRST_PLAYER);
        expected.add(Tile.RED);
        expected.add(Tile.RED);
        expected.add(Tile.YELLOW);
        assertEquals(expected, center);
    }

    @Test
    public void testRemoveTiles2() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add(Tile.FIRST_PLAYER);
        center.add(Tile.DARK);
        center.add(Tile.DARK);
        center.add(Tile.RED);
        center.add(Tile.YELLOW);
        center.removeTilesOfSpecificColor(Tile.DARK);
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(Tile.FIRST_PLAYER);
        expected.add(Tile.RED);
        expected.add(Tile.YELLOW);
        assertEquals(expected, center);
    }
    @Test
    public void testaddTiles() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add(Tile.FIRST_PLAYER);
        center.add(Tile.RED);
        center.add(Tile.RED);
        center.addTilestoCenter(Tile.DARK, 3);
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(Tile.FIRST_PLAYER);
        expected.add(Tile.RED);
        expected.add(Tile.RED);
        expected.add(Tile.DARK);
        expected.add(Tile.DARK);
        expected.add(Tile.DARK);
        assertEquals(expected, center);
    }

}
