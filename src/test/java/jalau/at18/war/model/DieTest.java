package jalau.at18.war.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DieTest {

    @Test
    public void shouldHaveSymbolForDiceFace() {
        Die die1 = new Die(DieFace.ONE);
        Die die2 = new Die(DieFace.TWO);
        Die die3 = new Die(DieFace.THREE);
        Die die4 = new Die(DieFace.FOUR);
        Die die5 = new Die(DieFace.FIVE);
        Die die6 = new Die(DieFace.SIX);

        assertEquals("1", die1.getFace().getSymbol());
        assertEquals("2", die2.getFace().getSymbol());
        assertEquals("3", die3.getFace().getSymbol());
        assertEquals("4", die4.getFace().getSymbol());
        assertEquals("5", die5.getFace().getSymbol());
        assertEquals("6", die6.getFace().getSymbol());
    }

    @Test
    public void shouldSetAndGetADieFace() {
        Die theDie = new Die(DieFace.TWO);
        theDie.setFace(DieFace.ONE);
        assertEquals(DieFace.ONE, theDie.getFace());
    }
}
