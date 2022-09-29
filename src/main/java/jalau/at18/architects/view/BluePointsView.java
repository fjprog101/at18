package jalau.at18.architects.view;

import java.awt.Color;
import javax.swing.JPanel;

public class BluePointsView extends JPanel {
    private static final int WIDTH = 40;
    private static final int HEIGHT = 40;
    private static final int POSITION_X = 800;
    private static final int POSITION_Y = 450;

    public BluePointsView() {
        setBackground(Color.WHITE);
        setBounds(POSITION_X, POSITION_Y, WIDTH, HEIGHT);
        setLayout(null);
        add(new BluePointsNumber());
        add(new BluePointsIcon());
    }
}
