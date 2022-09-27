package jalau.at18.war.view;

import javax.swing.JPanel;

public class DiceLabelGroup extends JPanel {

    public static final int DEFAULT_POSX = 100;
    public static final int DEFAULT_POSY = 50;
    public static final int DEFAULT_WIDTH = 100;
    public static final int DEFAULT_HEIGHT = 20;

    public DiceLabelGroup() {
        add(new DieLabel());
        add(new DieLabel());
        add(new DieLabel());
        setBounds(DEFAULT_POSX, DEFAULT_POSY, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
