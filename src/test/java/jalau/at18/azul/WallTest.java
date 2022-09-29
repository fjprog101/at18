package jalau.at18.azul;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;
import jalau.at18.azul.model.Wall;

public class WallTest {
    @Test
    public void shouldInitializeWallBoard(){
        Wall wall = new Wall();
        wall.initializeWall();
        Tile[][] expected = {
            {new Tile(TileColor.BLUE), new Tile(TileColor.YELLOW), new Tile(TileColor.RED), new Tile(TileColor.DARK), new Tile(TileColor.WHITE)},
            {new Tile(TileColor.WHITE), new Tile(TileColor.BLUE), new Tile(TileColor.YELLOW), new Tile(TileColor.RED), new Tile(TileColor.DARK)},
            {new Tile(TileColor.DARK), new Tile(TileColor.WHITE), new Tile(TileColor.BLUE), new Tile(TileColor.YELLOW), new Tile(TileColor.RED)},
            {new Tile(TileColor.RED), new Tile(TileColor.DARK), new Tile(TileColor.WHITE), new Tile(TileColor.BLUE), new Tile(TileColor.YELLOW)},
            {new Tile(TileColor.YELLOW), new Tile(TileColor.RED), new Tile(TileColor.DARK), new Tile(TileColor.WHITE), new Tile(TileColor.BLUE)},
        };
        assertArrayEquals(expected, wall.getTiles());
    }
}