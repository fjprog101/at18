package jalau.at18.war.view;

import java.util.List;
import javax.swing.JPanel;
import jalau.at18.war.model.Die;

public class DiceLabelGroup extends JPanel {

    public static final int DEFAULT_POSX = 100;
    public static final int DEFAULT_POSY = 50;
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 20;

    /**
     * Create a group of DieLabel objects tha will be shown in
     * UI. By default, three dice are set
     */
    public DiceLabelGroup() {
        add(new DieLabel());
        add(new DieLabel());
        add(new DieLabel());
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public void updateDiceGroup(List<Die> newValues) {
        for (int index = 0; index < getComponentCount(); index++) {
            DieLabel dieLabel = (DieLabel) getComponent(index);
            Die dieSource = newValues.get(index);
            dieLabel.setText(dieSource.getFace().getSymbol());
        }
    }
}
