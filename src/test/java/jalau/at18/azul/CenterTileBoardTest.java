package jalau.at18.azul;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CenterTileBoardTest {
    @Test
    public void testRemoveTiles() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add('F');
        center.add('D');
        center.add('D');
        center.add('R');
        center.add('Y');
        center.removeTilesOfSpecificColor('R');
        CenterTileBoard expected = new CenterTileBoard();
        expected.add('F');
        expected.add('D');
        expected.add('D');
        expected.add('Y');
        assertEquals(expected, center);
    }
    @Test
    public void testRemoveTiles1() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add('F');
        center.add('D');
        center.add('R');
        center.add('R');
        center.add('Y');
        center.add('D');
        center.removeTilesOfSpecificColor('D');
        CenterTileBoard expected = new CenterTileBoard();
        expected.add('F');
        expected.add('R');
        expected.add('R');
        expected.add('Y');
        assertEquals(expected, center);
    }

    @Test
    public void testRemoveTiles2() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add('F');
        center.add('D');
        center.add('D');
        center.add('R');
        center.add('Y');
        center.removeTilesOfSpecificColor('D');
        CenterTileBoard expected = new CenterTileBoard();
        expected.add('F');
        expected.add('R');
        expected.add('Y');
        assertEquals(expected, center);
    }
    @Test
    public void testaddTiles() {
        CenterTileBoard center = new CenterTileBoard(); 
        center.add('F');
        center.add('R');
        center.add('R');
        center.addTilestoCenter('D', 3);
        CenterTileBoard expected = new CenterTileBoard();
        expected.add('F');
        expected.add('R');
        expected.add('R');
        expected.add('D');
        expected.add('D');
        expected.add('D');
        assertEquals(expected, center);
    }

}
