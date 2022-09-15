package jalau.at18.azul;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class FloorTest {

    @Test
    public void testAddTilesToFloor() {
        Floor floor = new Floor();
        floor.add(Tile.RED);
        floor.add(Tile.RED);
        floor.addTilestoFloor(Tile.DARK, 3);
        Floor expected = new Floor();
        expected.add(Tile.RED);
        expected.add(Tile.RED);
        expected.add(Tile.DARK);
        expected.add(Tile.DARK);
        expected.add(Tile.DARK);
        assertEquals(expected, floor);
    }

    @Test
    public void testAddTilesToFloor1() {
        Floor floor = new Floor();
        floor.add(Tile.RED);
        floor.add(Tile.BLUE);
        floor.add(Tile.DARK);
        floor.add(Tile.YELLOW);
        floor.add(Tile.WHITE);
        floor.addTilestoFloor(Tile.BLUE, 3);
        Floor expected = new Floor();
        expected.add(Tile.RED);
        expected.add(Tile.BLUE);
        expected.add(Tile.DARK);
        expected.add(Tile.YELLOW);
        expected.add(Tile.WHITE);
        expected.add(Tile.BLUE);
        expected.add(Tile.BLUE);
        assertEquals(expected, floor);
    }

    @Test
    public void testPointsDeducted() {
        Floor floor = new Floor();
        floor.add(Tile.RED);
        floor.add(Tile.YELLOW);
        floor.add(Tile.YELLOW);
        floor.add(Tile.DARK);
        int expected = 6;
        assertEquals(expected, floor.pointsDeducted());
    }
    @Test
    public void testPointsDeducted2() {
        Floor floor = new Floor();
        floor.add(Tile.RED);
        floor.add(Tile.YELLOW);
        floor.add(Tile.YELLOW);
        floor.add(Tile.DARK);
        floor.add(Tile.YELLOW);
        floor.add(Tile.YELLOW);
        int expected = 11;
        assertEquals(expected, floor.pointsDeducted());
    }
}
