package jalau.at18.kingoftokyo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class RandomDiceTest {
    // Verify if random return a value existent
    @Test
    public void shouldHandRandomDice() {
        RandomDice randomDice = new RandomDice();
        assertTrue(randomDice.verifyRandomValue());
    }

}
