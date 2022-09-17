package jalau.at18.azul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

public class BagTest {

    @Test
    public void shouldFillBagWithColors() {
        ArrayList<Tile> aBag = new ArrayList<>();
        Bag myBag = new Bag();
        
        for (int index = 0; index < 20; index++){
            aBag.add(Tile.RED);
        }
        for (int index = 0; index < 20; index++){
            aBag.add(Tile.YELLOW);
        }
        for (int index = 0; index < 20; index++){
            aBag.add(Tile.DARK);
        }
        for (int index = 0; index < 20; index++){
            aBag.add(Tile.BLUE);
        }
        for (int index = 0; index < 20; index++){
            aBag.add(Tile.WHITE);
        }
        assertEquals(aBag, myBag.fillBagWithColors());
    }

    @Test
    public void shouldVerifyThereIsMixedBag() {

        ArrayList<Tile> mixed = new ArrayList<>();
        Bag mix = new Bag();
        mixed.add(Tile.RED);
        mixed.add(Tile.YELLOW);
        mixed.add(Tile.DARK);
        mixed.add(Tile.BLUE);
        mixed.add(Tile.WHITE);
        
        assertNotEquals(mixed, mix.getMixedBag());
    }
}