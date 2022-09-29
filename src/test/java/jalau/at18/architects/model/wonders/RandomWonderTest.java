package jalau.at18.architects.model.wonders;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;

import org.junit.Test;

public class RandomWonderTest {
    @Test
    public void generateARandomWonder() {
        RandomWonder randomWonder = new RandomWonder();
        randomWonder.getRamdomWonder();
        assertEquals(1, randomWonder.getUsedNumbers().size());
    }
    @Test
    public void generateSeveralRandomWonder() {
        RandomWonder randomWonder = new RandomWonder();
        randomWonder.getRamdomWonder();
        randomWonder.getRamdomWonder();
        randomWonder.getRamdomWonder();
        randomWonder.getRamdomWonder();
        randomWonder.getRamdomWonder();
        assertEquals(5, randomWonder.getUsedNumbers().size());
    }
    @Test
    public void shouldReturnDifferentsWonders() {
        RandomWonder randomWonder = new RandomWonder();
        Wonder wonder1 =  randomWonder.getRamdomWonder();
        Wonder wonder2 =  randomWonder.getRamdomWonder();
        Wonder wonder3 =  randomWonder.getRamdomWonder();
        Wonder wonder4 =  randomWonder.getRamdomWonder();
        Wonder wonder5 =  randomWonder.getRamdomWonder();
        Wonder wonder6 =  randomWonder.getRamdomWonder();
        Wonder wonder7 =  randomWonder.getRamdomWonder();
        List<Integer> list= randomWonder.getUsedNumbers();
        assertEquals(7, randomWonder.getUsedNumbers().size());
        assertTrue(list.contains(0));
        assertTrue(list.contains(1));
        assertTrue(list.contains(2));
        assertTrue(list.contains(3));
        assertTrue(list.contains(4));
        assertTrue(list.contains(5));
        assertTrue(list.contains(6));
    }
}
