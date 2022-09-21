package jalau.at18.war.view;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import jalau.at18.war.model.Die;
import jalau.at18.war.model.DieFace;

public class DiceLabelGroupTest {

    @Test
    public void shouldUpdateTextOfDieLabels() {
        DiceLabelGroup dieLabelGroup = new DiceLabelGroup();
        List<Die> newValues = new ArrayList<Die>();
        newValues.add(new Die(DieFace.ONE));
        newValues.add(new Die(DieFace.TWO));
        newValues.add(new Die(DieFace.THREE));

        dieLabelGroup.updateDiceGroup(newValues);

        assertEquals(DieFace.ONE.getSymbol(), ((DieLabel)dieLabelGroup.getComponent(0)).getText());
        assertEquals(DieFace.TWO.getSymbol(), ((DieLabel)dieLabelGroup.getComponent(1)).getText());
        assertEquals(DieFace.THREE.getSymbol(), ((DieLabel)dieLabelGroup.getComponent(2)).getText());
    }
}
