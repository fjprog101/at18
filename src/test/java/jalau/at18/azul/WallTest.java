package jalau.at18.azul;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class WallTest {
    @Test
    public void shouldInitializeWallBoard(){
        Wall wall = new Wall();
        char[][] expected = {
            {'B', 'Y', 'R', 'D', 'W'},
            {'W', 'B', 'Y', 'R', 'D'},
            {'D', 'W', 'B', 'Y', 'R'},
            {'R', 'D', 'W', 'B', 'Y'},
            {'Y', 'R', 'D', 'W', 'B'},
        };
        assertArrayEquals(expected, wall.getTiles());
    }
}
