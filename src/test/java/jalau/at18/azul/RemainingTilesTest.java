package jalau.at18.azul;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class RemainingTilesTest {

    @Test
    public void shouldAddTiles() {
        RemainingTiles box = new RemainingTiles();
        List<Character> remainingTiles = new ArrayList<Character>(){
            {
                add('R');
                add('D');
                add('B');
            }
        };
        box.addTiles(remainingTiles);
        assertEquals(remainingTiles, box.getRemainingTiles());

        List<Character> remainingTiles2 = new ArrayList<Character>(){
            {
                add('R');
                add('D');
                add('B');
                add('R');
                add('D');
                add('B');
            }
        };

        box.addTiles(remainingTiles);
        assertEquals(remainingTiles2, box.getRemainingTiles());
    }

    @Test
    public void shouldRemoveTiles() {
        RemainingTiles box = new RemainingTiles();
        List<Character> remainingTiles = new ArrayList<Character>(){
            {
                add('R');
                add('R');
                add('Y');
            }
        };
        box.addTiles(remainingTiles);
        assertEquals(remainingTiles, box.getRemainingTiles());

        box.removeTiles();
        assertEquals(0, box.getRemainingTiles().size());

    }

}
