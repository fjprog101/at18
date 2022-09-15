package jalau.at18.Azul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

import jalau.at18.azul.Bag;
import jalau.at18.azul.MixedBag;

public class BagTest {
    @Test
    public void shouldVerifyThereIsBag() {

        ArrayList<Character> bag = new ArrayList<>();
        Bag my = new Bag();
        bag.add('R');
        assertNotEquals(bag, my.getBag());
    }

    @Test
    public void shouldVerifyThereIsMixedBag() {

        ArrayList<Character> mixed = new ArrayList<>();
        MixedBag mix = new MixedBag();
        mixed.add('R');
        mixed.add('Y');
        mixed.add('D');
        mixed.add('B');
        mixed.add('W');
        
        assertEquals(mixed, mix.mixColors(mixed));
    }
}