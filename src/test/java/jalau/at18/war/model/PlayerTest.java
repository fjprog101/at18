package jalau.at18.war.model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void shouldRollDice() {
        // Mock DieRoller
        DieRoller mockedRoller = mock(DieRoller.class);

        // First time roll() is invoked, it will return DieFace.SIX, second call will return DieFace.FOUR and third call will return DieFace.TWO
        when(mockedRoller.roll()).thenReturn(DieFace.SIX, DieFace.FOUR, DieFace.TWO);

        Player player =  new Player(mockedRoller);
        player.addDie(new Die(DieFace.ONE));
        player.addDie(new Die(DieFace.ONE));
        player.addDie(new Die(DieFace.ONE));
        List<Die> result = player.rollDice();

        assertEquals(DieFace.SIX, result.get(0).getFace());
        assertEquals(DieFace.FOUR, result.get(1).getFace());
        assertEquals(DieFace.TWO, result.get(2).getFace());
    }
}
