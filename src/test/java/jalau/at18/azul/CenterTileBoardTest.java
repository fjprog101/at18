package jalau.at18.azul;

import static org.junit.Assert.assertEquals;


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
        center.addTilestoCenter(new Tile(TileColor.DARK), 3);
        CenterTileBoard expected = new CenterTileBoard();
        expected.add(new Tile(TileColor.FIRST_PLAYER));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.DARK));
        assertEquals(expected, center);
    }

}
