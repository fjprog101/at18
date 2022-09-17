package jalau.at18.azul;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class WallTest {
    @Test
    public void shouldInitializeWallBoard(){
        Wall wall = new Wall();
        wall.initializeWall();
        Tile[][] expected = {
            {Tile.BLUE, Tile.YELLOW, Tile.RED, Tile.DARK, Tile.WHITE},
            {Tile.WHITE, Tile.BLUE, Tile.YELLOW, Tile.RED, Tile.DARK},
            {Tile.DARK, Tile.WHITE, Tile.BLUE, Tile.YELLOW, Tile.RED},
            {Tile.RED, Tile.DARK, Tile.WHITE, Tile.BLUE, Tile.YELLOW},
            {Tile.YELLOW, Tile.RED, Tile.DARK, Tile.WHITE, Tile.BLUE},
        };
        assertArrayEquals(expected, wall.getTiles());
    }
}