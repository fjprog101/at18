package jalau.at18.architects;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MilitaryStrengthCounterTest {
    @Test
    public void shouldReturnPermanentShield() {
        MilitaryStrengthCounter militaryStrength = new MilitaryStrengthCounter();
        RedCard redCard = new RedCard(2);
        militaryStrength.setMilitaryStrength(redCard);
        assertEquals(0,militaryStrength.getPermanentShield());
        assertEquals(1,militaryStrength.getTemporalShield());

        RedCard redCard1 = new RedCard(0);
        militaryStrength.setMilitaryStrength(redCard1);
        militaryStrength.setMilitaryStrength(redCard1);
        assertEquals(2, militaryStrength.getPermanentShield());
    }
    @Test
    public void shouldReturnTemporalShield() {
        MilitaryStrengthCounter militaryStrength = new MilitaryStrengthCounter();
        RedCard redCard = new RedCard(2);
        militaryStrength.setMilitaryStrength(redCard);
        assertEquals(1,militaryStrength.getTemporalShield());
        militaryStrength.resetTemporalShields();

        RedCard redCard1 = new RedCard(0);
        militaryStrength.setMilitaryStrength(redCard1);
        militaryStrength.setMilitaryStrength(redCard1);
        assertEquals(0, militaryStrength.getTemporalShield());
    }
    @Test
    public void shouldReturnTheMilitaryStrength() {
        MilitaryStrengthCounter militaryStrength = new MilitaryStrengthCounter();
        RedCard redCard = new RedCard(2);
        RedCard redCard1 = new RedCard(0);
        militaryStrength.setMilitaryStrength(redCard);
        militaryStrength.setMilitaryStrength(redCard1);
        assertEquals(2, militaryStrength.getMilitaryStrength());
    }

}
