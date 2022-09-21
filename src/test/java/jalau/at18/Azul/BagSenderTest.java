package jalau.at18.azul;

import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

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
}
