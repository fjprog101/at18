package jalau.at18.azul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void shouldHaveTiles() {
        List<Character> tiles = new ArrayList<Character>(){
            {
                add('R');
                add('D');
                add('B');
                add('B');
            }
        };
        Factory factory = new Factory(tiles);
        assertNotNull(factory.getTiles());
    }
    @Test
    public void shouldCountTiles() {
        List<Character> tiles = new ArrayList<Character>(){
            {
                add('R');
                add('D');
                add('Y');
                add('B');
            }
        };
        Factory factory = new Factory(tiles);
        assertEquals(4, factory.getNumberTiles());
    }
}
