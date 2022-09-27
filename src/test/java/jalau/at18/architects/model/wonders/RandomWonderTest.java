package jalau.at18.architects.model.wonders;

import static org.junit.Assert.assertEquals;

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
}
