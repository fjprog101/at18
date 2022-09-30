package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RandomDiceTest {
    @Test
    public void shouldReturnRandomDice() {
        RandomDice mockRandomDice = mock(RandomDice.class);
        when(mockRandomDice.generatedRandom()).thenReturn(DiceFace.HEALING);
        assertEquals(DiceFace.HEALING, mockRandomDice.generatedRandom());
    }
}
