package jalau.at18.azul;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
public class WallBoolTest {
    @Test
    public void shouldInitializeWallBoolBoard(){
        WallBool boolBoard = new WallBool();
        boolean[][] expected = {
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
            {false, false, false, false, false},
        };
        boolBoard.intializeWallBoolean();
        assertArrayEquals(expected, boolBoard.getTilesBool());
    }

}
