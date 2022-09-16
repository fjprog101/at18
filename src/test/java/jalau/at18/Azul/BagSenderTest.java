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
        testbag.add(Tile.RED);
        testbag.add(Tile.RED);
        testbag.add(Tile.RED);
        testbag.add(Tile.RED);
        bag.saveBag();
        assertNotEquals(testbag, bag.saveRemainingBag());
    }
    
    /*@Test
    public void shouldGetFactoryGroup (){
        BagSender bag = new BagSender();
        List<Tile> testbag = new ArrayList<>();
        testbag.add(Tile.RED);
        testbag.add(Tile.RED);
        testbag.add(Tile.RED);
        testbag.add(Tile.RED);
        bag.saveBag();
        assertNotEquals(testbag, bag.getFactoryGroup());
    }   */
}
