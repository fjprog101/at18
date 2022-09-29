package jalau.at18.azul;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Objects;

import org.junit.Test;

import jalau.at18.azul.model.Bag;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;

public class BagTest {

    @Test
    public void shouldFillBagWithColors() {
        ArrayList<Tile> aBag = new ArrayList<>();
        Bag myBag = new Bag();

        for (int index = 0; index < 20; index++){
            aBag.add(new Tile(TileColor.RED));
        }
        for (int index = 0; index < 20; index++){
            aBag.add(new Tile(TileColor.YELLOW));
        }
        for (int index = 0; index < 20; index++){
            aBag.add(new Tile(TileColor.DARK));
        }
        for (int index = 0; index < 20; index++){
            aBag.add(new Tile(TileColor.BLUE));
        }
        for (int index = 0; index < 20; index++){
            aBag.add(new Tile(TileColor.WHITE));
        }

        assertTrue(Objects.equals(aBag, myBag.fillBagWithColors()));
    }

    @Test
    public void shouldVerifyThereIsMixedBag() {

        ArrayList<Tile> mixed = new ArrayList<>();
        Bag mix = new Bag();
        mixed.add(new Tile(TileColor.RED));
        mixed.add(new Tile(TileColor.YELLOW));
        mixed.add(new Tile(TileColor.DARK));
        mixed.add(new Tile(TileColor.BLUE));
        mixed.add(new Tile(TileColor.WHITE));

        assertNotEquals(mixed, mix.getMixedBag());
    }
}