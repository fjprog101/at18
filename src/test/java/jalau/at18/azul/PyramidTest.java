package jalau.at18.azul;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;;
public class PyramidTest {
    @Test
    public void shouldInitializePyramide(){
        Pyramid pyramid = new Pyramid();
        char[][] expected = {
            {' ', ' ', ' ', ' ', 'O'},
            {' ', ' ', ' ', 'O', 'O'},
            {' ', ' ', 'O', 'O', 'O'},
            {' ', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O'},
        };
        assertArrayEquals(expected, pyramid.getTiles());
    }

    @Test
    public void shouldSendTileToThePyramide(){
        Pyramid pyramid = new Pyramid();
        char[][] expected = {
            {' ', ' ', ' ', ' ', 'R'},
            {' ', ' ', ' ', 'O', 'O'},
            {' ', ' ', 'O', 'B', 'B'},
            {' ', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'Y'},
        };
        pyramid.addTileToPyramid(0, 4, 'R');
        pyramid.addTileToPyramid(2, 3, 'B');
        pyramid.addTileToPyramid(2, 4, 'B');
        pyramid.addTileToPyramid(4, 4, 'Y');
        assertArrayEquals(expected, pyramid.getTiles());
    }

    @Test
    public void shouldClearPyramid(){
        Pyramid pyramid = new Pyramid();
        char[][] expected = {
            {' ', ' ', ' ', ' ', 'O'},
            {' ', ' ', ' ', 'O', 'O'},
            {' ', ' ', 'O', 'O', 'O'},
            {' ', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O'},
        };
        pyramid.addTileToPyramid(0, 4, 'R');
        pyramid.addTileToPyramid(2, 3, 'B');
        pyramid.addTileToPyramid(2, 4, 'B');
        pyramid.addTileToPyramid(4, 4, 'Y');

        pyramid.cleanPyramide();

        assertArrayEquals(expected, pyramid.getTiles());
    }
}