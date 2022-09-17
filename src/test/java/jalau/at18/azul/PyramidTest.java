package jalau.at18.azul;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;;
public class PyramidTest {
    @Test
    public void shouldInitializePyramide(){
        Pyramid pyramid = new Pyramid();
        pyramid.initializePyramid();
        Tile [][] expected = {
            {Tile.NULL, Tile.NULL, Tile.NULL, Tile.NULL, Tile.EMPTY},
            {Tile.NULL, Tile.NULL, Tile.NULL, Tile.EMPTY, Tile.EMPTY},
            {Tile.NULL, Tile.NULL, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY},
            {Tile.NULL, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY},
            {Tile.EMPTY, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY},
        };
        assertArrayEquals(expected, pyramid.getTilesMatrix());
    }

    @Test
    public void shouldSendTileToThePyramide(){
        Pyramid pyramid = new Pyramid();
        pyramid.initializePyramid();
        Tile[][] expected = {
            {Tile.NULL, Tile.NULL, Tile.NULL, Tile.NULL, Tile.WHITE},
            {Tile.NULL, Tile.NULL, Tile.NULL, Tile.EMPTY, Tile.DARK},
            {Tile.NULL, Tile.NULL, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY},
            {Tile.NULL, Tile.EMPTY, Tile.YELLOW, Tile.YELLOW, Tile.EMPTY},
            {Tile.RED, Tile.RED, Tile.RED, Tile.EMPTY, Tile.EMPTY},
        };
        pyramid.addTileToPyramid(0, 4, Tile.WHITE);
        pyramid.addTileToPyramid(1, 4, Tile.DARK);
        pyramid.addTileToPyramid(3, 2, Tile.YELLOW);
        pyramid.addTileToPyramid(3, 3, Tile.YELLOW);
        pyramid.addTileToPyramid(4, 0, Tile.RED);
        pyramid.addTileToPyramid(4, 1, Tile.RED);
        pyramid.addTileToPyramid(4, 2, Tile.RED);
        assertArrayEquals(expected, pyramid.getTilesMatrix());
    }

    @Test
    public void shouldCleanPyramid(){
        Pyramid pyramid = new Pyramid();
        Tile [][] expected = {
            {Tile.NULL, Tile.NULL, Tile.NULL, Tile.NULL, Tile.EMPTY},
            {Tile.NULL, Tile.NULL, Tile.NULL, Tile.EMPTY, Tile.EMPTY},
            {Tile.NULL, Tile.NULL, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY},
            {Tile.NULL, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY},
            {Tile.EMPTY, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY, Tile.EMPTY},
        };
        pyramid.addTileToPyramid(0, 4, Tile.WHITE);
        pyramid.addTileToPyramid(1, 4, Tile.DARK);
        pyramid.addTileToPyramid(3, 2, Tile.YELLOW);
        pyramid.addTileToPyramid(3, 3, Tile.YELLOW);
        pyramid.addTileToPyramid(4, 0, Tile.RED);
        pyramid.addTileToPyramid(4, 1, Tile.RED);
        pyramid.addTileToPyramid(4, 2, Tile.RED);
        pyramid.cleanPyramide();
        assertArrayEquals(expected, pyramid.getTilesMatrix());
    }
}