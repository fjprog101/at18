package jalau.at18.azul;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import jalau.at18.azul.model.Pyramid;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;;
public class PyramidTest {
    @Test
    public void shouldInitializePyramide(){
        Pyramid pyramid = new Pyramid();
        pyramid.initializePyramid();
        Tile [][] expected = {
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
        };
        assertArrayEquals(expected, pyramid.getTilesMatrix());
    }

    @Test
    public void shouldSendTileToThePyramide(){
        Pyramid pyramid = new Pyramid();
        pyramid.initializePyramid();
        Tile[][] expected = {
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.WHITE)},
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.DARK)},
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.YELLOW), new Tile(TileColor.YELLOW), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.RED), new Tile(TileColor.RED), new Tile(TileColor.RED), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
        };
        pyramid.addTileToPyramid(0, 4, new Tile(TileColor.WHITE));
        pyramid.addTileToPyramid(1, 4, new Tile(TileColor.DARK));
        pyramid.addTileToPyramid(3, 2, new Tile(TileColor.YELLOW));
        pyramid.addTileToPyramid(3, 3, new Tile(TileColor.YELLOW));
        pyramid.addTileToPyramid(4, 0, new Tile(TileColor.RED));
        pyramid.addTileToPyramid(4, 1, new Tile(TileColor.RED));
        pyramid.addTileToPyramid(4, 2, new Tile(TileColor.RED));
        assertArrayEquals(expected, pyramid.getTilesMatrix());
    }

    @Test
    public void shouldCleanPyramid(){
        Pyramid pyramid = new Pyramid();
        Tile [][] expected = {
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.NULL), new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.NULL), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
            {new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY), new Tile(TileColor.EMPTY)},
        };
        pyramid.addTileToPyramid(0, 4, new Tile(TileColor.WHITE));
        pyramid.addTileToPyramid(1, 4, new Tile(TileColor.DARK));
        pyramid.addTileToPyramid(3, 2, new Tile(TileColor.YELLOW));
        pyramid.addTileToPyramid(3, 3, new Tile(TileColor.YELLOW));
        pyramid.addTileToPyramid(4, 0, new Tile(TileColor.RED));
        pyramid.addTileToPyramid(4, 1, new Tile(TileColor.RED));
        pyramid.addTileToPyramid(4, 2, new Tile(TileColor.RED));
        pyramid.cleanPyramide();
        assertArrayEquals(expected, pyramid.getTilesMatrix());
    }
}