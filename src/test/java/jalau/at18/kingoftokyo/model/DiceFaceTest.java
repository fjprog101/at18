package jalau.at18.kingoftokyo.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiceFaceTest {
    @Test
    public void shouldHaveNameImagesDiceFace() {
        assertEquals("diceone.png", DiceFace.ONE.getRepresentativeValue());
        assertEquals("dicetwo.png", DiceFace.TWO.getRepresentativeValue());
        assertEquals("dicethree.png", DiceFace.THREE.getRepresentativeValue());
        assertEquals("dicefourhealing.png", DiceFace.HEALING.getRepresentativeValue());
        assertEquals("dicefiveenergy.png", DiceFace.ENERGY.getRepresentativeValue());
        assertEquals("dicesixpunching.png", DiceFace.PUNCHING.getRepresentativeValue());
    }

    @Test
    public void shouldHavePointsDiceFace() {
        assertEquals(1, DiceFace.ONE.getPointValue());
        assertEquals(2, DiceFace.TWO.getPointValue());
        assertEquals(3, DiceFace.THREE.getPointValue());
        assertEquals(1, DiceFace.HEALING.getPointValue());
        assertEquals(1, DiceFace.ENERGY.getPointValue());
        assertEquals(1, DiceFace.PUNCHING.getPointValue());
    }
}
