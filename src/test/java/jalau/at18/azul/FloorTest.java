package jalau.at18.azul;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class FloorTest {

    @Test
    public void testAddTilesToFloor() {
        Floor floor = new Floor();
        floor.add(new Tile(TileColor.RED));
        floor.add(new Tile(TileColor.RED));
        floor.addTilestoFloor(new Tile(TileColor.DARK), 3);
        Floor expected = new Floor();
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.DARK));
        assertEquals(expected, floor);
    }

    @Test
    public void testAddTilesToFloor1() {
        Floor floor = new Floor();
        floor.add(new Tile(TileColor.RED));
        floor.add(new Tile(TileColor.BLUE));
        floor.add(new Tile(TileColor.DARK));
        floor.add(new Tile(TileColor.YELLOW));
        floor.add(new Tile(TileColor.WHITE));
        floor.addTilestoFloor(new Tile(TileColor.BLUE), 3);
        Floor expected = new Floor();
        expected.add(new Tile(TileColor.RED));
        expected.add(new Tile(TileColor.BLUE));
        expected.add(new Tile(TileColor.DARK));
        expected.add(new Tile(TileColor.YELLOW));
        expected.add(new Tile(TileColor.WHITE));
        expected.add(new Tile(TileColor.BLUE));
        expected.add(new Tile(TileColor.BLUE));
        assertEquals(expected, floor);
    }

    @Test
    public void testPointsDeducted() {
        Floor floor = new Floor();
        floor.add(new Tile(TileColor.RED));
        floor.add(new Tile(TileColor.YELLOW));
        floor.add(new Tile(TileColor.YELLOW));
        floor.add(new Tile(TileColor.DARK));
        int expected = 6;
        assertEquals(expected, floor.pointsDeducted());
    }
    @Test
    public void testPointsDeducted2() {
        Floor floor = new Floor();
        floor.add(new Tile(TileColor.RED));
        floor.add(new Tile(TileColor.YELLOW));
        floor.add(new Tile(TileColor.YELLOW));
        floor.add(new Tile(TileColor.DARK));
        floor.add(new Tile(TileColor.YELLOW));
        floor.add(new Tile(TileColor.YELLOW));
        int expected = 11;
        assertEquals(expected, floor.pointsDeducted());
    }
}
