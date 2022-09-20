package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DieLabelTest {

    @Test
    public void dieShouldShowDashByDefault() {
        DieLabel theDie = new DieLabel();
        assertEquals("0", theDie.getText());
    }
}