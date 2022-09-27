package jalau.at18.war.model;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class DieRollerTest {

    @Test
    public void shouldRollADieAndReturnADieFace() {
        DieRoller roller = new DieRoller();
        DieFace dieFaceRolled = roller.roll();
        List<DieFace> acceptedValues = Arrays.asList(DieFace.values());
        assertTrue(acceptedValues.contains(dieFaceRolled));
    }
}
