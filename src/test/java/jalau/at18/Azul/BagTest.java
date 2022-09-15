package jalau.at18.azul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;


public class BagTest {

    @Test
    public void shouldVerifyThereIsBag() {
        ArrayList<Tile> aBag = new ArrayList<>();
        Bag myBag = new Bag();
        Tile[] color = {Tile.RED, Tile.YELLOW, Tile.DARK, Tile.BLUE, Tile.WHITE};
        for (int index = 0; index < 5; index++) {
            for (int jindex = 0; jindex < 20; jindex++) {
                aBag.add((color[index]));
            }
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