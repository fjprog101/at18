package jalau.at18.azul;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import jalau.at18.azul.model.BagSender;
import jalau.at18.azul.model.Tile;
import jalau.at18.azul.model.TileColor;

public class BagSenderTest {

    @Test
    public void shouldGetBag (){
        BagSender bag = new BagSender();
        List<Tile> testbag = new ArrayList<>();
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        bag.saveBag();
        assertNotEquals(testbag, bag.saveRemainingBag());
    }

    @Test
    public void shouldGetFactoryGroup (){
        BagSender bag = new BagSender();
        List<Tile> testbag = new ArrayList<>();
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        testbag.add(new Tile(TileColor.RED));
        bag.saveBag();
        assertEquals(testbag.size(), bag.getFactoryGroup().size());
    }

    @Test
    public void shouldRemoveTiles (){
        BagSender bag = new BagSender();
        bag.saveBag();

        bag.removeTiles();
        assertEquals(116, bag.saveRemainingBag().size());
        assertNotEquals(120, bag.saveRemainingBag().size());

        bag.removeTiles();
        assertEquals(112, bag.saveRemainingBag().size());
        assertNotEquals(116, bag.saveRemainingBag().size());
    }
}
