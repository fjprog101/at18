package jalau.at18.azul;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;;
public class PyramideTest {
    
    @Test
    public void shouldInitializePyramide(){
        Pyramide pyramide = new Pyramide();
        pyramide.initializePyramide();
        char[][] expected = {
            {' ', ' ', ' ', ' ', 'O'},
            {' ', ' ', ' ', 'O', 'O'},
            {' ', ' ', 'O', 'O', 'O'},
            {' ', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O'},
        };
        assertArrayEquals(expected, pyramide.getTile());
    }
}
